import java.awt.Graphics;

public class Oval extends Shape{

	/**
	 * width and length of oval
	 */
	private int diameter1;
	private int diameter2;
	
	/**
	 * 
	 * @param pointUL - first point stored in Point[] location from Shape
	 * @param d1 - diameter1
	 * @param d2 - diameter2
	 * @param color - called from Shape
	 * @param filled - called from Shape
	 */
	public Oval(Point pointUL, int d1, int d2, Color color, boolean filled)
	{
		super();
		d1 = diameter1;
		d2 = diameter2;
		pointUL = location[0];
	}
	
	/**
	 * 
	 * @return length of Diameter1
	 */
	public int getDiameter1()
	{
		return d1;
	}
	
	/**
	 * 
	 * @return length of Diameter2
	 */
	public int getDiameter2()
	{
		return d2;
	}
	
	/**
	 *  This method takes a graphics object 
	 *  to perform the drawing, places the points of the oval and fills 
	 *  it with the color if filled is true.
	 * @param graphics
	 */
	public void draw(Graphics graphics)
	{
		if (graphics.getFilled == true)
		{
			graphics.setColor(graphics.getColor());
			graphics.fillOval(pointUL.x, pointUL.y, diameter1, diameter2);
		}
	}
	
	
	
	
	
}
