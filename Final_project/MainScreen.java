import java.awt.*;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.event.ActionListener;


public class MainScreen extends JPanel implements pasarevento{

	private LevelScreen lScreen;
	private GameScreen gScreen;

	public MainScreen(LevelScreen lScreen, GameScreen gScreen) {

		this.lScreen = lScreen;
		this.gScreen = gScreen;

		setSize(700,700);
		colocarBotones();

		//first add all elements, then make it visible/focusable
		setFocusable(true);
		setVisible(true);

	}
@Override
	public void Regresar(){
		try{
		this.setVisible(true);
		this.gScreen.setVisible(false); //make the other frame visible
}catch(Exception x){
	System.out.println(x.toString());
}
	}


	public void colocarBotones() {

		JButton playButton =new JButton("Play");
		JButton continueButton =new JButton("Continue");
		JButton exitButton=new JButton("Exit");

		//playButton.setPreferredSize(new Dimension(100, 30));
		playButton.setBounds(50, 200, 100, 40);
		playButton.setEnabled(true);
		playButton.setMnemonic('p');
		playButton.setForeground(Color.BLUE);

		//continueButton.setPreferredSize(new Dimension(100, 30));
		continueButton.setBounds(250,200,100,40);
		continueButton.setEnabled(true);
		continueButton.setMnemonic('c');
		continueButton.setForeground(Color.BLUE);

		//exitButton.setPreferredSize(new Dimension(100, 30));
		exitButton.setBounds(450,200, 100,40);
		exitButton.setEnabled(true);
		exitButton.setMnemonic('e');
		exitButton.setForeground(Color.BLUE);

    this.setLayout(null);
		add(playButton);
		add(continueButton);
		add(exitButton);

		//listeners for the buttons
		playButton.addActionListener(new java.awt.event.ActionListener() {
		 				            public void actionPerformed(java.awt.event.ActionEvent evt) {
		 				                playButtonActionPerformed(evt);
		 				            }
		});
		continueButton.addActionListener(new java.awt.event.ActionListener() {
											public void actionPerformed(java.awt.event.ActionEvent evt) {

											}
											});

		exitButton.addActionListener(new java.awt.event.ActionListener() {
											public void actionPerformed(java.awt.event.ActionEvent evt) {
													exitButtonActionPerformed(evt);
												}
																				});

}



	private void playButtonActionPerformed(java.awt.event.ActionEvent evt) {
			///this code will be last after performing the actions of the button

			System.out.println("click");
			this.setVisible(false); //make this frame no visible
			this.lScreen.setRegresar(this);
			this.lScreen.setGame(gScreen);
			this.lScreen.setVisible(true); //make the other frame visible
			this.lScreen.requestFocus();

	}
	private void exitButtonActionPerformed(java.awt.event.ActionEvent evt) {

		System.exit(0);
	}


}
