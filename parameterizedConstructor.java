class car{
    String color;
    int Model;

    public void country()
    {
        System.out.println("Made in China");
    }

    car(String color , int Model)
    {
        System.out.println(this.color = color);
        System.out.println(this.Model = Model);

    }
}

public class parameterizedConstructor {
    public static void main(String[] args) {

        car sportsCar  = new car("black" , 2019);
        // sportsCar.color = "Black" ;
        // sportsCar.Model = "2019";
        
    }
    
}
