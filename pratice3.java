

class Pen {
String color;
String type;
public void write(){
    System.out.println("Ripunjai Shukla ");
}
public void printColor(){
System.out.println(this.color);
}
public void printType(){
System.out.println(this.type);
}
}
class Student{
    String name;
    int age;
    public  void printInfo(){
     System.out.println(this.name);
     System.out.println(this.age);
    }
    Student(String name , int age) {
       this.name = name;
       this.age = age;
    }
}

public class pratice3 {
    public static void main(String[] args) {
        Student S1 = new Student("Ashrut" , 18);
        
        // Pen P1 = new Pen();
        // Pen P2 = new  Pen();
        // // Student S1 = new Student();
        // P1.color = "Red";
        // P1.type = "Gel pen";
        // P2.color = "Black";
        // P2.type = "Ball pen";
        // // S1.name = "Ripunjai";
        // // S1.age = 20;

        // P1.write();
        // P1.printColor();
        // P1.printType();
        // P2.printColor();
        // P2.printType();
          S1.printInfo();
        
         
        
    }
}
