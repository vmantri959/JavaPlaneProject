import java.util.Scanner;
import java.util.ArrayList;
public class Flight{

 private String Id;
 private String departure;
 private String destination;
 private int capacity;
 public Scanner userInput = new Scanner(System.in);

 public void getPlaneId(){

 System.out.print("Give plane ID: ");
 this.Id = userInput.nextLine();
 }

 public void getDeparture(){

 System.out.print("Give departure airport code: ");
 this.departure = userInput.nextLine();
 }
 
 public void getDestination(){

 System.out.print("Give destination airport code: ");
 this.destination = userInput.nextLine();
 }

 public void getCapacity(ArrayList<Plane> planes){

 int check = 0;

 for(Plane curr : planes){

 if(curr.displayId().equals(this.Id)){

 this.capacity = curr.displayCapacity();
 check = 1;
 break;
 }
 }
 if(check == 0){
 this.capacity = 0;
 }

 }

 public void display(){

 System.out.println(this.Id + " (" + String.valueOf(this.capacity) + " ppl) (" + this.departure + " -" +
this.destination + ")"); 


}
}