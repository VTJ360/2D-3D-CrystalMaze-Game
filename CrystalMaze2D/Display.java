package dev.Vibb360.CrystalMaze.display;

import javax.swing.JFrame;

public class Display {
	
	private JFrame frame;
	
	private String title;
	private int width, height;
	
	public Display(String title, int width, int height){
		this.title = title;
		this.height = height;
		this.width = width;
		
		creatDisplay();
	}
	
	private void creatDisplay(){
		frame = new JFrame(title);
		frame.setSize(width, height);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		frame.setLocation(null);
		frame.setVisible(true);
	}
}
