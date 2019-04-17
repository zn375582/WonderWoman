import java.awt.Color;
import java.awt.Point;

public class Rectangle extends Polygon{

	
	/**
	 * 
	 * @param pointUL - Upper left corner of the rectangle
	 * @param width - width of rectangle
	 * @param height - height of rectangle
	 * @param color - desired color of rectangle
	 * @param filled - Whether or not the rectangle should be filled solid
	 */
	public Rectangle(Point pointUL, int width, int height, Color color, boolean filled)
	{
		super(color, filled);
		location = new Point[4];
		location[0] = pointUL;
		location[1] = new Point(pointUL.x + width, pointUL.y);
		location[2] = new Point(pointUL.x + width, pointUL.y + height);
		location[3] = new Point(pointUL.x, pointUL.y + height);
		
	}
}
