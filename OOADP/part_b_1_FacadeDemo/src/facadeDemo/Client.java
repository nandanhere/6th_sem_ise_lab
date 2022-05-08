package facadeDemo;
import java.util.*;


public class Client {

 
    public Client() {
    }

     
    public static void main(String[] args ) {
       Facade f = new Facade(false,100);
       f.displayItemsPurchased();
       f.calculateAmountToPay();
     }

}