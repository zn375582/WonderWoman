import static org.junit.Assert.*;

import java.awt.Color;
import java.awt.Point;

import org.junit.Assert;
import org.junit.Test;

/**
 * Test cases for the Circle
 * 
 * @author Nicole Zimmerer
 * @version April 16, 2019
 * Lab 10
 */
public class CircleTest {

	
    private Circle circle1 = new Circle(new Point(100, 200), 40, Color.BLACK, true);
    private Circle circle2 = new Circle(new Point(100, 200), 80, Color.GREEN, false);
    
    
    /**
     * Verify the affects of the constructor for the  Circle
     * The location, the diameter, the color, and the filled flag
     */
	@Test
	public void test() 
	{
		// Verify the quantity of points for each shape
		Assert.assertEquals("Quantity of points defining the Circle is more than 1", 1, circle1.getLocation().length);
        Assert.assertEquals("Quantity of points defining the Circle is more than 1", 1, circle2.getLocation().length);
        
        // Verify the location for each shape
        Assert.assertEquals("Incorrect location for the Circle", new Point(100, 200), circle1.getLocation()[0]);
        Assert.assertEquals("Incorrect location for the Circle", new Point(100, 200), circle2.getLocation()[0]);
        
        // Verify the colors for each shape
        Assert.assertEquals("Incorrect color for the Circle", Color.BLACK, circle1.getColor());
        Assert.assertEquals("Incorrect color for the Circle", Color.GREEN, circle2.getColor());
        
        // Verify the appropriate filled flag for each shape
        Assert.assertTrue("Incorrect flag for filled for the Circle", circle1.isFilled());
        Assert.assertFalse("Incorrect flag for filled for the Circle", circle2.isFilled());
        	
        // Verify the diameter(s) are correctly set
        Assert.assertEquals("Incorrect diameter for the Cirlce", 40, circle1.getDiameter());
        Assert.assertEquals("Incorrect diameter1 for the Circle", 40, circle1.getDiameter1());
        Assert.assertEquals("Incorrect diameter2 for the Circle", 40, circle1.getDiameter2());
        
        Assert.assertEquals("Incorrect diameter for the Circle", 80, circle2.getDiameter());
        Assert.assertEquals("Incorrect diameter1 for the Circle", 80, circle2.getDiameter1());
        Assert.assertEquals("Incorrect diameter2 for the Circle", 80, circle2.getDiameter2());
        
        
        
        
	}

}
