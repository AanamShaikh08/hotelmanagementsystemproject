package hotelmanagementsystem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Reception extends JFrame implements ActionListener{
	JButton newCustomer,rooms,departments, allEmployee, customers, managerInfo, checkout, update, roomStatus,pickup, searchRoom, logout;
	
	Reception() {
		setLayout(null);
		getContentPane().setBackground(Color.white);
		
		
		newCustomer = new JButton("New Customer Form");
		newCustomer.setBounds(10, 30, 200, 30);
		newCustomer.setBackground(Color.black);
		newCustomer.setForeground(Color.WHITE);
		newCustomer.addActionListener(this);
		add(newCustomer);
		
		rooms = new JButton("Rooms");
		rooms.setBounds(10, 70, 200, 30);
		rooms.setBackground(Color.black);
		rooms.setForeground(Color.WHITE);
		rooms.addActionListener(this);
		add(rooms);
		
		departments = new JButton("Departments");
		departments.setBounds(10, 110, 200, 30);
		departments.setBackground(Color.black);
		departments.setForeground(Color.WHITE);
		departments.addActionListener(this);
		add(departments);
		
		allEmployee = new JButton("All Employees");
		allEmployee.setBounds(10, 150, 200, 30);
		allEmployee.setBackground(Color.black);
		allEmployee.setForeground(Color.WHITE);
		allEmployee.addActionListener(this);
		add(allEmployee);
		
		customers = new JButton("Customers Info");
		customers.setBounds(10, 190, 200, 30);
		customers.setBackground(Color.black);
		customers.setForeground(Color.WHITE);
		customers.addActionListener(this);
		add(customers);
		
		managerInfo = new JButton("Manager Info");
		managerInfo.setBounds(10, 230, 200, 30);
		managerInfo.setBackground(Color.black);
		managerInfo.setForeground(Color.WHITE);
		managerInfo.addActionListener(this);
		add(managerInfo);
		
		checkout = new JButton("Checkout");
		checkout.setBounds(10, 270, 200, 30);
		checkout.setBackground(Color.black);
		checkout.setForeground(Color.WHITE);
		checkout.addActionListener(this);
		add(checkout);
		
		update = new JButton("Update Status");
		update.setBounds(10, 310, 200, 30);
		update.setBackground(Color.black);
		update.setForeground(Color.WHITE);
		update.addActionListener(this);
		add(update);
		
		roomStatus = new JButton("Update Room Status");
		roomStatus.setBounds(10, 350, 200, 30);
		roomStatus.setBackground(Color.black);
		roomStatus.setForeground(Color.WHITE);
		roomStatus.addActionListener(this);
		add(roomStatus);
		
		pickup = new JButton("Pickup Service");
		pickup.setBounds(10, 390, 200, 30);
		pickup.setBackground(Color.black);
		pickup.setForeground(Color.WHITE);
		pickup.addActionListener(this);
		add(pickup);
		
		searchRoom = new JButton("Search Room");
		searchRoom.setBounds(10, 430, 200, 30);
		searchRoom.setBackground(Color.black);
		searchRoom.setForeground(Color.WHITE);
		searchRoom.addActionListener(this);
		add(searchRoom);
		
		logout = new JButton("Logout");
		logout.setBounds(10, 470, 200, 30);
		logout.setBackground(Color.black);
		logout.setForeground(Color.WHITE);
		logout.addActionListener(this);
		add(logout);
		
		ImageIcon i1 = new ImageIcon(getClass().getResource("/icons/fourth.jpg"));
		JLabel image = new JLabel(i1);
		image.setBounds(250, 30, 500, 470);
		add(image);
		
		setBounds(350, 200, 800, 570);
		setVisible(true);
		
	}
	
	public void actionPerformed(ActionEvent ae) {
		if(ae.getSource() == newCustomer) {
			setVisible(false);
			new AddCustomer();
		}else if(ae.getSource() == rooms) {
			setVisible(false);
			new Room();
		}else if(ae.getSource() == departments) {
			setVisible(false);
			new Department();
		}else if(ae.getSource() == allEmployee) {
			setVisible(false);
			new EmployeeInfo();
		}else if(ae.getSource() == managerInfo) {
			setVisible(false);
			new ManagerInfo();
		}else if(ae.getSource() == customers) {
			setVisible(false);
			new CustomerInfo();
		}else if(ae.getSource() == searchRoom) {
			setVisible(false);
			new SearchRoom();
		}else if(ae.getSource() == update) {
			setVisible(false);
			new UpdateCheck();
		}else if(ae.getSource() == roomStatus) {
			setVisible(false);
			new UpdateRoom();
		}else if(ae.getSource() == pickup) {
			setVisible(false);
			new Pickup();
		}else if(ae.getSource() == checkout) {
			setVisible(false);
			new Checkout();
		}else if(ae.getSource() == logout) {
			setVisible(false);
			System.exit(0);
		}
	}
	
	public static void main(String[] args) {
		new Reception();
	}

}
