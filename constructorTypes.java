class Student {
    
    // properties

    String name ;
    int age;

    public void printName() {
        System.out.println(this.name);
        System.out.println(this.age);
    }
// non - perameterized constructor
    // Student() {
    //     System.out.println("constructor called");
    // }


    // perameterized constructor
     Student(String name , int age){
        this.name = name;
        this.age = age;
        

    }
}

public class constructorTypes {
    public static void main(String[] args) {
       

        // for perameterized
        Student s2 = new Student("usman" , 29);
        s2.printName();
        

    // constructorTypes: Perameterized , non-perameterized , copy constructor
    // constructor has same name as class name , doesnot return anything,niether any
    // return type.
    // when object is created then it is called only for once
    // non-perameterzed = which doesnot have any parameters
    

 // for non- perameterized
        // Student s1 = new Student(); // student() is a constructor -constructs java ojects
        // s1.name = "ALi";
        // s1.age = 28;


    }

}
