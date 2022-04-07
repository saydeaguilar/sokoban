public class Point
{
	private int x;
	private int y;
	private char identifier;

	public Point(int x, int y, char identifier)
	{
		this.x = x;
		this.y = y;
		this.identifier = identifier;
	}

	public int getX()
	{
		return this.x;
	}

	public int getY()
	{
		return this.y;
	}

	public char getType()
	{
		return this.identifier;
	}

}
