// import java.net.Socket;


//functional overloading, there should be some differentiating factor like return types should be different , parameters type should be 
// changed

class People{
    String name;
    int age;

    public void PrintInfo(String name)
    {
        System.out.println(name);
    }
    public void PrintInfo(int age)
    {
        System.out.println(age);
    }
    public void PrintInfo(String name , int age)
    {
        System.out.println(name + " " + age);
    }

}

public class polymorphism {
    public static void main(String[] args) {
        // fucntion overloading - Compile type
        //  & function overriding - run type

        People data = new People();
        // data.name = "usman";
        // data.age = 28;

        // data.PrintInfo("usman khan", 29);
        data.PrintInfo(30);    
    }
}
