public class Main {
    public static void main(String[] args) {

        double currentBalance = 20;
        double rechargeAmount = 1100;
        double bonusRub = 1;

        if (rechargeAmount > 1000) {
            int bonusAmount = (int) (rechargeAmount / 100);

            double bonus = bonusAmount * bonusRub;

            double totalBalance = currentBalance + rechargeAmount + bonus;

            System.out.println("Итоговый счет " + totalBalance + " рублей");
            System.out.println("Бонусный счет " + bonus + " рублей");
        } else {
            double totalBalance = currentBalance + rechargeAmount;

            System.out.println("Итоговый счет " + totalBalance + " рублей");
            System.out.println("Бонусные рубли: 0 рублей.");
        }
    }
}