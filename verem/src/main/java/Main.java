import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        // Create a swing window 1000x1000 with center textbox and button
        JFrame frame = new JFrame("JABBA BUZI");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        frame.setLayout(null);
        //Create a centered textbox
        JTextField textField = new JTextField();
        textField.setText("0");
        textField.setBounds(100, 100, 200, 30);
        frame.add(textField);
        //Create a centered button
        JButton button = new JButton("Push");
        button.setBounds(100, 200, 200, 30);
        frame.add(button);
        //Create counter event on button to textfield
        button.addActionListener(e -> {
            int tfvalue = Integer.parseInt(textField.getText());
            textField.setText("");
            textField.setText(String.valueOf(tfvalue + 1)+"");
        });
        frame.setVisible(true);

    }
}
