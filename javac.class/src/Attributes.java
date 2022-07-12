public class Attributes {
    String fname = "suthesh";
    String lname = "black";
    int age = 23;

    public static void main(String[] args) {
        Attributes myObj = new Attributes();
        System.out.println("Name :" + myObj.fname + " " + myObj.lname);
        System.out.println("Age :" + myObj.age);
    }
}