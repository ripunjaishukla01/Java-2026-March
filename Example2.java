import java.util.*;
public class Example2 {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.println("Enter the number ");
try {
    int grade = sc.nextInt();
    if (grade>=90 & grade<=100){
        System.out.println(grade+"your grade is "+"A+");
    }
    else if (grade>=80){
      System.out.println(grade+"your grade is "+"A");
    }
     else if (grade>=70){
      System.out.println(grade+"your grade is "+"B");
    }
     else if (grade>=60){
      System.out.println(grade+"your grade is "+"C");
    }
     else if (grade<=50 && grade>=35){
      System.out.println(grade+"your grade is "+"D");
    }
    else{
        System.out.println("you are Failled");
    }
} catch (Exception e) {
    // TODO: handle exception
    System.out.println("Error");
}    
}    
}
