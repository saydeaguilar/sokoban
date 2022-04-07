import java.awt.*;
import javax.swing.*;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	JFrame frame = new JFrame("Sokoban");
	frame.setPreferredSize(new Dimension(700, 700));
	frame.setTitle("Sokoban");
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.setDefaultLookAndFeelDecorated(true);

	LevelScreen lScreen = new LevelScreen();
	GameScreen gScreen = new GameScreen();
	MainScreen screen = new MainScreen(lScreen, gScreen);

	screen.setVisible(true);
	lScreen.setVisible(false);
	gScreen.setVisible(false);

	frame.getContentPane().add(screen);
	frame.getContentPane().add(lScreen);
	frame.getContentPane().add(gScreen);

	frame.setResizable(false);
	frame.pack();
	frame.setVisible(true);

	}

}
