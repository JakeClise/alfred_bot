public class AlfredTest {
    public static void main(String[] args){

    AlfredQuotes alfredBot = new AlfredQuotes();
    //test greeting
        String testGreeting = alfredBot.basicGreeting();
        System.out.println(testGreeting);
    //guest greeting
        String testGuestGreeting = alfredBot.guestGreeting("Jake");
        System.out.println(testGuestGreeting);
    //date announcement
        String testDateAnnouncement = alfredBot.dateAnnouncement();
        System.out.println(testDateAnnouncement);
    }
}
