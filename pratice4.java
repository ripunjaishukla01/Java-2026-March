// class pratice4 {

//     int add(int a, int b){
//         return a + b;
//     }

//     int add(int a, int b, int c){
//         return a + b + c;
//     }

//     double add(double a, double b){
//         return a + b;
//     }

//     public static void main(String[] args) {

//         pratice4 s = new pratice4();

//         System.out.println(s.add(10,20));
//         System.out.println(s.add(10,20,30));
//         System.out.println(s.add(5.5,6.5));
//     }
// }

class Animal{
    void sound(){
        System.out.println("Animal makes sound");
    }
}

class Dog extends Animal{
    void sound(){
        System.out.println("Dog barks");
    }
}

public class pratice4{
    public static void main(String[] args){

        Animal a = new Dog();
        a.sound();
    }
}