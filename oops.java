

// class Pen {

    // making blue print of a Pen
    // String color;
    // String type;
    
// funtions defined in a class is called methods
    // public void write() {
    // System.out.println("writing something");
    // }

    // public void Peninfo() {

    // System.err.println(this.color);
    // // this batata ha k is function ko kis object nay call kea ha jese
    // // Peninfo function ha yahan to isko call kea ha pen1.clor nay

    // // ye btata ha k kon c jagah is method ko access krna chah rahi

    // System.err.println(this.type);
// }

class Student {
    String name ;
    int age ;

  
    public void printName() {
        System.out.println(this.name);
        System.out.println(this.age);
    }

        Student(){
            System.out.println("constructor called ");
        }
    }


public class oops {
    public static void main(String[] args) {

        // new is a keyword

        Student s1 = new Student(); // student() is a constructor -constructs java ojects
        s1.name = "ALi";
        s1.age = 28;

        s1.printName();

    }

    // here type of a object would be class name like Pen
    // Pen pen1 = new Pen();

    // // defining type and color of a Pen
    // pen1.color = "Black";
    // pen1.type = "Ball point";

    // // lets create a new Pen
    // Pen pen2 = new Pen();
    // pen2.color = "Red";
    // pen2.type = "gell";

    // pen1.Peninfo();
    // pen2.Peninfo();

    // here we are calling write method for Pen1 object
    // pen1.write();
    // pen1.Peninfo();

}
