import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;

public abstract class Shape implements Drawable{

	protected Point[] location;
	private Color color;
	private boolean filled;
	
	/**
	 * 
	 * @param color- color of the shape.
	 * @param filled- boolean value determining whether the shape is filled
	 */
	public Shape(Color color, boolean filled)
	{
		this.color = color;
		this.filled = filled;
	}
	
	/**
	 * 
	 * @return the color of the shape
	 */
	public Color getColor()
	{
		return color;
	}
	
	/**
	 * 
	 * @return true if shape is filled
	 */
	public boolean isFilled()
	{
		return filled;
	}
	
	/**
	 * 
	 * @return location The array representing the shape's location
	 */
	public Point[] getLocation()
	{
		return location;
	}
}
