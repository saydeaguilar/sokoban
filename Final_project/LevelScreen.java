import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class LevelScreen extends JPanel{

	private pasarevento regresar;
	private GameScreen objgame;

	public void setRegresar(pasarevento pe){
		this.regresar = pe;
	}

	public void setGame(GameScreen obj){
		this.objgame = obj;
	}

	public LevelScreen() {
		setSize(500,500);
		//setTitle("LevelScreen");
		 colocarBotones();
	    //setLocationRelativeTo(null);

	}


	public void colocarBotones() {
		JButton    Level1 =new JButton();
		JButton Level2 =new JButton();
		JButton Level3 =new JButton();
		JButton Exit=new JButton();

		Level1.setText("Level 1");
		Level1.setBounds(50, 100, 100, 40);
		Level1.setEnabled(true);
		Level1.setMnemonic('1');
		Level1.setForeground(Color.BLUE);

		Level2.setText("Level 2");
		Level2.setBounds(150,100,100,40);
		Level2.setEnabled(true);
		Level2.setMnemonic('2');
		Level2.setForeground(Color.BLUE);

		Level3.setText("Level 3");
		Level3.setBounds(250,100, 100,40);
		Level3.setEnabled(true);
		Level3.setMnemonic('3');
		Level3.setForeground(Color.BLUE);

		Exit.setText("Exit");
		Exit.setBounds(350,100, 100,40);
		Exit.setEnabled(true);
		Exit.setMnemonic('l');
		Exit.setForeground(Color.BLUE);

		add(Level1);

		Level1.addActionListener(new java.awt.event.ActionListener() {
											public void actionPerformed(java.awt.event.ActionEvent evt) {
												System.out.println("click");
												setVisible(false); //make this frame no visible
												objgame.setVisible(true); //make the other frame visible
												objgame.requestFocus();//make this frame no visible
												}
																				});
		add(Level2);
		add(Level3);
		add(Exit);


		Exit.addActionListener(new java.awt.event.ActionListener() {
											public void actionPerformed(java.awt.event.ActionEvent evt) {
												System.out.println("click");
										


												regresar.Regresar();
												}
																				});
	}

}
