package userInterface;

import mainPackage.Constants;

import javax.swing.*;
import java.awt.*;

public class Window {

	public static JFrame f = new JFrame();
	Pause pause = new Pause();
	BottomPanel bottomPanel = new BottomPanel();
	TopPanel topPanel = new TopPanel();
	LeftPanel leftPanel = new LeftPanel();
	MainPanel mainPanel = new MainPanel();
	
	public void drawWindow() {
		f.setSize(Constants.windowWidth,Constants.windowHeight);
	    f.setTitle("Equinotify");
	    f.setIconImage(new ImageIcon(getClass().getResource("/images/Equinox.png")).getImage());
	    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    f.setResizable(true);
	    f.setLayout(null);
	    drawPanels();
	    f.setVisible(true);
	}
	
	public void drawPanels() {
		bottomPanel.init();
		topPanel.init();
		leftPanel.init();
		mainPanel.init();
	}
	
}
