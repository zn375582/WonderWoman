import java.awt.Color;
import java.awt.Point;

public class PolyLine extends Polygon{

	public PolyLine(Point pointUL, Point pointUR, int thickness, Color color, boolean filled)
	{
		super(color, filled);
		location[0] = pointUL;
		location[1] = pointUR;
		location[2] = new Point(pointUR.x, pointUR.y + thickness);
		location[3] = new Point(pointUL.x, pointUL.y + thickness);
	}
}
