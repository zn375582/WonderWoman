import java.awt.Graphics;
import java.util.ArrayList;

import javax.swing.JPanel;

/**
 * Class to add Shapes in DrawPanel
 * 
 * @author Nicole Zimmerer
 * @version April 16, 2019
 * Lab 10
 */
public class DrawPanel extends JPanel {

	/**
	 * The list holding all the shapes being drawn
	 */
	private ArrayList<Shape> shapeList = new ArrayList<>();
	
	/**
	 * This method adds shapes to the set of shapes.
	 * @param shape - shape to be added to list
	 */
	public void addShape(Shape shape)
	{
		shapeList.add(shape);
	}
	
	/**
	 * Draw the shapes in the component, based on their defined draw method.
	 * @param graphics
	 */
	protected void paintComponent(Graphics graphics)
	{
		//super.paintComponent(graphics);
		for (int index = 0; index < shapeList.size(); ++index)
		{
			shapeList.get(index).draw(graphics);
		}
	}
}
