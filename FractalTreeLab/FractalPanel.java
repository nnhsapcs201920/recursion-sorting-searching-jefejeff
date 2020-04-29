import java.awt.*;
import javax.swing.JPanel;
import java.awt.geom.Line2D;

/**
 * A panel for the fractal tree
 *
 * @author jcheng3
 * @version 4/28/2020
 */
public class FractalPanel extends JPanel
{
    private int panelW = 300;
    private int panelH = 400;
    /**
     * A constructor for the FractalPanel
     */
    public FractalPanel()
    {  
        this.setBackground (Color.black);
        this.setPreferredSize (new Dimension(panelW, panelH));
    }

    /**
     * A method to draw the fractal tree recursively by branch
     * 
     * @param x         the initial x coordinate of the line
     * @param y         the initial y coordinate of the line
     * @param length    the length of the line
     * @param angle     the angle that the next branch changes by (both up and down)
     * @param g         the graphics object that we are drawing on
     */
    public void drawBranch(double x, double y, double length, double angle, Graphics g)
    {
        Graphics2D g2 = (Graphics2D) g;
        g2.setColor (Color.blue);
        double x1, y1;
        if(length < 10)
        {
            return;
        }
        else
        {
            x1 = x + length * Math.cos((Math.toRadians(angle)));
            y1 = y - length * Math.sin((Math.toRadians(angle)));
            Line2D.Double branch = new Line2D.Double(x, y, x1, y1);
            g2.draw(branch);
            drawBranch(x1, y1, length * .8, angle + 35, g);
            drawBranch(x1, y1, length * .8, angle - 35, g);
        }
    }

    /**
     * Draws the tree, overriding the paintComponent method
     * @param g         the graphics object that we are drawing on
     */
    @Override
    public void paintComponent (Graphics g)
    {
        super.paintComponent (g);
        this.drawBranch(150, 300, 50, 90, g);
    }
}
