package viikko1;

public class PasswordAttempts {
    public static String login(String[] tries) {
        int attempts = 0;
        for (String t : tries) {
            if (attempts == 3) break;
            if ("java123".equals(t)) return "Tervetuloa!";
            attempts++;
        }
        return "Liian monta virheellistä yritystä.";
    }
}
