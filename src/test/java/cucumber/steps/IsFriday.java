package cucumber.steps;

public class IsFriday {

    public static String isFriday(String today) {
        if (today.equals("Friday")) {
            return "TGIF";
        }
        return "Nope";
    }
}
