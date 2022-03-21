import Bank.BankAccount;
import Bank.Card;
import Bank.Deposit;

public class Main {
    public static void main(String[] args) {
//        BankAccount ba = new BankAccount(1000);
//        ba.plusScore(450);
//        ba.minusScore(1500);
//        System.out.println("Остаток на счёте: " + ba.getScore());
//        Deposit dep = new Deposit(500);
//        dep.plusScore(100);
//        dep.minusScore(400);
//        System.out.println("Остаток на счёте: " + dep.getScore());
//        Card card = new Card(500);
//        card.plusScore(100);
//        card.minusScore(400);
//        System.out.println("Остаток на карте: " + card.getScore());
//        card.minusScore(193);
//        System.out.println("Остаток на карте: " + card.getScore());
        Card bank1 = new Card(1000);
        Deposit bank2 = new Deposit(1500);
//        bank1.plusScore(100);
        bank1.send(bank2, 990);
        System.out.println("Остаток на счёте 1 : " + bank1.getScore());
        System.out.println("Остаток на счёте 2 : " + bank2.getScore());
    }
}
