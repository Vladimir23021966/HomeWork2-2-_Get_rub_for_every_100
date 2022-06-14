public class Main<accountWithBonus> {
    public static void main(String[] args) {
        int initialAccount = 100;
        // начальный счет
        int depositAmount = 800;
        // Величина пополнения счета
        int bonus;
        int finalAccount;
        // счет с учетом пополнения и без бонуса
        int accountWithBonus;
        // счет с бонусом

        finalAccount = initialAccount + depositAmount;

        if (finalAccount >= 1_000) {
            bonus = finalAccount / 100;
        } else {
            bonus = 0;
        }
        accountWithBonus = finalAccount + bonus;
        System.out.println("Итоговая сумма счета - " + accountWithBonus + " руб.");
        System.out.println("Бонус (Получи рубль за каждые 100 руб.) - " + bonus + " руб.");

    }

}
