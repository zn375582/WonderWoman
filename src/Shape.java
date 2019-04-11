
public abstract class Shape implement Drawable{

	/**
	 * create private variables
	 */
	private Point[] location;
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
		return this.color;
	}
	
	/**
	 * 
	 * @return true if shape is filled
	 */
	public boolean isFilled()
	{
		return this.filled;
	}
	
	/**
	 * 
	 * @return location The array representing the shape's location
	 */
	public Point[] getLocation()
	{
		return this.location;
	}
}
