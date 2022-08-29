import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }

    private static void task1() {
        int year = 1900;
        checkYear(year);
    }

    public static void checkYear(int year1) {
        boolean leapYear = isLeapYear(year1);
        printIsLeapYearResult(year1, leapYear);
    }

    private static boolean isLeapYear(int year11) {
        return year11 % 4 == 0 && year11 % 100 != 0 || year11 % 400 == 0;
    }

    private static void printIsLeapYearResult(int year111, boolean leapYear1) {
        if (leapYear1) {
            System.out.println(year111 + " - високосный год!");
        } else {
            System.out.println(year111 + " - не високосный год!");
        }
    }

    private static void task2() {
        int clientOS = 0;
        int clientDeviceYear = 2020;
        recommendApp(clientOS, clientDeviceYear);
    }

    public static void recommendApp(int clientOS, int clientDeviceYear) {
        String osName = getClientOS(clientOS);
        boolean checkDeviceYear = isModernDevice(clientDeviceYear);
        printRecommendation(osName, checkDeviceYear);
    }

    private static String getClientOS(int clientOS) {
        if (clientOS == 0) {
            return "iOS";
        }
        return "Android";
    }

    private static boolean isModernDevice(int clientDeviceYear) {
        int currentYear = LocalDate.now().getYear();
        return clientDeviceYear < currentYear;
    }

    private static void printRecommendation(String osName, boolean checkDeviceYear) {
        if (checkDeviceYear) {
            System.out.print("Установите lite-версию приложения для ");
        } else {
            System.out.print("Установите обычную версию приложения для ");
        }
        if (osName.equals("iOS")) {
            System.out.println(osName);
        } else {
            System.out.println(osName);
        }
    }

    private static void task3() {
        int deliveryDistance = 65;
        int deliveryPeriod = findDeliveryPeriod(deliveryDistance);
        System.out.println("Необходимое количество дней для доставки - " + deliveryPeriod);
    }

    private static int findDeliveryPeriod(int deliveryDistance) {
        int minDaysToDelivery = 1;
        int deliveryInterval = 40;
        int startDeliveryInterval = 20;
        if (deliveryDistance <= startDeliveryInterval) {
            return minDaysToDelivery;
        } else {
            return minDaysToDelivery = minDaysToDelivery + (int) Math.ceil((deliveryDistance - startDeliveryInterval) / (double) deliveryInterval);
        }
    }
}