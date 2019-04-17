import java.awt.Color;
import java.awt.Point;

/**
 * Class to create Square
 * 
 * @author Nicole Zimmerer
 * @version April 16, 2019
 * Lab 10
 */
public class Square extends Rectangle {

	/**
	 * use width to find the UR, LL, and LR points
	 */
	public Square(Point pointUL, int width, Color color, boolean filled)
	{
		super(pointUL, width, width, color, filled);
	}
}
