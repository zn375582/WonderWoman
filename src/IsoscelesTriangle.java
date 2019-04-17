import java.awt.Color;
import java.awt.Point;

public class IsoscelesTriangle extends Triangle{

	/**
	 * Triangle constructor
	 * @param pointLB - The point on the base of an isosceles triangle that is NOT the right angle
	 * @param base - The width of the base.
	 * @param height - The height at the apex of the triangle (negative to flip the orientation).
	 * @param color - Desired color of the triangle.
	 * @param filled - Whether or not the triangle should be filled.
	 */
	public IsoscelesTriangle(Point pointLB, int base, int height, Color color, boolean filled) {
		super(pointLB, color, filled);
		location[1] = new Point(pointLB.x + base, pointLB.y);
		location[2] = new Point(pointLB.x + (base / 2), pointLB.y + (-1 * height));
	}

}
