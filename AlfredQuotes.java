import java.util.Date;
public class AlfredQuotes{
    public String basicGreeting(){
        return "Hello, lovely to see you! How are you?";
    }
    public String guestGreeting(String name){
        return String.format("Hi %s how is everything?", name);
    }
    public String dateAnnouncement() {
        Date date = new Date();
        return ("The current date is: " + date);
    }
    public String respondBeforeAlexis(String converstaion){
        return ("for snarky response return string");
    }

}