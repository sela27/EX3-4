package GUI;

import javax.swing.*;

public class main
{
    public static void main(String[] args)
    {
        MyFrame frame = new MyFrame();
        frame.setVisible(true);
        frame.setSize(frame.getMapImg().getWidth(),frame.getMapImg().getHeight());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}