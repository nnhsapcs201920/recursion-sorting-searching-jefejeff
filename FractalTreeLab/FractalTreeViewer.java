import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 * A viewer for the fractal tree
 *
 * @author jcheng3
 * @version 4/28/2020
 */
public class FractalTreeViewer
{
    private final int WIDTH = 400;
    private final int HEIGHT = 500;

    private FractalPanel drawing;
    private JPanel panel;
    private JFrame frame;

    /**
     * Main method for the viewer, displays the tree
     */
    public static void main(String[] args)
    {
        FractalTreeViewer viewer = new FractalTreeViewer();
    }

    /**
     * Constructor for the viewer, adds all elements and allows us to see
     */
    public FractalTreeViewer()
    {
        drawing = new FractalPanel();
        panel = new JPanel();
        panel.add (drawing);
        frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(WIDTH, HEIGHT);
        frame.add(panel);
        frame.setVisible(true);
    }
}
