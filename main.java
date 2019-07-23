import java.util.Scanner;
import java.util.ArrayList;
public class Main
{

public static void main(String[] args) {
 //Initializations
 boolean stopper = true;
 ArrayList<Plane> planes = new ArrayList<>();
 ArrayList<Flight> flights = new ArrayList<>();

 //Initial print statements
System.out.println("Airport panel");
System.out.printf("--------------------\n\n");
while(stopper){
 disp1();
 stopper = getInput(planes, flights);
}
System.out.println("");
//Final print statements
for(Flight curr : flights){
 curr.getCapacity(planes);
 }
 ArrayList.sort(flights);
 ArrayList.sort(planes);
stopper = true;
System.out.println("Flight service");
System.out.printf("------------\n\n");
while(stopper){
 disp2();
 stopper = getInput2(planes,flights);
}
}
public static void disp1(){
 System.out.printf("Choose operation:\n");
 System.out.printf("[1] Add airplane\n[2] Add flight\n[x] Exit\n> ");

}
public static boolean getInput(ArrayList<Plane> planes, ArrayList<Flight> flights){
 Scanner userInput = new Scanner(System.in);
 char choice = userInput.next().charAt(0);

 if(choice == '1'){
 Plane current = new Plane();
 current.getPlaneId();
 current.getCapacity();
 planes.add(current);
 return true;
 }
 else if(choice == '2'){
 Flight current = new Flight();
 current.getPlaneId();
 current.getDeparture();
 current.getDestination();

 flights.add(current);

 return true;
 }
 else if(choice == 'x'){
 return false;
 }
 else{
 return true;
 }

}
public static void disp2(){

 System.out.printf("Choose operation:\n");
 System.out.printf("[1] Print planes\n[2] Print flights\n[3] Print plane info\n[x] Quit\n> ");
}
public static boolean getInput2(ArrayList<Plane> planes, ArrayList<Flight> flights){

 Scanner userInput = new Scanner(System.in);
 char choice = userInput.next().charAt(0);
 if(choice == '1'){
 for(Plane curr : planes){

 curr.display();

 }
 return true;
 }
 else if(choice == '2'){
 for(Flight fly : flights){

 fly.display();

 }
 return true;

 }
 else if(choice == '3'){
 int check = 0;
 Scanner x = new Scanner(System.in);
 System.out.print("Give plane ID: ");
 String givenId = x.nextLine();
 for(Plane curr : planes){
 if(curr.displayId().equals(givenId)){
 curr.printInfo();
 check = 1;

 }
 
 }
 return true;
 }
 else if(choice == 'x'){
 return false;

 }
 else{
 return true;
 }

}
}
