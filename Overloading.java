// public class Overloading {
//     double area (double r){
//         double x;
//         x = 3.14*r*r;
//         return x;
//     }
//     int area (int m, int n){
//         int x;
//         x = m*n;
//        return x;
//     }
//     public static void main(String[] args) {
//         Overloading O1 = new Overloading();
//         double m;
//         m = O1.area(3.5);
//         System.out.println("The area of the circle is"+m);
//         int k;
//         k = O1.area(2, 3);
//         System.out.println("The area of the circle is" + k);
//     }
      
// }


import java.util.Scanner;

public class Overloading {

    double area(double r) {
        return 3.14 * r * r;
    }

    int area(int m, int n) {
        return m * n;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Overloading O1 = new Overloading();
        System.out.print("Enter radius of circle: ");
        double radius = sc.nextDouble();
        double circleArea = O1.area(radius);
        System.out.println("Area of Circle = " + circleArea);
        System.out.print("Enter length of rectangle: ");
        int length = sc.nextInt();
        System.out.print("Enter breadth of rectangle: ");
        int breadth = sc.nextInt();
        int rectangleArea = O1.area(length, breadth);
        System.out.println("Area of Rectangle = " + rectangleArea);
        sc.close();
    }
}