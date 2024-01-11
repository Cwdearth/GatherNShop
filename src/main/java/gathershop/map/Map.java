package gathershop.map;
import javax.imageio.ImageIO;
import javax.swing.*;
import java.io.File;
import java.awt.*;
import java.io.IOException;
import java.util.Objects;

public class Map {
JFrame mapFrame;
    public Map() {

        int[][] mapMatrix = new int[2][2];
        int[][] mapMatrixtest = {{0,0,0,0},
                {0,0,0,0},
                {0,0,0,0},
                {0,0,0,1}};
        for (int i = 0; i < mapMatrixtest.length; i++){
            System.out.print("row" + i + " : ");
            for (int j = 0; j < mapMatrixtest[i].length; j++){
                System.out.print("col " + j + " : " + mapMatrixtest[j]);
            }
            System.out.println();
        }
        mapFrame = new JFrame();
        /*
        JButton btn1 = new JButton("1");
        JButton btn2 = new JButton("2");
        JButton btn3 = new JButton("3");
        JButton btn4 = new JButton("4");
        JButton btn5 = new JButton("5");
        JButton btn6 = new JButton("6");
        JButton btn7 = new JButton("7");
        JButton btn8 = new JButton("8");
        JButton btn9 = new JButton("9");
        mapFrame.add(btn1);mapFrame.add(btn2);mapFrame.add(btn3);
        mapFrame.add(btn4);mapFrame.add(btn5);mapFrame.add(btn6);
        mapFrame.add(btn7);mapFrame.add(btn8);mapFrame.add(btn9);
        */
        JPanel pnl1 = new JPanel();
        pnl1.setBackground(Color.blue);
        JPanel pnl2 = new JPanel();
        pnl2.setBackground(Color.orange);
        JPanel pnl3 = new JPanel();
        JPanel pnl4 = new JPanel();
        JPanel pnl5 = new JPanel();
        JPanel pnl6 = new JPanel();
        JPanel pnl7 = new JPanel();
        JPanel pnl8 = new JPanel();
        JPanel pnl9 = new JPanel();
        mapFrame.add(pnl1);mapFrame.add(pnl2);mapFrame.add(pnl3);
        mapFrame.add(pnl4);mapFrame.add(pnl5);mapFrame.add(pnl6);
        mapFrame.add(pnl7);mapFrame.add(pnl8);mapFrame.add(pnl9);

        mapFrame.setLayout(new GridLayout(3,3));
        mapFrame.setSize(300,300);
        mapFrame.setVisible(true);

    }
    public static void main(String[] args) {
        new Map();
    }

}
