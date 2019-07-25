import java.util.Scanner;
public class Plane{

 private String Id;
 private int capacity;
 public Scanner userInput = new Scanner(System.in);

 public void getPlaneId(){

 System.out.print("Give plane ID: ");
 this.Id = userInput.nextLine();
 }
 
 public void getCapacity(){

 System.out.print("Give plane capacity: ");
 this.capacity = userInput.nextInt();
 }

 public void display(){

 System.out.println(this.Id + " (" + String.valueOf(this.capacity) + " ppl)");


 }

 public String displayId(){

 return this.Id;


 }

 public int displayCapacity(){

 return this.capacity;


 }

 public void printInfo(){
 System.out.println(this.Id + " (" + this.capacity + " ppl)");
 }
}
