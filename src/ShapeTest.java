
import java.awt.Color;
import java.awt.Point;

import org.junit.Assert;
import org.junit.Test;

/**
 * Test cases for the Polygon
 * 
 * 
 * @author Nicole Zimmerer
 * @version April 16, 2019
 * Lab 10
 */
public class ShapeTest {
	//create a polygon as a rectangle
		private static Shape s1 =  new Diamond(new Point(100, 100), 50, Color.CYAN, true);
	    private static int delta = (int) (50 / Math.sqrt(2));
	    private static Point left = new Point(100, 100);
	    private static Point upper = new Point((100 + delta), (100 - delta));
	    private static Point lower = new Point((100 + delta), (100 + delta));
	    private static Point right = new Point((100 + 2 * delta), 100);
		//create a polygon as a right triangle
		private static Shape s2 = new Oval(new Point(100, 100), 50, 100, Color.ORANGE, false);
	
	/**
	* Verify the points defining the Shapes are determined correctly
    * The vertex locations, points, lengths, diameter, etc., color, and fill flag
    */
	@Test
	public void test() {
		
		Point[] pts1 = s1.getLocation();
        Assert.assertEquals(4, pts1.length);
        Assert.assertTrue(ShapeUtils.pointInSet(pts1, left));
        Assert.assertTrue(ShapeUtils.pointInSet(pts1, upper, 1));
        Assert.assertTrue(ShapeUtils.pointInSet(pts1, lower));
        Assert.assertTrue(ShapeUtils.pointInSet(pts1, right, 1));
        
        Assert.assertEquals("Quantity of points defining the Oval is more than 1", 1, s2.getLocation().length);
		
		Assert.assertTrue(s1.isFilled());
        Assert.assertFalse(s2.isFilled());
        
        Color c1 = s1.getColor();
        Color c2 = s2.getColor();
        Assert.assertEquals(Color.CYAN, c1);
        Assert.assertEquals(Color.ORANGE, c2);
	}

}
