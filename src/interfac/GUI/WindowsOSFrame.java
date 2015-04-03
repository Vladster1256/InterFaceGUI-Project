package interfac.GUI;

import interfac.main.WindowsOSController;

import javax.swing.JFrame;

public class WindowsOSFrame extends JFrame
{
	private WindowsOSPanel $mainPanel;
	
	public WindowsOSFrame(WindowsOSController mainController)
	{
		$mainPanel = new WindowsOSPanel(mainController);
		setupFrame();
	}
	
	private void setupFrame()
	{
		this.setSize(600,600);
		this.setContentPane($mainPanel);
		this.setVisible(true);
		this.setResizable(true);
	}
}
