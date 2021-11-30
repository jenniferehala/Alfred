import java.util.Date;

public class AlfredQuotes {

    public String basicGreeting() {
        
        return "Hello, lovely to see you. How are you?";
    }

    public String guestGreeting(String name) {
        
        
        return "Hello " + name + ". Lovely to see you.";
    }

    public String dateAnnouncement() {
        Date date = new Date();
        return "It is currently " + date;
    }

    public String respondBeforAlexis(String conversation) {
         int a = conversation.indexOf("Alexis");
        System.out.println(int a);
    }

}