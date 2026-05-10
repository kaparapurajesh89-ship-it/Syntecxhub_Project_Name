import java.util.Scanner;
public class Restaurantbillingsystem {
     public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
     String item;
     int quantity;
     double price, total=0;
     while(true) {
    	 System.out.print("Enter the item name(or 'stop'):");
     item=sc.next();
     if(item.equalsIgnoreCase("stop")) 
    	 break; 
    	 System.out.print("Enter price:");
    	 price=sc.nextDouble();
    	 System.out.print("Enter quantity:");
    	 quantity=sc.nextInt();
     total+=price*quantity;
     }
     double Gst=total*0.05;
     double finalTotal=total+Gst;
     System.out.println("\n ---Bill---");
     System.out.println("Subtotal: "+total+ "Rs");
     System.out.println("Gst(5%): "+Gst+ "Rs");
     System.out.println("Total: "+finalTotal+ "Rs");
	}
}
