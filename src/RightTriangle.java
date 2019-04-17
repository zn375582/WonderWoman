import java.awt.Color;
import java.awt.Point;

public class RightTriangle extends Triangle{

	/**
	 * Triangle constructor
	 * @param pointRA - The vertex of the right triangle that has the right angle.
	 * @param base - The width of the base. Positive widths correspond to 2nd vertex 
	 * being to the right of this vertex; negative widths correspond to the 2nd vertex being to the left.
	 * @param height - The height at the apex of the triangle. Positive heights correspond to the vertex 
	 * being placed below the base; negative heights correspond to the vertex being placed above the base.
	 * @param color -  Desired color of the triangle.
	 * @param fill - Whether or not the triangle should be filled.
	 */
	public RightTriangle(Point pointRA, int base, int height, Color color, boolean fill)
	{
		super(pointRA, color, fill);
		location[1] = new Point(pointRA.x + base, pointRA.y);
		location[2] = new Point(pointRA.x, pointRA.y + height);
		
	}
}
