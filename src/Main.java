public class Main {
    public static void main(String[] args) {
        int client = 200;
        int summa = 900;
        int bonus = summa / 100 + summa;
        int bonusRub = summa / 100;
        int bezBonusa = summa;
        int bezDeneg = 0;
        boolean sBonusom = summa >= 1000;
        int itog = sBonusom ? bonus : bezBonusa;
        int bonusShow = sBonusom ? bonusRub : bezDeneg;
        System.out.println(itog + client + " Итоговый счет");
        System.out.println(bonusShow + " Бонусные рубли");


    }
}
