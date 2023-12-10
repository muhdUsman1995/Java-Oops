class Sports{
    String cricket;
    String football;

    public void worldcup()
    {
       System.out.println("this is about the worldcup in sports "); 
       System.out.println(this.cricket = cricket);
       System.out.println(this.football = football);

    }
    Sports(Sports eventSports)
    {
        // this.cricket = cricket;
        // this.football = football;
        
    }
    Sports()
    {
        // this.cricket = cricket;
        // this.football = football;

    }

}

public class CopyConstructor {
    public static void main(String[] args) {
        Sports playSports = new Sports();
        playSports.cricket = "test match";
        playSports.football = "friendly";

        Sports eventSports = new Sports(playSports);

        eventSports.worldcup();


       playSports.worldcup(); 

    }
    
}
