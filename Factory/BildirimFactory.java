public class BildirimFactory {

    public static Bildirim createBildirim(String tip) {

        if (tip == null || tip.isEmpty()) {
            return null;
        }

        if (tip.equalsIgnoreCase("email")) {
            return new EmailBildirim();
        }

        if (tip.equalsIgnoreCase("sms")) {
            return new SmsBildirim();
        }

        return null;
    }
}