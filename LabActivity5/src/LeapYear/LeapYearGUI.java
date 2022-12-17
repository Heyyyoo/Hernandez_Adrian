package LeapYear;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class LeapYearGUI extends JFrame {
    private JPanel panel1;
    private JTextField tfYear;
    private JButton btnCheckYear;
    private JLabel inputYearLabel;
    private JPanel panel2;

    private String year;

    public LeapYearGUI() {

        btnCheckYear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!(year.isBlank())) {
                    int year_int = Integer.parseInt(tfYear.getText());
                    if(year_int % 4==0){
                        JOptionPane.showMessageDialog(null, year + " is a leap year");
                    }
                    else {
                        JOptionPane.showMessageDialog(null, year + " is not a leap year");
                    }
                }
                else {
                    JOptionPane.showMessageDialog(null, " Text Field is empty");
                }
            }
        });
        tfYear.addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent e) {
                year = tfYear.getText();
            }
        });
    }
    private void createUIComponents() {
        // TODO: place custom component creation code here
//        tfYear = new JTextField();
        panel1 = new JPanel();
        panel2 = new JPanel();
        inputYearLabel = new JLabel();


    }

    public static void main(String[] args) {
        LeapYearGUI frame = new LeapYearGUI();

        frame.setContentPane(frame.panel1);
        frame.setTitle("Leap Year Checker");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.createUIComponents();
        frame.setSize(300, 300);
        frame.setVisible(true);
    }
}