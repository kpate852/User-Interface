package Layouts;
import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JTextArea;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;

/**
   This frame contains a text field and a control panel
   to change the font of the text.
*/
public class PizzaToppingFrame extends JFrame
{
   private static final int FRAME_WIDTH = 300;
   private static final int FRAME_HEIGHT = 400;
  
   private JLabel sampleField;
   private JCheckBox italicCheckBox;
   private JCheckBox boldCheckBox;
   private JRadioButton smallButton;
   private JRadioButton mediumButton;
   private JRadioButton largeButton;
   private JComboBox facenameCombo;
   private ActionListener listener;
   private JTextArea textArea;

   /**
      Constructs the frame.
   */
   public PizzaToppingFrame()
   {  
     
      createControlPanel();
      setSize(FRAME_WIDTH, FRAME_HEIGHT);
   }

   /**
      Creates the control panel to change the font.
   */
   public void createControlPanel()
   {
    
      JPanel sizeGroupPanel = createCheckBoxes();
      JPanel toppingsGroupPanel = createRadioButtons();
      JPanel label= createJLabel();

      // Line up component panels

      JPanel controlPanel = new JPanel();
      JPanel controlPanel2 = new JPanel();
      
      controlPanel.setLayout(new GridLayout(1, 2));
      controlPanel.add(sizeGroupPanel);
      controlPanel.add(toppingsGroupPanel);
      
      controlPanel2.add(sampleField);
    

      // Add panels to content pane

      add(controlPanel, BorderLayout.CENTER);
      add(controlPanel2, BorderLayout.SOUTH);
      

   }

   /**
      Creates the check boxes for selecting bold and italic styles.
      @return the panel containing the check boxes
   */
   public JPanel createCheckBoxes()
   {
      italicCheckBox = new JCheckBox("Pepperoni");
      italicCheckBox.addActionListener(listener);

      boldCheckBox = new JCheckBox("Anchovies");
      boldCheckBox.addActionListener(listener);

      JPanel panel = new JPanel();
      panel.add(italicCheckBox);
      panel.add(boldCheckBox);
      panel.setBorder(new TitledBorder(new EtchedBorder(), "Toppings"));

      return panel;
   }

   /**
      Creates the radio buttons to select the font size
      @return the panel containing the radio buttons
   */
   public JPanel createRadioButtons()
   {
      smallButton = new JRadioButton("Small");
      smallButton.addActionListener(listener);

      mediumButton = new JRadioButton("Medium");
      mediumButton.addActionListener(listener);

      largeButton = new JRadioButton("Large");
      largeButton.addActionListener(listener);
      largeButton.setSelected(true);

      // Add radio buttons to button group

      ButtonGroup group = new ButtonGroup();
      group.add(smallButton);
      group.add(mediumButton);
      group.add(largeButton);

      JPanel panel = new JPanel();
      panel.add(smallButton);
      panel.add(mediumButton);
      panel.add(largeButton);
      panel.setBorder(new TitledBorder(new EtchedBorder(), "Size"));
    
      return panel;
   }

  public JPanel createJLabel()
  {
	  JPanel panel = new JPanel();
	  sampleField= new JLabel("Your price: ");
	  add(sampleField);
	  add(panel);
	return panel;
	  
  }
  
  public JPanel createTextArea()
  {
	  JPanel panel = new JPanel();
	  textArea= new JTextArea();
	  add(textArea);
	  add(panel);
	return panel;
	  
  }
 }
