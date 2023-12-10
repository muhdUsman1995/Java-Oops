// class Father{
//      String children;
// }
// class son extends Father
// {
//     //it inherits properties of Father class
// }

// single level inheritance

class Shape{
    public void area()
    {
        System.out.println("displays area ");
    }
}
class Triangle extends Shape{
    public  void area (int l , int h)
    {
        System.out.println(1/2 *l*h);
    }
}
// .....................single level inheritance ............//

// Multilevel Inheritance 
// here equilateral trianngle class inherits from trianngle class
// levels are created here like shape --? Triangle --> equilateral

class equilateral extends Triangle{
    public void area (int l , int h)
    {
        System.out.println(1/2*l*h);
    }
}

// ...............multilevel inheritance......

// Hierarchial Triangle
// one base class and multiple derived ans sub classes

class circle extends Shape {
    public void area( int r)
    {
        System.out.println((3.14) * r * r);
    }
}

// ...........Hierarchial inheritance.........








public class inheritance 
//reusability increases, we don't need to write same code
// one is base class which gives properties and other one is child class which takes properties

{
    public static void main(String[] args) {
        // son usman = new son();
        // usman.children = "elder"; //children is a property of FATHER class , and son class inherits properties of Father

        // $ types of inheritance
        // 1- single level inheritance





        
    }
    
}
