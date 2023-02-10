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
    public String respondBeforeAlexis(String phrase){
        if(phrase.indexOf("Alexis") > -1) {
            return "Right away, sir. She's not of much help anyways!";
        }
        if(phrase.indexOf("Alfred") > -1) {
            return "Yes, how can I assist you?";
        }
        return ("Righto, i'll be gone until i'm needed next.");
    }
    public String provideFood(String name, String food, Double price) {
        return String.format("Yes, %s I can absolutely fetch your %s, that'll be $%s...kidding, master Wayne never charges his guests.", name, food, price);
    }

    public String yellAtAlexa(String phrase){
        if(phrase.indexOf("Alexa") > -1) {
            return "SHUT UP ALEXA, I AM THE SMARTEST TECH IN THIS HOUSE";
        }
        return("Thank you for letting me serve you, and not Alexa.");
    }
    public String checkInventory(String item, Integer count){
        return String.format("The remaining number of %s is %s.", item, count);
    
    }
}