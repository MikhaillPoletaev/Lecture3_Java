public class Test_2 {
    public static void main(String[] args){
        int account = 100; // изначальный баланс

        int add = 2000; // сумма пополнения

        int bonus = 0;

        if (add > 1000){
            bonus = add / 100;
        }
        int finalBalance = account + add + bonus;
        System.out.println("Баланс: " + finalBalance);
        System.out.println("Бонус: " + bonus);

    }
}
