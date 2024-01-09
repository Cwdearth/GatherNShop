package gathershop.screens;
import javax.imageio.ImageIO;
import javax.swing.*;
import java.io.File;
import java.awt.*;
import java.io.IOException;
import java.util.Objects;

public class Screen
{
    public Screen(String screenName, String iconName) {
        JFrame gameFrame = new JFrame(Objects.requireNonNull(screenName, "ScreenName cannot be null!"));
        JPanel gamePanel = new JPanel();

        try {
            File pathToFile = new File("src/main/resources/" + iconName);
            gameFrame.setIconImage(Objects.requireNonNull(ImageIO.read(pathToFile)));
        } catch (IOException ex) {
            ex.printStackTrace();
        }

        gameFrame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        gameFrame.setMinimumSize(new Dimension(768 ,432));
        gameFrame.add(gamePanel);
        gameFrame.setVisible(true);
    }
}
