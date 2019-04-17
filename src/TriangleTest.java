import static org.junit.Assert.*;

import java.awt.Color;
import java.awt.Point;

import org.junit.Assert;
import org.junit.Test;


/**
 * Test cases for the Triangle
 * 
 * 
 * @author Nicole Zimmerer
 * @version April 16, 2019
 * Lab 10
 */
public class TriangleTest {
	
	private static Triangle t1 = new RightTriangle(new Point(0, 50), 10, 20, Color.YELLOW, true);
	private static Point rA1 = new Point(0, 50);
	private static Point baseA1 = new Point(10, 50);
	private static Point heightA1 = new Point(0, 70);
	private static IsoscelesTriangle t2 = new IsoscelesTriangle(new Point(200, 300), 60, 50, Color.ORANGE, false);
	private static Point base3 = new Point(200, 300);
	private static Point base4 = new Point(260, 300);
	private static Point point2 = new Point(230, 250);
	
	
	/**
     * Verify the points defining the triangle are determined correctly
     * The vertex locations, base, height, color, and fill flag
     */
	@Test
	public void test() {
		//test points
		Point[] pts1 = t1.getLocation();
		Assert.assertEquals(3, pts1.length);
		Assert.assertTrue(ShapeUtils.pointInSet(pts1, rA1));
		Assert.assertTrue(ShapeUtils.pointInSet(pts1, baseA1, 1));
		Assert.assertTrue(ShapeUtils.pointInSet(pts1, heightA1));
						        
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
		Assert.assertEquals(Color.YELLOW, c1);
		Assert.assertEquals(Color.ORANGE, c2);
	}

}
