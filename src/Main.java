public class Main {
    public static void main(String[] args) {
        int client = 200;
        int summa = 2000;
        int bonus = summa / 100 + summa + client;
        int bonusRub = summa / 100;
        int bezBonusa = summa + client;
        boolean sBonusom = summa >= 1000;
        int itog = sBonusom ? bonus : bezBonusa;
        System.out.println(itog + " Итоговый счет");
        System.out.println(bonusRub + " Бонусные рубли");


    }
}
