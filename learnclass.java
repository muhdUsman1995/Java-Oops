class English{
       String chapter1;
       String chapter2;
    
public void learn()
{
    System.out.println("student will learn chapters of engish book in this class");
    System.out.println(this.chapter1);
    System.out.println(this.chapter2);
}
}

public class learnclass {
    public static void main(String[] args) { 
        English teachlesson = new English();
        teachlesson.chapter1 = " Mr .chips";
        teachlesson.chapter2 = " Grammar";
        

        teachlesson.learn();
        
    }
 
}

