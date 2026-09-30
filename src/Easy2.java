import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Easy2 implements ActionListener {
    private JFrame mainFrame;
    // private JLabel statusLabel;
    //private JPanel controlPanel;
    private int WIDTH=800;
    private int HEIGHT=700;


    public Easy2() {
        prepareGUI();
    }

    public static void main(String[] args) {
        Easy2 swingControlDemo = new Easy2();
        swingControlDemo.showEventDemo();
    }

    private void prepareGUI() {
        mainFrame = new JFrame("Java SWING Examples");
        mainFrame.setSize(WIDTH, HEIGHT);
        mainFrame.setLayout(new BorderLayout());


        // statusLabel = new JLabel("", JLabel.CENTER);
        // statusLabel.setSize(350, 100);

        mainFrame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent windowEvent) {
                System.exit(0);
            }
        });
        // controlPanel = new JPanel();
        //controlPanel.setLayout(new BorderLayout()); //set the layout of the pannel
        // mainFrame.add(statusLabel);
        // mainFrame.add(controlPanel);

        mainFrame.setVisible(true);
    }

    private void showEventDemo() {

        JButton button1 = new JButton("Button 1");
        JButton button2 = new JButton("Button 2");
        JButton button3 = new JButton("Button 3");
        JButton button4 = new JButton("Button 4");
        JButton button5 = new JButton("Button 5");


        button1.setActionCommand("Button 1");
        button2.setActionCommand("Button 2");
        button3.setActionCommand("Button 3");
        button4.setActionCommand("Button 4");
        button5.setActionCommand("Button 5");

        button1.addActionListener(new ButtonClickListener());
        button2.addActionListener(new ButtonClickListener());
        button3.addActionListener(new ButtonClickListener());
        button4.addActionListener(new ButtonClickListener());
        button5.addActionListener(new ButtonClickListener());

        mainFrame.add(button1, BorderLayout.NORTH);
        mainFrame.add(button2, BorderLayout.WEST);
        mainFrame.add(button3, BorderLayout.CENTER);
        mainFrame.add(button4, BorderLayout.EAST);
        mainFrame.add(button5, BorderLayout.SOUTH);


        mainFrame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }

    private class ButtonClickListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String command = e.getActionCommand();

           /* if (command.equals("OK")) {
                statusLabel.setText("Ok Button clicked.");
            } else if (command.equals("Submit")) {
                statusLabel.setText("Submit Button clicked.");
            } else {
                statusLabel.setText("Cancel Button clicked.");
            }

            */
        }
    }
}