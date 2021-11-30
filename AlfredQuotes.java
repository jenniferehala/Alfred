import java.util.Date;

public class AlfredQuotes {

    public String basicGreeting() {
        return "Hello, lovely to see you. How are you?";
    }

    public String guestGreeting(String name) {
        return "Hello " + name + ". Lovely to see you.";
    }

    public String guestGreeting(String name, String dayPeriod) {
        return "Good " + dayPeriod + ", " + name + ". Lovely to see you.";
    }

    public String dateAnnouncement() {
        Date date = new Date();
        return "It is currently " + date;
    }

    public String respondBeforAlexis(String conversation) {
        if(conversation.indexOf("Alexis") > -1){
            return "Right away, sir. She certainly isn't sophisticated enough for that.";
        }

        if(conversation.indexOf("Alfred") > -1){
            return "At your service. As you wish, naturally";
        }
        return "Right. And with that I shall retire.";
    }
}