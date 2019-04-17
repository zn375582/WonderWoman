import java.awt.Color;
import java.awt.Point;

import org.junit.Assert;

import org.junit.Test;

/**
 * Test cases for the Isosceles Triangle
 * 
 * 
 * @author Nicole Zimmerer
 * @version April 16, 2019
 * Lab 10
 */
public class IsoscelesTriangleTest {

	private static IsoscelesTriangle t1 = new IsoscelesTriangle(new Point(0, 0), 60, -80, Color.BLUE, true);
	private static Point base1 = new Point(0, 0);
	private static Point base2 = new Point(60, 0);
	private static Point point1 = new Point(30, 80);
	private static IsoscelesTriangle t2 = new IsoscelesTriangle(new Point(200, 300), 40, -100, Color.GREEN, false);
	private static Point base3 = new Point(200, 300);
	private static Point base4 = new Point(240, 300);
	private static Point point2 = new Point(220, 400);
	
	/**
     * Verify the points defining the right triangle are determined correctly
     * The vertex locations, base, height, color, and fill flag
     */
	@Test
	public void test() {
		//test points
		Point[] pts1 = t1.getLocation();
		Assert.assertEquals(3, pts1.length);
		Assert.assertTrue(ShapeUtils.pointInSet(pts1, base1));
		Assert.assertTrue(ShapeUtils.pointInSet(pts1, base2, 1));
		Assert.assertTrue(ShapeUtils.pointInSet(pts1, point1));
						        
		Point[] pts2 = t2.getLocation();
		Assert.assertEquals(3, pts2.length);
		Assert.assertTrue(ShapeUtils.pointInSet(pts2, base3));
		Assert.assertTrue(ShapeUtils.pointInSet(pts2, base4, 1));
		Assert.assertTrue(ShapeUtils.pointInSet(pts2, point2));
						
		//test if filled
		Assert.assertTrue(t1.isFilled());
		Assert.assertFalse(t2.isFilled());
						
		//test color
		Color c1 = t1.getColor();
		Color c2 = t2.getColor();
		Assert.assertEquals(Color.BLUE, c1);
		Assert.assertEquals(Color.GREEN, c2);
	}

}
