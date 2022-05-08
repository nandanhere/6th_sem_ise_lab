package facadeDemo;

import java.util.*;


public class ProcessSales {

   
    public ProcessSales() {
    }

    public Boolean giftCert;

    private int qty;

    public float amount;

    public   ProcessSales( boolean b,  int i,  float f) {
    	this.giftCert = b;
    	amount = f;
    	qty = i;
    	
    }

    public void ProcessSale() {
        if (!giftCert) {
        	System.out.println("You dont have a Gift cert");
        	System.out.println("Amount Payable : " + amount );
        }
        else {
        	Scanner sc = new Scanner(System.in);
        	System.out.println("Enter Gift Certificate Value");
        	float certValue = Float.parseFloat(sc.nextLine());
        	if (qty <=0) {
            	System.out.println("No items in cart");
        	}
        	else if (qty > 1) {
        		System.out.println("only one item can be purchased with gift cert");
       
        	}
        	else {
        		if (amount > certValue) {
            		System.out.println("Please pay balance amount in cash Rs:" + (amount - certValue));
            
        			
        		}
        		else {
            		System.out.println("No cashback will be refunded Thank you for purchase");

        		}
        	}
        }
    }

}