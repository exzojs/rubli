public class Main {
    public static void main(String[] args) {
        int client = 200;
        int summa = 1001;
        int bonus = summa / 100 + summa;
        int bonusRub = summa / 100;
        boolean sBonusom = summa >= 1000;
        int itog = sBonusom ? bonus : summa;
        int bonusShow = sBonusom ? bonusRub : 0;
        System.out.println(itog + client + " Итоговый счет");
        System.out.println(bonusShow + " Бонусные рубли");


    }
}
