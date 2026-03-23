public class Logger {

    // Tek bir nesne tutulacak
    private static Logger instance;

    // Constructor private -> dışarıdan new Logger() yapılamaz
    private Logger() {
        System.out.println("Logger nesnesi oluşturuldu.");
    }

    // Tek nesneye erişim metodu
    public static Logger getInstance() {
        if (instance == null) {
            System.out.println("Instance null, yeni nesne oluşturuluyor...");
            instance = new Logger();
        } else {
            System.out.println("Var olan Logger nesnesi kullanılıyor...");
        }
        return instance;
    }

    public void logYaz(String mesaj) {
        System.out.println("LOG: " + mesaj);
    }
}