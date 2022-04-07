public class Play{

	private int x,y;
	Point [][] matrix;
	String pressed_key;
	private int width;
	private Point m;
	private Point g;
	

	public Play(Point [][] matrix, String pressed_key, int x, int y){
		
		this.matrix = new Point[7][7];
		this.matrix= matrix;
		this.pressed_key = pressed_key;
		this.matrix = matrix;
		this.x = x;
		this.y = y;
		this.width = 50;
	
	}
	
	public void move()
	{
		//Conditions to move Mario only through free space
		if((pressed_key == "right") && (this.matrix[x+1][y].getType() != 'b') && (this.matrix[x+1][y].getType() != 'q') )
		{
			m = new Point(this.matrix[x+1][y].getX(), this.matrix[x+1][y].getY(), 'm');
			this.matrix[x+1][y] = m;
			g = new Point(this.matrix[x][y].getX(), this.matrix[x][y].getY(), 'g');
			this.matrix[x][y] = g;
			x = x+1;
			y=y;
			System.out.println("c1");
			
		}
	
		if((pressed_key == "left") && (this.matrix[x-1][y].getType() != 'b') && (this.matrix[x-1][y].getType() != 'q') )
		{
			m = new Point(this.matrix[x-1][y].getX(), this.matrix[x-1][y].getY(), 'm');
			this.matrix[x-1][y] = m;
			g = new Point(this.matrix[x][y].getX(), this.matrix[x][y].getY(), 'g');
			this.matrix[x][y] = g;
			x=x-1;
			y=y;

			System.out.println("c2");
		}
		
		
		if((pressed_key == "up") && (this.matrix[x][y-1].getType() != 'b') && (this.matrix[x][y-1].getType() != 'q') )
		{
			m = new Point(this.matrix[x][y-1].getX(), this.matrix[x][y-1].getY(), 'm');
			matrix[x][y-1] = m;
			g = new Point(matrix[x][y].getX(), this.matrix[x][y].getY(), 'g');
			this.matrix[x][y] = g;
			x=x;
			y=y-1;

			System.out.println("c3");
		}
		
		if((pressed_key == "down") &&(this.matrix[x][y+1].getType() != 'b') && (this.matrix[x][y+1].getType() != 'q') )
		{
			m = new Point(this.matrix[x][y+1].getX(), this.matrix[x][y+1].getY(), 'm');
			this.matrix[x][y+1] = m;
			g = new Point(this.matrix[x][y].getX(), this.matrix[x][y].getY(), 'g');
			this.matrix[x][y] = g;
			x=x;
			y=y+1;

			System.out.println("c4");
			
		}
		
		//Conditions to move Mario and the block
		
		if((pressed_key == "right") && (this.matrix[x+1][y].getType() != 'b') && (this.matrix[x+1][y].getType() == 'q') && (this.matrix[x+2][y].getType() != 'q'))
		{
			m = new Point(this.matrix[x+1][y].getX(), this.matrix[x+1][y].getY(), 'm');
			this.matrix[x+1][y] = m;
			g = new Point(this.matrix[x][y].getX(), this.matrix[x][y].getY(), 'g');
			this.matrix[x][y] = g;
			x=x+1;
			y=y;

			System.out.println("c5");
		}
	
		
		if((pressed_key == "left") && (this.matrix[x-1][y].getType() != 'b') && (this.matrix[x-1][y].getType() == 'q') && (this.matrix[x-2][y].getType() != 'q'))
		{
			m = new Point(this.matrix[x-1][y].getX(), this.matrix[x-1][y].getY(), 'm');
			this.matrix[x-1][y] = m;
			g = new Point(this.matrix[x][y].getX(), this.matrix[x][y].getY(), 'g');
			this.matrix[x][y] = g;
			x=x-1;
			y=y;

			System.out.println("c6");
			
		}
		
		
		
		if((pressed_key == "up") && (this.matrix[x][y-1].getType() != 'b') && (this.matrix[x][y-1].getType() == 'q') && (this.matrix[x][y-2].getType() != 'q'))
		{
			m = new Point(this.matrix[x][y-1].getX(), this.matrix[x][y-1].getY(), 'm');
			this.matrix[x][y-1] = m;
			g = new Point(this.matrix[x][y].getX(), this.matrix[x][y].getY(), 'g');
			this.matrix[x][y] = g;
			x=x;
			y=y-1;

			System.out.println("c7");
			
		}
		
		
		if((pressed_key == "down") && (this.matrix[x][y+1].getType() != 'b') && (this.matrix[x][y+1].getType() == 'q') && (this.matrix[x][y+2].getType() != 'q'))
		{
			m = new Point(this.matrix[x][y+1].getX(), this.matrix[x][y+1].getY(), 'm');
			this.matrix[x][y+1] = m;
			g = new Point(this.matrix[x][y].getX(), this.matrix[x][y].getY(), 'g');
			this.matrix[x][y] = g;
			x=x;
			y=y+1;

			System.out.println("c8");
			
		}
		else
		{
			System.out.println("c9");		
		}
	

	}
	
	public Point [][] getMatrix()
	{
		/*for (int i = 0; i < 7; i++){		
			for (int j = 0; j < 7; j++){	
				System.out.print(this.matrix[i][j].getType()); 	}
			System.out.println("\n");}*/
		return this.matrix;
	}
	
	public int getX()
	{
		return x;
	}
	
	public int getY()
	{
		return y;
	}
	
	
	
}