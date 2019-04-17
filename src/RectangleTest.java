

import java.awt.Color;
import java.awt.Point;

import org.junit.Assert;
import org.junit.Test;

/**
 * Test cases for the Rectangle
 * 
 * 
 * @author Nicole Zimmerr
 * @version April 16, 2019
 * Lab 10
 */
public class RectangleTest {

	private static Rectangle r1 = new Rectangle(new Point(0,50), 50, 100, Color.BLACK, true);
	private static Point upperLeft1 = new Point(0,50);
	private static Point upperRight1 = new Point(50, 50);
	private static Point lowerRight1 = new Point(50, 150);
	private static Point lowerLeft1 = new Point(0, 150);
	private static Rectangle r2 = new Rectangle(new Point(100,100), 200, 50, Color.BLUE, false);
	private static Point upperLeft2 = new Point(100, 100);
	private static Point upperRight2 = new Point(300, 100);
	private static Point lowerRight2 = new Point(300, 150);
	private static Point lowerLeft2 = new Point(100, 150);
	
	/**
     * Verify the points defining the rectangle are determined correctly
     * The vertex locations, width, height, color, and fill flag
     */
	@Test
	public void test() {
		//test points
		Point[] pts1 = r1.getLocation();
        Assert.assertEquals(4, pts1.length);
        Assert.assertTrue(ShapeUtils.pointInSet(pts1, upperLeft1));
        Assert.assertTrue(ShapeUtils.pointInSet(pts1, upperRight1, 1));
        Assert.assertTrue(ShapeUtils.pointInSet(pts1, lowerRight1));
        Assert.assertTrue(ShapeUtils.pointInSet(pts1, lowerLeft1, 1));
        
        Point[] pts2 = r2.getLocation();
        Assert.assertEquals(4, pts2.length);
        Assert.assertTrue(ShapeUtils.pointInSet(pts2, upperLeft2));
        Assert.assertTrue(ShapeUtils.pointInSet(pts2, upperRight2, 1));
        Assert.assertTrue(ShapeUtils.pointInSet(pts2, lowerRight2));
        Assert.assertTrue(ShapeUtils.pointInSet(pts2, lowerLeft2, 1));
        
        Assert.assertTrue(r1.isFilled());
        Assert.assertFalse(r2.isFilled());
        
        Color c1 = r1.getColor();
        Color c2 = r2.getColor();
        Assert.assertEquals(Color.BLACK, c1);
        Assert.assertEquals(Color.BLUE, c2);
	}

}
