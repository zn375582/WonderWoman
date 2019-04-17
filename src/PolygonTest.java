import java.awt.Color;
import java.awt.Point;

import javax.swing.JFrame;

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

public class PolygonTest {
	//create a polygon as a rectangle
	private static Polygon p1 = new Rectangle(new Point(0, 50), 50, 100, Color.WHITE, true);
	private static Point upperLeft1 = new Point(0,50);
	private static Point upperRight1 = new Point(50, 50);
	private static Point lowerRight1 = new Point(50, 150);
	private static Point lowerLeft1 = new Point(0, 150);
	//create a polygon as a right triangle
	private static Polygon p2 = new RightTriangle(new Point(0, 50), 50, 100, Color.GRAY, false);
	private static Point rA1 = new Point(0, 50);
	private static Point baseA1 = new Point(50, 50);
	private static Point heightA1 = new Point(0, 150);
	
	/**
     * Verify the points of polygon are determined correctly
     * The vertex locations, base, height, color, and fill flag
     */
	@Test
	public void test() {
		
		Point[] pts1 = p1.getLocation();
        Assert.assertEquals(4, pts1.length);
        Assert.assertTrue(ShapeUtils.pointInSet(pts1, upperLeft1));
        Assert.assertTrue(ShapeUtils.pointInSet(pts1, upperRight1, 1));
        Assert.assertTrue(ShapeUtils.pointInSet(pts1, lowerRight1));
        Assert.assertTrue(ShapeUtils.pointInSet(pts1, lowerLeft1, 1));
        
        Point[] pts2 = p2.getLocation();
		Assert.assertEquals(3, pts2.length);
		Assert.assertTrue(ShapeUtils.pointInSet(pts2, rA1));
		Assert.assertTrue(ShapeUtils.pointInSet(pts2, baseA1, 1));
		Assert.assertTrue(ShapeUtils.pointInSet(pts2, heightA1));
		
		Assert.assertTrue(p1.isFilled());
        Assert.assertFalse(p2.isFilled());
        
        Color c1 = p1.getColor();
        Color c2 = p2.getColor();
        Assert.assertEquals(Color.WHITE, c1);
        Assert.assertEquals(Color.GRAY, c2);
        
        DrawPanel dp = new DrawPanel();
        dp.addShape(p1);
        dp.addShape(p2);
        JFrame frame = new JFrame("test");
		frame.add(dp);
		frame.setSize(100, 100);
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}

}
