public class AlfredTest {

    public static void main(String[] args) {

        AlfredQuotes alfredBot = new AlfredQuotes();

        String testGreeting = alfredBot.basicGreeting();
        String testGuestGreeting = alfredBot.guestGreeting("Jennifer");
        String testDateAnnouncent = alfredBot.dateAnnouncement();

        String alexisTest = alfredBot.respondBeforAlexis("Alexis lay some low-fi beats.");

        String testguestGreeting2 = alfredBot.guestGreeting("Jennifer", "evening");

        System.out.println(testGreeting);
        System.out.println(testGuestGreeting);
        System.out.println(testDateAnnouncent);
        System.out.println(alexisTest);
        System.out.println(testguestGreeting2);


    }
}