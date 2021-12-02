public class Main {
    public static void main(String[] args) {
        int currentAccount = 100;
        int refill = 1100;
        int totalAmount;
        int bonusAmount = refill / 100;
        if (refill > 1000) {
            totalAmount = currentAccount + refill + bonusAmount;
        } else {
            totalAmount = currentAccount + refill;
            bonusAmount = 0;
        }
        System.out.println("Общая сумма: " + totalAmount);
        System.out.println("Сумма бонусов: " + bonusAmount);
    }
}