package Bank;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Deposit extends BankAccount {
    Calendar calendar = new GregorianCalendar();
    int oneDate;
    public Deposit(int score) {
        super(score);
    }

    public boolean send(BankAccount receiver, int amount) {
        boolean flag = true;
        if (this.score - amount >= 0 && (calendar.get(Calendar.DAY_OF_YEAR) - oneDate) >= 30) {
            this.score -= amount;
            receiver.plusScore(amount);
        } else {
            flag = false;
            System.out.println("Отказано. Недостаточно средств. Либо не прошел месяц с последнего внесения средств.");
        }
        return flag;
    }

    public void plusScore (int score) {
        this.score +=score;
        oneDate = calendar.get(Calendar.DAY_OF_YEAR);
    }
    public void minusScore (int score) {
        if ((this.score - score) >= 0 && (calendar.get(Calendar.DAY_OF_YEAR) - oneDate) >= 30) {
            this.score -=score;
        } else System.out.println("Отказано. Недостаточно средств. Либо не прошел месяц с последнего внесения средств.");
    }
}
