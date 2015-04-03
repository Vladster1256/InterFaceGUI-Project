package interfac.GUI;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import interfac.main.WindowsOSController;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.SpringLayout;

public class WindowsOSPanel extends JPanel
{
	private WindowsOSController $mainController;
	private SpringLayout baseLayout;
	private JButton button1, button2, button3, button4, button5;
	private Boolean windowsMilRating, windowsVisRating, windowsXPRating;
	private JTextArea textArea;

	
	public WindowsOSPanel(WindowsOSController mainController)
	{
		windowsMilRating = false;
		windowsVisRating = false;
		windowsXPRating = false;
		this.$mainController = mainController;
		baseLayout = new SpringLayout();
		button1 = new JButton("Rate Windows Millenium");
		button2 = new JButton("Rate Windows Vista");
		button3 = new JButton("Rate Windows XP");
		button4 = new JButton("Complement the Best");
		button5 = new JButton("Critizise the other OS's");
		textArea = new JTextArea(5,20);

		setupPane();
		setupPanel();
		setupLayout();
		setupListeners();
	}
	
	private void setupPane()
	{
		textArea.setAutoscrolls(true);
		textArea.setLineWrap(true);
		textArea.setWrapStyleWord(true);
		textArea.setEditable(false);
	}
	
	private void setupPanel()
	{
		this.setLayout(baseLayout);
		this.setBackground(Color.blue);
		this.setSize(600,600);
		this.add(button1);
		this.add(button2);
		this.add(button3);
		this.add(button4);
		this.add(button5);
		this.add(textArea);
	}
	
	private void setupListeners()
	{
		button1.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				String temp = "";
				
			}
		});
	}
	
	private void setupLayout()
	{
		baseLayout.putConstraint(SpringLayout.SOUTH, button5, -41, SpringLayout.SOUTH, this);
		baseLayout.putConstraint(SpringLayout.EAST, button5, -38, SpringLayout.EAST, this);
		baseLayout.putConstraint(SpringLayout.WEST, button4, 0, SpringLayout.WEST, button1);
		baseLayout.putConstraint(SpringLayout.SOUTH, button4, -55, SpringLayout.SOUTH, this);
		baseLayout.putConstraint(SpringLayout.SOUTH, button1, -18, SpringLayout.NORTH, button3);
		baseLayout.putConstraint(SpringLayout.WEST, button3, 52, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.SOUTH, button3, -135, SpringLayout.SOUTH, this);
		baseLayout.putConstraint(SpringLayout.WEST, button2, 63, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.SOUTH, button2, -6, SpringLayout.NORTH, button1);
		baseLayout.putConstraint(SpringLayout.WEST, button1, 30, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.NORTH, textArea, 90, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.WEST, textArea, 77, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.SOUTH, textArea, -72, SpringLayout.NORTH, button2);
		baseLayout.putConstraint(SpringLayout.EAST, textArea, 524, SpringLayout.WEST, this);
		
	}
}
