class pen{
    String color;
    String type;
public void write(){
    System.out.println(this.color);
}
}




public class pratice {
    public static void main(String[] args) {
        pen pen1 = new pen();
        pen1.color = "Red";
        pen1.type = "Gel";

        pen1.write();
    }
}
