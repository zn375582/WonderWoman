
import java.awt.Color;
import java.awt.Point;

import org.junit.Assert;
import org.junit.Test;


/**
 * Test cases for the Right Rectangle
 * 
 * 
 * @author Nicole Zimmerer
 * @version April 16, 2019
 * Lab 10
 */
public class RightTriangleTest {
	
	private static RightTriangle t1 = new RightTriangle(new Point(0, 50), 50, 100, Color.GRAY, true);
	private static Point rA1 = new Point(0, 50);
	private static Point baseA1 = new Point(50, 50);
	private static Point heightA1 = new Point(0, 150);
	private static RightTriangle t2 = new RightTriangle(new Point(100, 100), 20, -50, Color.CYAN, false);
	private static Point rA2 = new Point(100, 100);
	private static Point baseA2 = new Point(120, 100);
	private static Point heightA2 = new Point(100, 50);
	
	
	/**
     * Verify the points defining the right triangle are determined correctly
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
		Assert.assertTrue(ShapeUtils.pointInSet(pts2, rA2));
		Assert.assertTrue(ShapeUtils.pointInSet(pts2, baseA2, 1));
		Assert.assertTrue(ShapeUtils.pointInSet(pts2, heightA2));
				
		//test if filled
		Assert.assertTrue(t1.isFilled());
		Assert.assertFalse(t2.isFilled());
				
		//test color
		Color c1 = t1.getColor();
		Color c2 = t2.getColor();
		Assert.assertEquals(Color.GRAY, c1);
		Assert.assertEquals(Color.CYAN, c2);
	}

}
