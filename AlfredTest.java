public class AlfredTest {
    public static void main(String[] args){

    AlfredQuotes alfredBot = new AlfredQuotes();
    //test greeting
        String testGreeting = alfredBot.basicGreeting();
        System.out.println(testGreeting);
    //guest greeting
        String testGuestGreeting = alfredBot.guestGreeting("Jake");
        System.out.println(testGuestGreeting);

    //guestgreeting with full name
        String fullNameGreet = alfredBot.guestGreeting("Lauren", "Clise");
        System.out.println(fullNameGreet);

    //date announcement
        String testDateAnnouncement = alfredBot.dateAnnouncement();
        System.out.println(testDateAnnouncement);
    
    //respond before Alexis
        String alexisTest = alfredBot.respondBeforeAlexis("Alexis");
        System.out.println(alexisTest);

    //fetching food
        String fetchFood = alfredBot.provideFood("Jake", "Cheeseburger", 9.0);
        System.out.println(fetchFood);
    
    //yelling at Alexa
        String yellAtAlexa = alfredBot.yellAtAlexa("James");
        System.out.println(yellAtAlexa);

    //checking inventory
        String checkItemInventory = alfredBot.checkInventory("Cheez-its", 50);
        System.out.println(checkItemInventory);
    }
}
