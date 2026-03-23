public class Main {

    public static void main(String[] args) {

        System.out.println("Program başladı");

        Logger logger1 = Logger.getInstance();
        logger1.logYaz("1. log mesaji");

        System.out.println("-------------------");

        Logger logger2 = Logger.getInstance();
        logger2.logYaz("2.log mesaji");

        System.out.println("--------------------");

        Logger logger3 = Logger.getInstance();
        logger3.logYaz("3.log mesaji");

        System.out.println("--------------------");

        if (logger1 == logger2) {
            System.out.println("logger1 ile logger2 ayni nesneye referans edior");
        } else {
            System.out.println("logger1 ile logger2 farkli nesnelere referans edior");
        }
    }
}
