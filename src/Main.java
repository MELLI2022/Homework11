import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Main {
    public static void main(String[] args) {
        checkYear(2020);
        extraditeDevice(0, 2014);
        int delivereDay = checkdelivereDay(60);
        //String checkdelivereDay = null;
        System.out.println("Необходимо дней доставки " + delivereDay);
    }


    public static void checkYear(int year) {
        System.out.println("Задание 1");
        if (year % 4 == 0 && year % 100 != 0 || year % 4 == 0) {
            System.out.println(year + " является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }
    }

    public static void extraditeDevice(int osType, int clientDeviceYear) {
        System.out.println("Задание 2");
        if (osType != 1 && osType != 0) {
            throw new IllegalArgumentException("Wrong OS type");
        }
        String osString = osType == 0 ? "IOS" : "Android";
        String versionString = clientDeviceYear > 2015 ? "обычную" : "облегченную";
        System.out.println("Установите  " + versionString + " версию приложения для " + osString + " по ссылке ");
    }


    public static int checkdelivereDay(int delivereDistance) {
        System.out.println("Задание 3");
        if (delivereDistance <= 20) {
            return 1;
        } else {
            return (int) Math.round((double) delivereDistance / 40) + 1;
        }
    }
}
