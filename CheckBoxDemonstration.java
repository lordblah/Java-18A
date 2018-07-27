package homework6;


import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class Jinsurance extends JFrame implements ItemListener, ActionListener
{
   /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
FlowLayout flow = new FlowLayout();
   JLabel label1 = new JLabel("Insurance Plans");
   JLabel label2 = new JLabel("Vision Insurance "
   		+ "price");
   JLabel label3 = new JLabel("Dental Insurance Price");
   JLabel label4 = new JLabel("PPO Plans Price");
   JLabel label5 = new JLabel("HMO Plans Price");
   JLabel label6 = new JLabel("Total");
   JCheckBox vision = new JCheckBox("vision insurance", false);
   JCheckBox dental = new JCheckBox("dental insurance", false);
   JButton button1 = new JButton("PPO");
   JButton button2 = new JButton("HMO");
   JTextField visionPrice = new JTextField(14);
   JTextField dentailPrice = new JTextField(14);
   JTextField ppoPrice = new JTextField(14);
   JTextField hmoPrice = new JTextField(14);
   JTextField totPrice = new JTextField(5);
   int totalPrice = 0;
   int activebutton = 0;
   boolean firstButtonActived = false;
   boolean secondButtonActived = false;
   public Jinsurance()
   {
      super("CheckBox Demonstration");
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setLayout(new FlowLayout());
      label1.setFont(new Font("Arial", Font.ITALIC, 22));
      vision.addItemListener(this);
      dental.addItemListener(this);
      button1.addActionListener(this);
      button2.addActionListener(this);
      add(label1);
      add(vision);
      add(dental);
      add(button1);
      add(button2);
      add(label2);
      add(visionPrice);
      add(label3);
      add(dentailPrice);
      add(label4);
      add(ppoPrice);
      add(label5);
      add(hmoPrice);
      add(label6);
      add(totPrice);
      
  }
   
   public void actionPerformed(ActionEvent actEvent)
   {
	   
	   Object source = actEvent.getSource();
	   if(source == button1)
		  {
		   	
			if(secondButtonActived == true)
			{
				
				if(totalPrice > 95)totalPrice -= 200;
				totalPrice += 600; 
				activebutton = 1;
				secondButtonActived = false;
				firstButtonActived = true;
				ppoPrice.setText("$600.00");
				hmoPrice.setText("$0.00");
			}
			else if(activebutton == 0 ) {
				totalPrice += 600;
				activebutton = 1;
				firstButtonActived = true;
				ppoPrice.setText("$600.00");
			}
			else if(activebutton == 1) 
			{
				totalPrice-= 600;
				activebutton = 0; //means it already been subtracted
				firstButtonActived = true;
				ppoPrice.setText("$0.00");
			}
			
			  
			  totPrice.setText("$" + totalPrice);
		  }
		  else if(source == button2)
		  {
			  if(firstButtonActived == true )
				{
					if(totalPrice > 95)totalPrice -= 600;
					totalPrice += 200;
					activebutton = 1;
					firstButtonActived = false;
					secondButtonActived = true;
					hmoPrice.setText("$200.00");
					ppoPrice.setText("$0.00");
				}
				else if(activebutton == 0 ) {
					totalPrice += 200;
					activebutton = 1;
					secondButtonActived = true;
					hmoPrice.setText("$200.00");
				}
				else if(activebutton == 1) 
				{
					totalPrice-= 200;
					activebutton = 0; //means it already been subtracted
					secondButtonActived = true;
					hmoPrice.setText("$0.00");
				
				}
			  
			  totPrice.setText("$" + totalPrice);
		  }
   }

   @Override
  public void itemStateChanged(ItemEvent event)
  {
      // Actions based on choice go here
	  Object source = event.getSource();
	  int select = event.getStateChange();
	  
	  if(source == vision)
	  {
		  if(select == ItemEvent.SELECTED)
		  {
			  totalPrice += 20;
			  totPrice.setText("$" + totalPrice);
			  visionPrice.setText("$20.00");
		  }
		  else
		  {
			  totalPrice -= 20;
			  totPrice.setText("$" + totalPrice);
			  visionPrice.setText("$0.00");
		  }
	  }
	  else if(source == dental)
		  {
		  if(select == ItemEvent.SELECTED)
			  {
			  totalPrice += 75;
			  totPrice.setText("$" + totalPrice);
			  dentailPrice.setText("$75.00");
			  }else {
			  totalPrice -= 75;
			  totPrice.setText("$" + totalPrice);
			  dentailPrice.setText("$0.00");
			  }
	
		  }
	  
	}

  
		
	  
  public static void main(String[] arguments)
  {
      final int FRAME_WIDTH = 190;
      final int FRAME_HEIGHT = 420;
      Jinsurance frame =
         new Jinsurance();
      frame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
      frame.setVisible(true);
  }
}

