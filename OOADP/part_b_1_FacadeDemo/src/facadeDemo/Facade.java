package facadeDemo;

import java.util.*;

public class Facade {
	ItemsPurchased i;
	ProcessSales s;
	 


    public   Facade(boolean b ,  float f) {
    	i = new ItemsPurchased();
    	s = new ProcessSales(b,i.getTypeCount(),f);
    	    }

    public void displayItemsPurchased() {
        i.showItems();
    }

    public void calculateAmountToPay() {
        s.ProcessSale();
    }

}