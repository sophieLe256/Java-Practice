package game.FlappyBird;
import javax.swing.*;
import java.awt.Graphics;
import javax.swing.JPanel;

public class Renderer extends JPanel {
    public static final long serialVersionUID = 1L;

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g); //calling JPanel of this class

        FlappyBird.flappyBird.repaint(g);
    }
}
