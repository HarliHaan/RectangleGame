import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Main {
    public static void main(String[] args) {
        JFrame jf = new JFrame();
        Game myGame = new Game();
        jf.add(myGame);
        jf.setSize(700, 700);
        jf.setVisible(true);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

class Game extends JPanel implements KeyListener {
    // Initial position of the rectangle
    int left_side = 0;
    int top_side = 0;

    public Game() {
        addKeyListener(this); // Add the key listener to the panel
        setFocusable(true); // Make the panel focusable2
        requestFocusInWindow(); // Request focus for key events
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g); // Call superclass method

        g.setColor(Color.BLUE); // Set the color to blue
        g.fillRect(left_side, top_side, 50, 50); // Draw the rectangle
    }

    @Override
    public void keyTyped(KeyEvent e) {
        // No action needed for keyTyped event
    }

    @Override
    public void keyPressed(KeyEvent e) {
        int key = e.getKeyCode();

        // Move the rectangle based on arrow key inputs
        if (key == KeyEvent.VK_DOWN) {
            if (top_side < 650) {
                top_side += 50;
            }
        } else if (key == KeyEvent.VK_UP) {
            if (top_side > 0) {
                top_side -= 50;
            }
        } else if (key == KeyEvent.VK_RIGHT) {
            if (left_side < 650) {
                left_side += 50;
            }
        } else if (key == KeyEvent.VK_LEFT) {
            if (left_side > 0) {
                left_side -= 50;
            }
        }

        System.out.format("Position...  (%d, %d)\n", left_side, top_side); // Print the current position
        repaint(); // Repaint the panel to update the rectangle's position
    }

    @Override
    public void keyReleased(KeyEvent e) {
        // No action needed for keyReleased event
    }
}
