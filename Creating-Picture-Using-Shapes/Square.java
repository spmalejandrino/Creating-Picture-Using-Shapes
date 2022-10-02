import java.awt.*;

public class Square
{
    private int size;
    private int xPosition;
    private int yPosition;
    private String color;
    private boolean isVisible;
    private Canvas canvas;

    /**
     * Create a new square at default position with default color.
     */
    public Square(Canvas canvas)
    {
        size = 30;
        xPosition = 60;
        yPosition = 50;
        color = "red";
        isVisible = false;
        this.canvas = canvas;
    }

    /**
     * Make this square visible. If it was already visible, do nothing.
     */
    public void makeVisible()
    {
        if (!canvas.getVisible()){
            canvas.setVisible(true);
        }
        isVisible = true;
        draw();
    }
    
    /**
     * Make this square invisible. If it was already invisible, do nothing.
     */
    public void makeInvisible()
    {
        erase();
        isVisible = false;
    }
    
     /**
     * Move to the location defined by newXCoord and newYCoord
     * @param  newXCoord x coordinate to move to
     * @param  newYCoord y coordinate to move to
     */
    public void moveTo(int newXCoord, int newYCoord)
    {
       erase();
       yPosition = newYCoord;
       xPosition = newXCoord;
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
     * Change the size to the new size (in pixels). newSize must be >= 0.
     */
    public void changeSize(int newSize)
    {
        erase();
        size = newSize;
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
     * Draw the square with current specifications on screen.
     */
    private void draw()
    {
        if(isVisible) {
            canvas.draw(this, color,
                        new Rectangle(xPosition, yPosition, size, size));
            canvas.wait(10);
        }
    }

    /**
     * Erase the square on screen.
     */
    public void erase()
    {
        if(isVisible) {
            canvas.erase(this);
        }
    }

    /**
     * @return size - the size of the square.
     */
    public int getSize()
    {
        return size;
    }
    
    /**
     * @return xPosition - the x coordinate of the upper-left corner of the square.
     */
    public int getXPosition()
    {
        return xPosition;
    }
    
    /**
     * @return yPosition - the y coordinate of the upper-left corner of the square.
     */
    public int getYPosition()
    {
        return yPosition;
    }
    
}
