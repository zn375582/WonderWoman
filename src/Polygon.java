import java.awt.Graphics;

public abstract class Polygon extends Shape{

	/**
	 * 
	 * @param color - inherited from shape
	 * @param filled - inherited from shape
	 */
	public Polygon(Color color, boolean filled)
	{
		super();
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
		if (graphics.getFilled == true)
		{
			graphics.setColor(graphics.getColor());
			graphics.drawPolygon(graphics);
			graphics.fillPolygon();
		}
	}
}
