package hotelmanagementsystem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class AddRooms extends JFrame implements ActionListener{
	
	JButton addroom , cancel;
	JTextField tfroom, tfprice;
	JComboBox availablecombo, cleaningcombo, typecombo;
	
	AddRooms(){
		setLayout(null);
		
		JLabel heading = new JLabel("Add Rooms");
		heading.setBounds(150, 20, 200,20 );
		heading.setFont(new Font("Tahoma", Font.BOLD , 18));
		add(heading);
		
		
		
		JLabel lblroomno = new JLabel("Room Number");
		lblroomno.setBounds(60,80,120,30);
		lblroomno.setFont(new Font("Tahoma", Font.PLAIN , 16 ));
		add(lblroomno);
		
		tfroom = new JTextField();
		tfroom.setBounds(200,80,150,30);
		add(tfroom);
		
		
		JLabel lblavailable = new JLabel("Available");
		lblavailable.setBounds(60,130,120,30);
		lblavailable.setFont(new Font("Tahoma", Font.PLAIN , 16 ));
		add(lblavailable);
		
		String str[]= {"Available" , "Occupied"};
		availablecombo = new JComboBox(str);
		availablecombo.setBounds(200, 130, 150, 30);
		availablecombo.setBackground(Color.WHITE);
		add(availablecombo);
		
		

		JLabel lblclean = new JLabel("Cleaning Status");
		lblclean.setBounds(60,180,120,30);
		lblclean.setFont(new Font("Tahoma", Font.PLAIN , 16 ));
		add(lblclean);
		
		String str1[]= {"Cleaned" , "Dirty"};
		cleaningcombo = new JComboBox(str1);
		cleaningcombo.setBounds(200, 180, 150, 30);
		cleaningcombo.setBackground(Color.WHITE);
		add(cleaningcombo);
		
		
		
		JLabel lblprice = new JLabel("Price");
		lblprice.setBounds(60,230,120,30);
		lblprice.setFont(new Font("Tahoma", Font.PLAIN , 16 ));
		add(lblprice);
		
		tfprice = new JTextField();
		tfprice.setBounds(200,230,150,30);
		add(tfprice);
		
		
		
		JLabel lbltype = new JLabel("Bed Type");
		lbltype.setBounds(60,280,120,30);
		lbltype.setFont(new Font("Tahoma", Font.PLAIN , 16 ));
		add(lbltype);
		
		String str2[]= {"Single Bed" , "Double Bed"};
		typecombo = new JComboBox(str2);
		typecombo.setBounds(200, 280, 150, 30);
		typecombo.setBackground(Color.WHITE);
		add(typecombo);
		
		
		
		addroom = new JButton("Add Room");
		addroom.setBounds(60, 350,130,30);
		addroom.setBackground(Color.BLACK);
		addroom.setForeground(Color.WHITE);
		addroom.addActionListener(this);
		add(addroom);
		
		cancel = new JButton("Cancel");
		cancel.setBounds(220, 350,130,30);
		cancel.setBackground(Color.BLACK);
		cancel.setForeground(Color.WHITE);
		cancel.addActionListener(this);
		add(cancel);
		
		
		
		ImageIcon  i1 = new ImageIcon(getClass().getResource("/icons/twelve.jpg"));
		JLabel image = new JLabel(i1);
		image.setBounds(400, 30, 500, 300);   //helps to crop image
		add(image);
		
		
		
		getContentPane().setBackground(Color.WHITE);
		setBounds(330,200,940,470);
		setVisible(true);
		
		
	}
	
	public void actionPerformed(ActionEvent ae) {
		if(ae.getSource() == addroom) {
			String roomnumber = tfroom.getText();
			String availability = (String)availablecombo.getSelectedItem();
			String status = (String)cleaningcombo.getSelectedItem();
			String price = tfprice.getText();
			String type = (String)typecombo.getSelectedItem();
			
			if(roomnumber.equals("")) {
				JOptionPane.showMessageDialog(null, "Room Number should not be empty");
				return;
			}
			
			
			if(price.equals("") || !price.matches("\\d+")) {
				JOptionPane.showMessageDialog(null, "Price should not be empty");
				return;
			}
			
			
			
			
			try {
				Conn conn = new Conn();
				
				String str = "insert into room values ('"+roomnumber+"', '"+availability+"', '"+status+"','"+price+"','"+type+"')";
				
				conn.s.executeUpdate(str);
				
				JOptionPane.showMessageDialog(null, "New Room Added Successfully");
				
				setVisible(false);
				
			}catch(Exception e) {
				e.printStackTrace();
			}
			
		}else {
			setVisible(false);
		}
		
	}
	
	public static void main(String[] args) {
		new AddRooms();
	}

}
