package EngineTester;

import org.lwjgl.opengl.Display;

import RenderEngine.DisplayManager;

public class MainGameLoop {
	public static void main(String[] args) {
		
		DisplayManager.creatDisplay();
		
		while(!Display.isCloseRequested()) {
			
			// game logic and other
			
			DisplayManager.updateDisplay();
		}
		
		DisplayManager.closeDisplay();
	}
}
