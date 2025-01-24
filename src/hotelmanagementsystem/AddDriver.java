package hotelmanagementsystem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;



public class AddDriver extends JFrame implements ActionListener{
	

	JButton adddriver , cancel;
	JTextField tfname, tfage, tfcompany,tfmodel,tflocation;
	JRadioButton rbmale,rbfemale;
	JComboBox gendercombo, availablecombo;
	
	AddDriver(){
		setLayout(null);
		
		JLabel heading = new JLabel("Add Drivers");
		heading.setBounds(150, 10, 200,20 );
		heading.setFont(new Font("Tahoma", Font.BOLD , 18));
		add(heading);
		
		
		
		
		
		JLabel lblname = new JLabel("Name");
		lblname.setBounds(60,70,120,30);
		lblname.setFont(new Font("Tahoma", Font.PLAIN , 16 ));
		add(lblname);
		
		tfname = new JTextField();
		tfname.setBounds(200,70,150,30);
		add(tfname);
		
		
		
		
		
		JLabel lblage = new JLabel("Age");
		lblage.setBounds(60,110,120,30);
		lblage.setFont(new Font("Tahoma", Font.PLAIN , 16 ));
		add(lblage);
		
		tfage = new JTextField();
		tfage.setBounds(200,110,150,30);
		add(tfage);
		
		
		
		
		
		JLabel lblgender = new JLabel("Gender");
		lblgender.setBounds(60,150,120,30);
		lblgender.setFont(new Font("Tahoma", Font.PLAIN , 16 ));
		add(lblgender);
		
		String str1[]= {"Male" , "Female"};
		gendercombo = new JComboBox(str1);
		gendercombo.setBounds(200, 150, 150, 30);
		gendercombo.setBackground(Color.WHITE);
		add(gendercombo);
		
		
		
		
		
		
		JLabel lblcar = new JLabel("Car Company");
		lblcar.setBounds(60,190,120,30);
		lblcar.setFont(new Font("Tahoma", Font.PLAIN , 16 ));
		add(lblcar);
		
		tfcompany = new JTextField();
		tfcompany.setBounds(200,190,150,30);
		add(tfcompany);
		
		
		
		
		
		JLabel lbltype = new JLabel("Car Model");
		lbltype.setBounds(60,230,120,30);
		lbltype.setFont(new Font("Tahoma", Font.PLAIN , 16 ));
		add(lbltype);
		
		tfmodel = new JTextField();
		tfmodel.setBounds(200,230,150,30);
		add(tfmodel);
		
		
		
		
		JLabel lblavailable = new JLabel("Available");
		lblavailable.setBounds(60,270,120,30);
		lblavailable.setFont(new Font("Tahoma", Font.PLAIN , 16 ));
		add(lblavailable);
		
		String str2[]= {"Available" , "Busy"};
		availablecombo = new JComboBox(str2);
		availablecombo.setBounds(200, 270, 150, 30);
		availablecombo.setBackground(Color.WHITE);
		add(availablecombo);
		
		
		
		
		JLabel lbllocation = new JLabel("Location");
		lbllocation.setBounds(60,310,120,30);
		lbllocation.setFont(new Font("Tahoma", Font.PLAIN , 16 ));
		add(lbllocation);
		
		tflocation = new JTextField();
		tflocation.setBounds(200,310,150,30);
		add(tflocation);
		
		
		
		adddriver = new JButton("Add Driver");
		adddriver.setBounds(60, 370,130,30);
		adddriver.setBackground(Color.BLACK);
		adddriver.setForeground(Color.WHITE);
		adddriver.addActionListener(this);
		add(adddriver);
		
		cancel = new JButton("Cancel");
		cancel.setBounds(220, 370,130,30);
		cancel.setBackground(Color.BLACK);
		cancel.setForeground(Color.WHITE);
		cancel.addActionListener(this);
		add(cancel);
		
		
		
		ImageIcon  i1 = new ImageIcon(getClass().getResource("/icons/eleven.jpg"));
		Image i2 = i1.getImage().getScaledInstance(500, 300, Image.SCALE_DEFAULT);
		ImageIcon i3 = new ImageIcon(i2);
		JLabel image = new JLabel(i3);
		image.setBounds(400, 30, 500, 300);   //helps to crop image
		add(image);
		
		
		
		getContentPane().setBackground(Color.WHITE);
		setBounds(300,200,980,470);
		setVisible(true);
		
		
	}
	
	public void actionPerformed(ActionEvent ae) {
		if(ae.getSource() == adddriver) {
			String name = tfname.getText();
			String age = tfage.getText();
			String gender = (String)gendercombo.getSelectedItem();
			String company = tfcompany.getText();
			String brand = tfmodel.getText();
			String available = (String)availablecombo.getSelectedItem();
			String location = tflocation.getText();
			
			
			if(name.equals("")) {
				JOptionPane.showMessageDialog(null, "Name should not be empty");
				return;
			}
			
			if(age.equals("")) {
				JOptionPane.showMessageDialog(null, "Age should not be empty");
				return;
			}
			
			if(company.equals("")) {
				JOptionPane.showMessageDialog(null, "Company should not be empty");
				return;
			}
			
			if(brand.equals("")) {
				JOptionPane.showMessageDialog(null, "Brand should not be empty");
				return;
			}
			
			if(location.equals("")) {
				JOptionPane.showMessageDialog(null, "Location should not be empty");
				return;
			}
			
			
			
			try {
				Conn conn = new Conn();
				
				String str = "insert into driver values ('"+name+"', '"+age+"','"+gender+"','"+company+"', '"+brand+"','"+available+"','"+location+"')";
				
				conn.s.executeUpdate(str);
				
				JOptionPane.showMessageDialog(null, "New Driver Added Successfully");
				
				setVisible(false);
				
			}catch(Exception e) {
				e.printStackTrace();
			}
			
		}else {
			setVisible(false);
		}
		
	}
	
	public static void main(String[] args) {
		new AddDriver();
	}

}



