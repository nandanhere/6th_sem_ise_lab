package facadeDemo;

import java.util.*;

 
public class ItemsPurchased {
	HashMap<String,Integer> hm;
	int type;
   
    public ItemsPurchased() {
    	hm = new HashMap<String,Integer>();
    	storePurchase();
    }

  
    private HashMap<String,Integer> items;

  
    private Scanner scan;

   
    private int itemTypes;

 
    private String iname;
     private Integer iqty;

  

     
    public int getTypeCount() {
        return type;
    }

  
    public void showItems() {
    	System.out.println("Items Purchased:-");
    	Set<Map.Entry<String, Integer>> set  = hm.entrySet();
    	for(Map.Entry<String, Integer> i : set) {
    		System.out.println(i.getKey() + ":" + i.getValue());
    	}
     }
 
    private void storePurchase() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number of types of items:");
        type = Integer.parseInt(in.nextLine());
        for(int i = 1; i <=  type;i++)
        {
        	System.out.println("Enter name of item " + i +  ":");
        	String name = in.nextLine();
        	System.out.println("Enter Quantity of item " + i +  ":");
        	iqty  = Integer.parseInt(in.nextLine());
        	hm.put(name, iqty);
        }
    }

}