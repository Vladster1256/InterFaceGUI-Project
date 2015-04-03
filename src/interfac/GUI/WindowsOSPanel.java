package interfac.GUI;

import interfac.main.WindowsOSController;

import javax.swing.JPanel;
import javax.swing.SpringLayout;

public class WindowsOSPanel extends JPanel
{
	private WindowsOSController $mainController;
	private SpringLayout baseLayout;
	
	public WindowsOSPanel(WindowsOSController mainController)
	{
		this.$mainController = mainController;
		baseLayout = new SpringLayout();
		setupPanel();
		setupLayout();
		setupListeners();
	}
	
	private void setupPanel()
	{
		this.setLayout(baseLayout);
	}
	
	private void setupListeners()
	{
		
	}
	
	private void setupLayout()
	{
		
	}
}
