   //Torbert, e-mail: mr@torbert.com, website: www.mr.torbert.com
	//version 6.17.2003

   import javax.swing.JFrame;
   public class Driver16
   {
      public static void main(String[] args)
      { 
         JFrame frame = new JFrame("Prize");
         frame.setSize(408, 438);
         frame.setLocation(175, 50);
         frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         frame.setContentPane(new PrizePanel());
         frame.setVisible(true);
      }
   }