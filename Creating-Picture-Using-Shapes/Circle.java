import java.awt.*;
import java.awt.geom.*;

public class Circle
{
    private int diameter;
    private int xPosition;
    private int yPosition;
    private String color;
    private boolean isVisible;
    private Canvas canvas;
    
    /**
     * Create a new circle at default position with default color.
     */
    public Circle(Canvas canvas)
    {
        diameter = 30;
        xPosition = 50;
        yPosition = 50;
        color = "blue";
        isVisible = false;
        this.canvas = canvas;
      }

    /**
     * Make this circle visible. If it was already visible, do nothing.
     */
    public void makeVisible()
    {
        if (!canvas.getVisible()){
            canvas.setVisible(true);
        }
        this.isVisible = true;
        draw();
    }
    
    /**
     * Make this circle invisible. If it was already invisible, do nothing.
     */
    public void makeInvisible()
    {
        erase();
        isVisible = false;
    }
    
    /**
     * Move to the location defined by newXPosition and newYPosition
     * @param  newXPosition x coordinate to move to
     * @param  newYPosition y coordinate to move to
     */
    public void moveTo(int newXPosition, int newYPosition)
    {
       erase();
       yPosition = newYPosition;
       xPosition = newXPosition;
       draw();
   }

    /**
     * Move in the direction defined by xDistance and yDistance
     * @param  xDistance  how far to move in the horizontal direction
     * @param  xDistance  how far to move in the verticalal direction
     */
    public void moveDirection(int xDistance, int yDistance)
    {
       erase();
       yPosition += yDistance;
       xPosition += xDistance;
       draw();
   }
        
    /**
     * Change the size to the new size (in pixels). newDiameter must be >= 0.
     */
    public void changeSize(int newDiameter)
    {
        erase();
        diameter = newDiameter;
        draw();
    }

    /**
     * Change the color. Valid colors are "red", "yellow", "blue", "green",
     * "magenta" and "black".
     */
    public void changeColor(String newColor)
    {
        color = newColor;
        draw();
    }

    /**
     * Draw the circle with current specifications on screen.
     */
    private void draw()
    {
        if(isVisible) {
            canvas.draw(this, color, new Ellipse2D.Double(xPosition-diameter/2, yPosition-diameter/2, 
                                                          diameter, diameter));
        }
    }

    /**
     * Erase the circle on screen.
     */
    public void erase()
    {
        if(isVisible) {
            canvas.erase(this);
        }
    }

    /**
     * @return diameter - the "size" of the circle
     */
    public int getDiameter()
    {
        return diameter;
    }

    /**
     * @return xPosition - the x coordinate of the center of the circle.
     */
    public int getXPosition()
    {
        return xPosition;
    }
    
    /**
     * @return yPosition - the y coordinate of the center of the circle.
     */
    public int getYPosition()
    {
        return yPosition;
    }
}
