package com.TasyBites.Tasty_Bites;


import jakarta.persistence.*;

@Entity
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String customerName;
    private String itemName;
    private int quantity;
    private double totalPrice;
    private String address;
    private String status; // e.g. "Pending", "Confirmed"
	public void setStatus(String string) {
		// TODO Auto-generated method stub
		
	}
	public String getItemName() {
		// TODO Auto-generated method stub
		return null;
	}
	public double getQuantity() {
		// TODO Auto-generated method stub
		return 0;
	}
	public void setTotalPrice(double d) {
		// TODO Auto-generated method stub
		
	}
	public double getQuantity1() {
		// TODO Auto-generated method stub
		return 0;
	}
	
    // Getters and Setters
    // ...
}
