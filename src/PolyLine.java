import java.awt.Color;
import java.awt.Point;

/**
 * Class to create PolyLines
 * 
 * @author Nicole Zimmerer
 * @version April 16, 2019
 * Lab 10
 */
public class PolyLine extends Polygon{

	/**
	 * Constructor for PolyLine. Inherits color and filled from super class.
	 * Creates Lower left and right points.
	 * @param pointUL - Upper left point
	 * @param pointUR - Upper right point.
	 * @param thickness - The number of pixels below the first line that the second 
	 * line appears. Note that if a negative value is given, the second line will be above the first line.
	 * @param color - inherited from super class
	 * @param filled - inherited from super class
	 */
	public PolyLine(Point pointUL, Point pointUR, int thickness, Color color, boolean filled)
	{
		super(color, filled);
		location = new Point[4];
		location[0] = pointUL;
		location[1] = pointUR;
		location[2] = new Point(pointUR.x, pointUR.y + thickness);
		location[3] = new Point(pointUL.x, pointUL.y + thickness);
	}
}
