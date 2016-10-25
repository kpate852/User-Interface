package Calculator;



import javax.swing.JFrame;

/**
   This program displays the growth of an investment. 
*/
public class calcRun
{  
   public static void main(String[] args)
   {  
      JFrame frame = new CalculatorFrame();
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setVisible(true);
      frame.setTitle("Calculator");
   }
}