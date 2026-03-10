import java.util.*;
class Example3{
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("the the year :");
    try {
     int year = sc.nextInt(); 
     if (year%4==0) {
        System.out.println("This is leap year :");
     }  else{
        System.out.println("this is not leap year");
     } 
    }catch (Exception e) {
        // TODO: handle exception
    } 

}
}