import java.awt.Color;
import java.awt.event.*;
import java.awt.*;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.applet.* ;

public class GameScreen extends Screen {

	
	private int current_x, current_y;
	private String sprite;
	public Point [][] matrix = new Point[7][7];


	public GameScreen() {
		setSize(500,500);
		
		//setTitle("GameScreen");
		setBackground(Color.green);
		colocarBotones();
		setVisible(true);
		setGame();
		addKeyListener(new DirectionListener());
		sprite = "right";
		
		
	    //setLocationRelativeTo(null);
	}


	public void colocarBotones() {

		JButton Exit=new JButton();
		JButton Restart=new JButton();
		JButton Save=new JButton();


		Exit.setText("Exit");
		Exit.setBounds(300,400, 100,40);
		Exit.setEnabled(true);
		Exit.setMnemonic('g');
		Exit.setForeground(Color.BLUE);

		Restart.setText("Restarted");
		Restart.setBounds(200,400, 100,40);
		Restart.setEnabled(true);
		Restart.setMnemonic('g');
		Restart.setForeground(Color.BLUE);

		Save.setText("Save");
		Save.setBounds(100,400, 100,40);
		Save.setEnabled(true);
		Save.setMnemonic('g');
		Save.setForeground(Color.BLUE);

		this.setLayout(null);
		add(Restart);
		add(Save);
		add(Exit);

		Exit.addActionListener(new java.awt.event.ActionListener() {
											public void actionPerformed(java.awt.event.ActionEvent evt) {
												System.out.println("click");
												//make this frame no visible
												System.exit(0);

												}
																				});
		Restart.addActionListener(new java.awt.event.ActionListener() {
											public void actionPerformed(java.awt.event.ActionEvent evt) {
											System.out.println("Restart");
											//make this frame no visible


																														}
																																						});
		Save.addActionListener(new java.awt.event.ActionListener() {
											public void actionPerformed(java.awt.event.ActionEvent evt) {
											System.out.println("Saved");

																														}
																														});
	}
	
	 @Override
    	public void paintComponent(Graphics g) {
		//removeAll();
		//colocarBotones();
		//System.out.println("paint component");
       		 super.paintComponent(g);
		Rectangle r = this.getBounds ( ) ;
		g.setColor ( Color.GREEN) ;
		g.fillRect ( r.x, r.y, r.width, r.height ) ;
        		 updateGame(matrix,sprite);
    		}

	public void setGame()
	{
		
		int x = 50;
		int y = 50;


		String level = "bbbbbbbbbbggbbbmqgqbbbgggggbbgpgbbbbggggpbbbbbbbb";

		char[] lev = level.toCharArray();

		for (int i = 0; i < 7; i++)
			{
			for (int j = 0; j < 7; j++){
				Point p;
				p= new Point(x,y,lev[7*i+j]);
				matrix[i][j] = p;
				x = x+50;
				if(x == 400)
					x = 50;
			}
			y = y +50;
			}

	}
	
	
	public void updateGame(Point [][] matrixx,String sprite)
	{
		setLayout(null);
		this.matrix = matrixx;
		int x = 50;
		int y = 50;
		ImageIcon up, down, right, left, currentImage;
         		up = new ImageIcon("up.png");
        		down = new ImageIcon("down.png");
         		left = new ImageIcon("left.png");
         		right = new ImageIcon("right.png");
		currentImage=right;
		
		/*for (int i = 0; i < 7; i++){		
			for (int j = 0; j < 7; j++){	
				System.out.print(this.matrix[i][j].getType()); 	}
			System.out.println("\n");}*/
		
		if(sprite == "up")
			currentImage = up;
		if(sprite == "down")
			currentImage = down;
		if(sprite == "left")
			currentImage = left;
		if(sprite == "right")
			currentImage = right;
		

		for (int i = 0; i < 7; i++){
			for (int j = 0; j < 7; j++){
				JLabel img = new JLabel(" ");
				ImageIcon image;

				if(this.matrix[i][j].getType() == 'b')
					
					image = new ImageIcon("Block2.png");
				else if(this.matrix[i][j].getType() == 'g')
					image = new ImageIcon("Green.png");
				else if(this.matrix[i][j].getType()== 'm')
					{image = currentImage;
					//System.out.println(this.matrix[i][j].getX());
					//System.out.println(this.matrix[i][j].getY());
					current_x = j;
					current_y =i;
					//System.out.println("mario");
}
				else if(matrix[i][j].getType()== 'p')
					image = new ImageIcon("Point.png");
				else if(matrix[i][j].getType()== 'q')
					image = new ImageIcon("Question.png");
				else
					image = new ImageIcon("Block2.png");


				add(img);

				//Propiedades de la etiqueta
				img.setIcon(image);
				img.setSize(50,50);
				img.setLocation(this.matrix[i][j].getX(),this.matrix[i][j].getY());
				img.setVisible(true);

				}
			System.out.println("\n");}



	}
	
	
	 private class DirectionListener implements KeyListener
	{
	
	private Play play;


     	 //--------------------------------------------------------------
     	 // Responds to the user pressing arrow keys by adjusting the
      	// image and image location accordingly.
      	//--------------------------------------------------------------
     	 public void keyPressed(KeyEvent event)
      	{
        	
	

        	 switch (event.getKeyCode())
        	 {
	
	

            	case KeyEvent.VK_UP:
	 	sprite = "up";
               		System.out.println("up");
		play = new Play(matrix, "up", current_x, current_y);
		matrix = play.getMatrix();
		play.move();
		current_x= play.getX();
		current_y=play.getY();
               		break;
            	case KeyEvent.VK_DOWN:
                		sprite = "down";
                		System.out.println("down");
		play = new Play(matrix, "down", current_x, current_y);
		matrix = play.getMatrix();
		play.move();
		current_x= play.getX();
		current_y=play.getY();
                		break;
            	case KeyEvent.VK_LEFT:
               		sprite = "left";
               		System.out.println("left");
		play = new Play(matrix, "left", current_x, current_y);
		matrix = play.getMatrix();
		play.move();
		current_x= play.getX();
		current_y=play.getY();
               		break;
            	case KeyEvent.VK_RIGHT:
              		sprite = "right";
              		System.out.println("right");
		play = new Play(matrix, "right", current_x, current_y);
		matrix = play.getMatrix();
		play.move();
		current_x= play.getX();
		current_y=play.getY();
              		break;
        	 }		
		
      	}

      	//--------------------------------------------------------------
      	// Provide empty definitions for unused event methods.
      	//--------------------------------------------------------------
      	public void keyTyped(KeyEvent event) {}
      	public void keyReleased(KeyEvent event) {}
   	}
}
