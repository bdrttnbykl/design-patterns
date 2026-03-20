public class Main {

    public static void main(String[] args) {

        Bildirim bildirim1 = BildirimFactory.createBildirim("email");
        bildirim1.gonder();

        Bildirim bildirim2 = BildirimFactory.createBildirim("sms");
        bildirim2.gonder();
    }
}