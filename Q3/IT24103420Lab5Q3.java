import java.util.Scanner;

public class IT24103420Lab5Q3 {
    public static final int ROOM_CHARGE_PER_DAY = 48000;   
    public static final int MIN_DAY = 1;
    public static final int MAX_DAY = 31;
    private static final int DISCOUNT_3_4_DAYS = 10;
    private static final int DISCOUNT_5_OR_MORE_DAYS = 20;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter start date (1-31): ");
        int startDate = scanner.nextInt();
        System.out.print("Enter end date (1-31): ");
        int endDate = scanner.nextInt();  

        if (startDate < MIN_DAY || startDate > MAX_DAY || endDate < MIN_DAY || endDate > MAX_DAY) {
            System.out.println("Error: startDate and endDate must be between 1 and 31.");
            return;
        }

        if (startDate >= endDate) {
            System.out.println("Error: startDate must be less than endDate.");
            return;
        }

        int numberOfDays = endDate - startDate;
        int discountRate = 0;

        if (numberOfDays == 3 || numberOfDays == 4) {
            discountRate = DISCOUNT_3_4_DAYS;  
        } else if (numberOfDays >= 5) {
            discountRate = DISCOUNT_5_OR_MORE_DAYS;  
        }

        int totalCost = numberOfDays * ROOM_CHARGE_PER_DAY;
        int discountAmount = totalCost * discountRate / 100;
        int finalAmount = totalCost - discountAmount;

        System.out.println("Number of days reserved: " + numberOfDays);
        System.out.println("Total amount to be paid: Rs " + finalAmount);
    }
}
