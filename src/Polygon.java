import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

/**
 * Abstract Class to represent a Polygon
 * 
 * @author Nicole Zimmerer
 * @version April 16, 2019
 * Lab 10
 */
public abstract class Polygon extends Shape{

	/**
	 * 
	 * @param color - inherited from shape
	 * @param filled - inherited from shape
	 */
	public Polygon(Color color, boolean filled)
	{
		super(color, filled);
	}
	
	/**
	 * This method defines how to draw a polygon, by constructing 
	 * a convex shape with the location of the points as vertices, 
	 * and fills in the space with the color if filed is true. 
	 * See Java api for Graphics on how to draw polygons
	 * @param graphics - A Graphics object for drawing the shapes
	 */
	public void draw(Graphics graphics)
	{
		Graphics2D polygon = (Graphics2D) graphics;
		polygon.setColor(this.getColor());
		/**
		 * store the x values of location in xPoints
		 * store the y values of location in yPoints
		 */
		int[] xPoints = new int[location.length];
		int[] yPoints = new int[location.length];
		for(int i = 0; i < location.length; ++i)
		{
			xPoints[i] = location[i].x;
			yPoints[i] = location[i].y;
		}
		
		/**
		 * draw the polygon using the arrays created.
		 */
		int nPoints = location.length;
		polygon.drawPolygon(xPoints, yPoints, nPoints);
		
		
		if (this.isFilled() == true)
		{
			polygon.fillPolygon(xPoints, yPoints, nPoints);
		}
	}
}
