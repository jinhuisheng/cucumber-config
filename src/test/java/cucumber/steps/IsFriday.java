package cucumber.steps;

public class IsFriday {

    public static String isFriday(String today) {
        return "Friday".equals(today) ? "TGIF" : "NOPE";
    }
}
