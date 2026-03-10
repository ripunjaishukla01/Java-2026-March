class second {
    public  void display(){
        System.out.println("The praent class : ");
    }
}
public class ExampleInheritance extends second {
      public void childisplay(){
       System.out.println("The child  class ");
      }
      public static void main(String[] args) {
        second s = new second();
        s.display();
      }
}

