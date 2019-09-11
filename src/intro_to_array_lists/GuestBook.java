package intro_to_array_lists;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class GuestBook implements ActionListener {
	JFrame frame = new JFrame();
	JButton button1 = new JButton();
	JButton button2 = new JButton();
	
	ArrayList<String> guestList = new ArrayList<String>();
	
	// Create a GUI with two buttons. One button reads "Add Name" and the other button reads "View Names". 
	// When the add name button is clicked, display an input dialog that asks the user to enter a name. Add
	// that name to an ArrayList. When the "View Names" button is clicked, display a message dialog that displays
	// all the names added to the list. Format the list as follows:
	// Guest #1: Bob Banders
	// Guest #2: Sandy Summers
	// Guest #3: Greg Ganders
	// Guest #4: Donny Doners
	public static void main(String [] args) {
		new GuestBook().createUI();
	}
	
	
	  void createUI() {
		button1.setText("Add Name");
		button2.setText("View Guests");
		button1.addActionListener(this);
		button2.addActionListener(this);
		frame.setLayout(new BorderLayout());
		frame.add(button1, BorderLayout.LINE_START); frame.add(button2, BorderLayout.LINE_END);
		frame.setSize(100, 100);
		frame.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == button1) {
			String guest = JOptionPane.showInputDialog("What is the name to be added?");
			guestList.add(guest);
		}
		else if(e.getSource() == button2) {
			System.out.println(guestList);
		}
		
	}
}
