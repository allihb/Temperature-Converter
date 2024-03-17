import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

public class myFrame extends JFrame implements ActionListener{

    //establish variables
    JButton buttonC, buttonF;
    JTextField textField;
    JLabel displayText;
    String usrinput = "0.0";
    DecimalFormat df = new DecimalFormat("#.##");
    double result;

    myFrame(){

        //create a display explaining instructions
        displayText = new JLabel("Enter the value you would like to convert.", JLabel.CENTER);
        displayText.setBounds(75, 0, 650, 50);

        //create a text field for a user ot input
        textField = new JTextField();
        textField.setBounds(350, 100, 100, 50);

        //Creates a button and converts the value in the text field into fahrenheit from celsius
        buttonC = new JButton("Celsius to Fahrenheit");
        buttonC.setBounds(150, 200, 200, 50);
        buttonC.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                usrinput = textField.getText();
                result = (Double.parseDouble(usrinput) * (9.0/5.0) + 32);
                JOptionPane.showMessageDialog(null,("The temperature in degrees Fahrenheit is " + df.format(result) + " degrees."));
            }
        });

        //Creates a button and converts the value in the text field into fahrenheit from celsius
        buttonF = new JButton("Fahrenheit to Celsius");
        buttonF.setBounds(450, 200, 200, 50);
        buttonF.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                usrinput = textField.getText();
                result = (Double.parseDouble(usrinput) - 32) * (5.0/9.0);
                JOptionPane.showMessageDialog(null,("The temperature in degrees Celsius is " + df.format(result) + " degrees."));
            }
        });
    
        //create the GUI
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.add(displayText);
        this.add(textField);
        this.add(buttonC);
        this.add(buttonF);
        this.setSize(850, 400);
        this.setLayout(null);
        this.setVisible(true);


}

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'actionPerformed'");
    }
}
