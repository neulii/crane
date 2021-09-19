package Main;

import javax.swing.JFrame;

public class GameWindow {
	
	JFrame window;
	
	final int WINDOW_WIDTH;
	final int WINDOW_HEIGHT;
	
	boolean gameIsRunning = true;
	
	public GameWindow(int windowWidth, int windowHeight)
	{
		WINDOW_WIDTH = windowWidth;
		WINDOW_HEIGHT = windowHeight;
		
		initializeWindow();
		
	
		
		while(gameIsRunning)
		{
			
			
			
			
			
			
			
		}
			
	}
	
	public void initializeWindow()
	{
		
		window = new JFrame("Game");
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setLayout(null);
		window.setLocationRelativeTo(null);
		window.setSize(WINDOW_WIDTH,WINDOW_HEIGHT);
		
		window.setResizable(false);
		window.setVisible(true);
		
		
	}

}
