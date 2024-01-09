package org.students;
import javax.swing.*;


public class App
{
    public static void main( String[] args )
    {
        JFrame gameFrame = new JFrame("GatherNCraft");
        JPanel gamePanel = new JPanel();

        gameFrame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        gameFrame.add(gamePanel);
        gameFrame.setVisible(true);
    }
}
