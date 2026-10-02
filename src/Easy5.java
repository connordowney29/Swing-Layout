import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Easy5 implements ActionListener {
    private JFrame mainFrame;
    private JLabel statusLabel;
    private JLabel statusLabel1;
    private JLabel statusLabel2;
    private JLabel statusLabel3;
    private JLabel statusLabel4;
    private JPanel controlPanel;
    private JMenuBar mb;
    private JMenu file, edit, help;
    private JMenuItem cut, copy, paste, selectAll;
    private JTextArea ta; //typing area
    private int WIDTH=800;
    private int HEIGHT=700;


    public Easy5() {
        prepareGUI();
    }

    public static void main(String[] args) {
        Easy5 swingControlDemo = new Easy5();
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

        statusLabel = new JLabel("Top 0", JLabel.CENTER);
        statusLabel1 = new JLabel("Top 0", JLabel.CENTER);
        statusLabel2 = new JLabel("Top 0", JLabel.CENTER);
        statusLabel3 = new JLabel("Top 0", JLabel.CENTER);
        statusLabel4 = new JLabel("Top 0", JLabel.CENTER);

        mainFrame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent windowEvent) {
                System.exit(0);
            }
        });
        controlPanel = new JPanel();
        controlPanel.setLayout(new GridLayout(3,3)); //set the layout of the panel

        mainFrame.setVisible(true);
    }

    private void showEventDemo() {

        JButton button1 = new JButton("Top 1");
        JButton button2 = new JButton("Top 2");
        JButton button3 = new JButton("Top 3");
        JButton button4 = new JButton("Top 4");



        button1.setActionCommand("Top 1");
        button2.setActionCommand("Top 2");
        button3.setActionCommand("Top 3");
        button4.setActionCommand("Top 4");


        button1.addActionListener(new Easy5.ButtonClickListener());
        button2.addActionListener(new Easy5.ButtonClickListener());
        button3.addActionListener(new Easy5.ButtonClickListener());
        button4.addActionListener(new Easy5.ButtonClickListener());

        mainFrame.add(controlPanel);
        controlPanel.add(statusLabel);
        mainFrame.add(button1);
        controlPanel.add(statusLabel1);
        mainFrame.add(button2);
        controlPanel.add(statusLabel2);
        mainFrame.add(button3);
        controlPanel.add(statusLabel3);
        mainFrame.add(button4);
        controlPanel.add(statusLabel4);






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