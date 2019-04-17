
import java.awt.Color;
import java.awt.Point;

import org.junit.Assert;
import org.junit.Test;

/**
 * Test cases for the Square
 * 
 * 
 * @author Nicole Zimmerer
 * @version April 16, 2019
 * Lab 10
 */
public class SquareTest {

	private static Square s1 = new Square(new Point(0,0), 100, Color.CYAN, true);
	private static Point upperLeft1 = new Point(0,0);
	private static Point upperRight1 = new Point(100, 0);
	private static Point lowerRight1 = new Point(100, 100);
	private static Point lowerLeft1 = new Point(0, 100);
	private static Square s2 = new Square(new Point(100,200), 50, Color.RED, false);
	private static Point upperLeft2 = new Point(100, 200);
	private static Point upperRight2 = new Point(150, 200);
	private static Point lowerRight2 = new Point(150, 250);
	private static Point lowerLeft2 = new Point(100, 250);
	
	/**
     * Verify the points defining the square are determined correctly
     * The vertex locations, width, color, and fill flag
     */
	@Test
	public void test() {
		//test points
		Point[] pts1 = s1.getLocation();
		Assert.assertEquals(4, pts1.length);
		Assert.assertTrue(ShapeUtils.pointInSet(pts1, upperLeft1));
        Assert.assertTrue(ShapeUtils.pointInSet(pts1, upperRight1, 1));
        Assert.assertTrue(ShapeUtils.pointInSet(pts1, lowerRight1));
        Assert.assertTrue(ShapeUtils.pointInSet(pts1, lowerLeft1, 1));
		        
        Point[] pts2 = s2.getLocation();
        Assert.assertEquals(4, pts2.length);
        Assert.assertTrue(ShapeUtils.pointInSet(pts2, upperLeft2));
        Assert.assertTrue(ShapeUtils.pointInSet(pts2, upperRight2, 1));
        Assert.assertTrue(ShapeUtils.pointInSet(pts2, lowerRight2));
        Assert.assertTrue(ShapeUtils.pointInSet(pts2, lowerLeft2, 1));
		
        //test if filled
        Assert.assertTrue(s1.isFilled());
        Assert.assertFalse(s2.isFilled());
		
        //test color
        Color c1 = s1.getColor();
        Color c2 = s2.getColor();
        Assert.assertEquals(Color.CYAN, c1);
        Assert.assertEquals(Color.RED, c2);
	}

}
