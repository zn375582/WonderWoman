import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;

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
		super(color, filled);
		diameter1 = d1;
		diameter2 = d2;
		location = new Point[1];
		location[0] = pointUL;
	}
	
	/**
	 * 
	 * @return length of Diameter1
	 */
	public int getDiameter1()
	{
		return diameter1;
	}
	
	/**
	 * 
	 * @return length of Diameter2
	 */
	public int getDiameter2()
	{
		return diameter2;
	}
	
	/**
	 *  This method takes a graphics object 
	 *  to perform the drawing, places the points of the oval and fills 
	 *  it with the color if filled is true.
	 * @param graphics
	 */
	public void draw(Graphics graphics)
	{
		Graphics2D g = (Graphics2D)graphics;
		
		g.setColor(this.getColor());
		g.drawOval(location[0].x, location[0].y, diameter1, diameter2);
		
		if (this.isFilled() == true)
		{
			g.fillOval(location[0].x, location[0].y, diameter1, diameter2);
		}
	}
	
	
	
	
	
}
