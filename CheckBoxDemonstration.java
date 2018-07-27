package realhomework5;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class CheckBoxDemonstration extends JFrame implements ItemListener, ActionListener
{
   /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
FlowLayout flow = new FlowLayout();
   JLabel label = new JLabel("Insurance Plans");
   JCheckBox vision = new JCheckBox("vision insurance", false);
   JCheckBox dental = new JCheckBox("dental insurance", false);
   JButton button1 = new JButton("PPO");
   JButton button2 = new JButton("HMO");
   JTextField totPrice = new JTextField(4);
   int totalPrice = 0;
   int activebutton = 0;
   boolean firstButtonActived = false;
   boolean secondButtonActived = false;
   public CheckBoxDemonstration()
   {
      super("CheckBox Demonstration");
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setLayout(new FlowLayout());
      label.setFont(new Font("Arial", Font.ITALIC, 22));
      vision.addItemListener(this);
      dental.addItemListener(this);
      button1.addActionListener(this);
      button2.addActionListener(this);
      add(label);
      add(vision);
      add(dental);
      add(button1);
      add(button2);
      add(totPrice);
      
  }
   
   public void actionPerformed(ActionEvent actEvent)
   {
	   
	   Object source = actEvent.getSource();
	   if(source == button1)
		  {
		   	
			if(secondButtonActived == true)
			{
				totalPrice += 600; 
				totalPrice -= 200;
				activebutton = 1;
				secondButtonActived = false;
			}
			else if(activebutton == 0 ) {
				totalPrice += 600;
				activebutton = 1;
				firstButtonActived = true;
			}
			else if(activebutton == 1) 
			{
				totalPrice-= 600;
		
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class CheckBoxDemonstration extends JFrame implements ItemListener, ActionListener
{
   /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
FlowLayout flow = new FlowLayout();
   JLabel label = new JLabel("Insurance Plans");
   JCheckBox vision = new JCheckBox("vision insurance", false);
   JCheckBox dental = new JCheckBox("dental insurance", false);
   JButton button1 = new JButton("PPO");
   JButton button2 = new JButton("HMO");
   JTextField totPrice = new JTextField(4);
   int totalPrice = 0;
   int activebutton = 0;
   boolean firstButtonActived = false;
   boolean secondButtonActived = false;
   public CheckBoxDemonstration()
   {
      super("CheckBox Demonstration");
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setLayout(new FlowLayout());
      label.setFont(new Font("Arial", Font.ITALIC, 22));
      vision.addItemListener(this);
      dental.addItemListener(this);
      button1.addActionListener(this);
      button2.addActionListener(this);
      add(label);
      add(vision);
      add(dental);
      add(button1);
      add(button2);
      add(totPrice);
      
  }
   
   public void actionPerformed(ActionEvent actEvent)
   {
	   
	   Object source = actEvent.getSource();
	   if(source == button1)
		  {
		   	
			if(secondButtonActived == true)
			{
				totalPrice += 600; 
				totalPrice -= 200;
				activebutton = 1;
				secondButtonActived = false;
        firstButtonActived = true;
			}
			else if(activebutton == 0 ) {
				totalPrice += 600;
				activebutton = 1;
				firstButtonActived = true;
			}
			else if(activebutton == 1) 
			{
				totalPrice-= 600;
				activebutton = 0; //means it already been subtracted
				firstButtonActived = true;
			}
			
			  
			  totPrice.setText("$" + totalPrice);
		  }
		  else if(source == button2)
		  {
			  if(firstButtonActived == true)
				{
					totalPrice -= 600;
					totalPrice += 200;
					activebutton = 1;
					firstButtonActived = false;
          secondButtonActived = true;
				}
				else if(activebutton == 0 ) {
					totalPrice += 200;
					activebutton = 1;
					secondButtonActived = true;
				}
				else if(activebutton == 1) 
				{
					totalPrice-= 200;
					activebutton = 0; //means it already been subtracted
					secondButtonActived = true;
				
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
		  }
		  else
		  {
			  totalPrice -= 20;
			  totPrice.setText("$" + totalPrice);
		  }
	  }
	  else if(source == dental)
		  {
		  if(select == ItemEvent.SELECTED)
			  {
			  totalPrice += 75;
			  totPrice.setText("$" + totalPrice);
			  }else {
		  totalPrice -= 75;
		  totPrice.setText("$" + totalPrice);
		  }
	
		  }
	  
	}
} 
  
		activebutton = 0; //means it already been subtracted
				firstButtonActived = true;
			}
			
			  
			  totPrice.setText("$" + totalPrice);
		  }
		  else if(source == button2)
		  {
			  if(firstButtonActived == true)
				{
					totalPrice -= 600;
					totalPrice += 200;
					activebutton = 1;
					firstButtonActived = false;
				}
				else if(activebutton == 0 ) {
					totalPrice += 200;
					activebutton = 1;
					secondButtonActived = true;
				}
				else if(activebutton == 1) 
				{
					totalPrice-= 200;
					activebutton = 0; //means it already been subtracted
					secondButtonActived = true;
				
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
		  }
		  else
		  {
			  totalPrice -= 20;
			  totPrice.setText("$" + totalPrice);
		  }
	  }
	  else if(source == dental)
		  {
		  if(select == ItemEvent.SELECTED)
			  {
			  totalPrice += 75;
			  totPrice.setText("$" + totalPrice);
			  }else {
		  totalPrice -= 75;
		  totPrice.setText("$" + totalPrice);
		  }
	
		  }
	  
	}
	  
  public static void main(String[] arguments)
  {
      final int FRAME_WIDTH = 190;
      final int FRAME_HEIGHT = 320;
      CheckBoxDemonstration frame =
         new CheckBoxDemonstration();
      frame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
      frame.setVisible(true);
  }
}
