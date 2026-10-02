import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Easy4 implements ActionListener {
    private JFrame mainFrame;
    private JLabel statusLabel;
    private JPanel controlPanel;
    private JMenuBar mb;
    private JMenu file, edit, help;
    private JMenuItem cut, copy, paste, selectAll;
    private JTextArea ta; //typing area
    private int WIDTH=800;
    private int HEIGHT=700;


    public Easy4() {
        prepareGUI();
    }

    public static void main(String[] args) {
        Easy4 swingControlDemo = new Easy4();
        swingControlDemo.showEventDemo();
    }

    private void prepareGUI() {
        mainFrame = new JFrame("Java SWING Examples");
        mainFrame.setSize(WIDTH, HEIGHT);
        mainFrame.setLayout(new GridLayout(3,3));

        /*//menu at top
        cut = new JMenuItem("cut");
        copy = new JMenuItem("copy");
        paste = new JMenuItem("paste");
        selectAll = new JMenuItem("selectAll");
        cut.addActionListener(this);
        copy.addActionListener(this);
        paste.addActionListener(this);
        selectAll.addActionListener(this);

        mb = new JMenuBar();
        file = new JMenu("File");
        edit = new JMenu("Edit");
        help = new JMenu("Help");
        edit.add(cut);
        edit.add(copy);
        edit.add(paste);
        edit.add(selectAll);
        mb.add(file);
        mb.add(edit);
        mb.add(help);
        //end menu at top



        ta = new JTextArea();
        ta.setBounds(50, 5, WIDTH-100, HEIGHT-50);
        mainFrame.add(mb);  //add menu bar
        mainFrame.add(ta);//add typing area
        mainFrame.setJMenuBar(mb); //set menu bar

         */

        statusLabel = new JLabel("label 1", JLabel.CENTER);

        mainFrame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent windowEvent) {
                System.exit(0);
            }
        });
        controlPanel = new JPanel();
        controlPanel.setLayout(new BorderLayout()); //set the layout of the panel

        mainFrame.setVisible(true);
    }

    private void showEventDemo() {

        JButton button1 = new JButton("Button 1");
        JButton button2 = new JButton("Button 2");
        JButton button3 = new JButton("Button 3");
        JButton button4 = new JButton("Button 4");
        JButton button5 = new JButton("Button 5");
        JButton button6 = new JButton("Button 6");
        JButton button7 = new JButton("Button 7");
        JButton button8 = new JButton("Button 8");
        JButton button9 = new JButton("Button 9");
        JButton button10 = new JButton("Button 10");


        button1.setActionCommand("Button 1");
        button2.setActionCommand("Button 2");
        button3.setActionCommand("Button 3");
        button4.setActionCommand("Button 4");
        button5.setActionCommand("Button 5");
        button3.setActionCommand("Button 6");
        button4.setActionCommand("Button 7");
        button5.setActionCommand("Button 8");
        button4.setActionCommand("Button 9");
        button5.setActionCommand("Button 10");

        button1.addActionListener(new Easy4.ButtonClickListener());
        button2.addActionListener(new Easy4.ButtonClickListener());
        button3.addActionListener(new Easy4.ButtonClickListener());
        button4.addActionListener(new Easy4.ButtonClickListener());
        button5.addActionListener(new Easy4.ButtonClickListener());
        button6.addActionListener(new Easy4.ButtonClickListener());
        button7.addActionListener(new Easy4.ButtonClickListener());
        button8.addActionListener(new Easy4.ButtonClickListener());
        button9.addActionListener(new Easy4.ButtonClickListener());
        button10.addActionListener(new Easy4.ButtonClickListener());


        mainFrame.add(button1);
        mainFrame.add(button2);
        mainFrame.add(button3);
        mainFrame.add(button4);
        mainFrame.add(controlPanel);
        controlPanel.add(statusLabel);
        controlPanel.add(button9, BorderLayout.EAST);
        controlPanel.add(button10,BorderLayout.SOUTH);
        mainFrame.add(button5);
        mainFrame.add(button6);
        mainFrame.add(button7);
        mainFrame.add(button8);




        mainFrame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == cut)
            ta.cut();
        if (e.getSource() == paste)
            ta.paste();
        if (e.getSource() == copy)
            ta.copy();
        if (e.getSource() == selectAll)
            ta.selectAll();
    }

    private class ButtonClickListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String command = e.getActionCommand();

            if (command.equals("OK")) {
                statusLabel.setText("Ok Button clicked.");
            } else if (command.equals("Submit")) {
                statusLabel.setText("Submit Button clicked.");
            } else {
                statusLabel.setText("Cancel Button clicked.");
            }
        }
    }
}