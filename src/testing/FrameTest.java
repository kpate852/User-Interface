package testing;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import javax.swing.JTextField;


public class FrameTest extends JFrame{

	
	private JPanel panel;
	private JButton button;
	private JTextField textField;
	private JLabel label;
	
	private static final int HEIGHT=200;
	private static final int Width=300;
	
	
	public FrameTest()
	{
		createButton();
		createLabel();
		createPanel();
		setSize(HEIGHT, Width);
	}
	private void createButton()
	{
		button=new JButton("Hello");
		
		
	}
	private void createLabel() {
		
		label= new JLabel("Hello");
	}

	
	private void createPanel() {
		
		panel= new JPanel();
		panel.add(button);
		panel.add(label);
		//panel.add(textArea);
		add(panel);
		
	}

	
}
