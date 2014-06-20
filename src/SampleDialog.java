import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;


public class SampleDialog extends JFrame implements ActionListener 
{
	JLabel ansLabel;
	public static void main(String[] args)
	{
		SampleDialog frame = new SampleDialog();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setBounds(10, 10, 300, 150);
		frame.setTitle("English!");
		frame.setVisible(true);
	}
	SampleDialog()
	{
		JButton infoButton = new JButton("Get a quiz!");
		infoButton.addActionListener(this);
		
		JPanel p = new JPanel();
		p.setBackground(new Color(0xffffcc));
		p.add(infoButton);
		
		ansLabel = new JLabel("No-input");
		JPanel ansPanel = new JPanel();
		ansPanel.add(ansLabel);
		getContentPane().add(p,BorderLayout.CENTER);
		getContentPane().add(ansPanel,BorderLayout.PAGE_END);
		
	}
	@Override
	public void actionPerformed(ActionEvent e)
	{
		String selectValues[] = {"at","in","on","from"};
		int select = JOptionPane.showOptionDialog(this, 
				"which is the correct prop to fill up (*)? \n I saw your father standing (*) the bus stop.", //Message
				"Preposition",//title
				JOptionPane.YES_NO_OPTION, //type of option
				JOptionPane.QUESTION_MESSAGE,//msg type
				null, // no image 
				selectValues, //array of Buttons
				selectValues[0]);//where to start
		System.out.println("select is " + select);
		if(select == JOptionPane.CLOSED_OPTION)
		{
			ansLabel.setText("Closed before answering");
		}
		else if(select == 1)
		{
			ansLabel.setText("This is not correct answer try again");
			
		}else if(select == 0)
		{
			ansLabel.setText("correct answer is "+ selectValues[select] );
		}
		else if(select == 3)
		{
			ansLabel.setText("Sorry wrong answer Try again");
		}
		else if(select == 2)
		{
			ansLabel.setText("Umm.....Try again!");
		}
		else 
		{//dead code
			ansLabel.setText("Bye Bye!");
		}
		
	}

}
