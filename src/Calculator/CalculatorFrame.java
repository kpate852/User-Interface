package Calculator;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
   A frame that shows the growth of an investment with variable interest.
*/
public class CalculatorFrame extends JFrame
{    
   private static final int FRAME_WIDTH = 450;
   private static final int FRAME_HEIGHT = 100;


 

   private JTextField resultArea;
   private JButton button1;
   private JButton button2;
   private JButton button3;
   private JButton button4;
   private JButton button5;
   private JButton button6;
   private JButton button7;
   private JButton button8;
   private JButton button9;
   private JPanel Buttons;
  
   
   private JPanel panel;
   
 
   public CalculatorFrame()
   {  
	   panel =new JPanel();
	   panel.setLayout(new BorderLayout());
	   Buttons = new JPanel();
	   Buttons.setLayout(new GridLayout(3, 3));
	   
	   resultArea = new JTextField(2000);
	   resultArea.setEditable(false);
      // Use helper methods 
     
      createButton1();
      createButton2();
      createButton3();
      createButton4();
      createButton5();
      createButton6();
      createButton7();
      createButton8();
      createButton9();
    
      //createPanel();
    
      createButtonPanel();
      createOverall();
      setSize(FRAME_WIDTH, FRAME_HEIGHT);
   }

  
   
   private void createButton1()
   {
      button1 = new JButton("1");
     
      class AddInterestListener implements ActionListener
      {
         public void actionPerformed(ActionEvent event)
         {
            resultArea.setText("1");
         }            
      }
      ActionListener listener = new AddInterestListener();
      button1.addActionListener(listener);
   }
   
   private void createButton2()
   {
      button2 = new JButton("2");
      class AddInterestListener implements ActionListener
      {
         public void actionPerformed(ActionEvent event)
         {
        	 resultArea.setText("2");

         }            
      }
      
      ActionListener listener1 = new AddInterestListener();
      button2.addActionListener(listener1);
   }
   
   private void createButton3()
   {
      button3 = new JButton("3");
     
      class AddInterestListener implements ActionListener
      {
         public void actionPerformed(ActionEvent event)
         {
        	 resultArea.setText("3");
         }            
      }
      ActionListener listener = new AddInterestListener();
      button3.addActionListener(listener);
   }
   
   private void createButton4()
   {
      button4 = new JButton("4");
     
      class AddInterestListener implements ActionListener
      {
         public void actionPerformed(ActionEvent event)
         {
        	 resultArea.setText("4");
         }            
      }
      ActionListener listener = new AddInterestListener();
      button4.addActionListener(listener);
   }
   
   private void createButton5()
   {
      button5 = new JButton("5");
     
      class AddInterestListener implements ActionListener
      {
         public void actionPerformed(ActionEvent event)
         {
        	 resultArea.setText("5");
         }            
      }
      ActionListener listener = new AddInterestListener();
      button5.addActionListener(listener);
   }
   
   private void createButton6()
   {
      button6 = new JButton("6");
     
      class AddInterestListener implements ActionListener
      {
         public void actionPerformed(ActionEvent event)
         {
        	 resultArea.setText("6");
         }            
      }
      ActionListener listener = new AddInterestListener();
      button6.addActionListener(listener);
   }
   
   private void createButton7()
   {
      button7 = new JButton("7");
     
      class AddInterestListener implements ActionListener
      {
         public void actionPerformed(ActionEvent event)
         {
        	 resultArea.setText("7");
         }            
      }
      ActionListener listener = new AddInterestListener();
      button7.addActionListener(listener);
   }
   
   private void createButton8()
   {
      button8 = new JButton("8");
     
      class AddInterestListener implements ActionListener
      {
         public void actionPerformed(ActionEvent event)
         {
        	 resultArea.setText("8");
         }            
      }
      ActionListener listener = new AddInterestListener();
      button8.addActionListener(listener);
   }
   

   private void createButton9()
   {
      button9 = new JButton("9");
     
      class AddInterestListener implements ActionListener
      {
         public void actionPerformed(ActionEvent event)
         {
        	 resultArea.setText("9");
         }            
      }
      ActionListener listener = new AddInterestListener();
      button9.addActionListener(listener);
   }
   /*
   private void createPanel()
   {
      panel = new JPanel();
      panel.add(rateLabel);
      panel.add(results);
      panel.add(button1);
      panel.add(button2);
      panel.add(button3);
      panel.add(button4);
      panel.add(button5);
      panel.add(button6);
      panel.add(button7);
      panel.add(button8);
      panel.add(button9);
      
      panel.add(resultLabel);  
      add(panel);
     
   } */
   
   private void createOverall()
   {
	   panel.add(resultArea, BorderLayout.NORTH);
	   panel.add(Buttons, BorderLayout.CENTER);
	   add(panel);
   }
   
   private void createButtonPanel()
   {
	   Buttons.add(button1);
	   Buttons.add(button2);
	   Buttons.add(button3);
	   Buttons.add(button4);
	   Buttons.add(button5);
	   Buttons.add(button6);
	   Buttons.add(button7);
	   Buttons.add(button8);
	   Buttons.add(button9);
	   add(Buttons);
	   
   }
   
   
}
