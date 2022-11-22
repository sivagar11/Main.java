package project;

import javax.swing.*;


public class Main extends JFrame {
    Main()
    {
        this.setTitle("Snake Realin");
        this.add(new Snake());
        this.pack();
        this.setResizable(false);
        this.setVisible(true);
        this.setLocationRelativeTo(null);
    }

    public static void main(String[] args)
    {
        new Main();
    }

}