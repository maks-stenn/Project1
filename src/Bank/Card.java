package Bank;

public class Card extends BankAccount {

    public Card(int score) {
        super(score);
    }

    public boolean send(BankAccount receiver, int amount) {
        boolean flag = true;
        if (this.score - 1.01 * amount >= 0) {
            this.score -= 1.01 * amount;
            receiver.plusScore(amount);
        } else {
            flag = false;
            System.out.println("Недостаточно средств для перевода.");
        }
        return flag;
    }

    public void plusScore (int score) {
        this.score +=score;
    }

    public void minusScore (int score) {
        if ((this.score - (1.01 *score)) >= 0) {
            this.score -= 1.01 * score;
        } else System.out.println("Отказано. Недостаточно средств.");
    }
}
