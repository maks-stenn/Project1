package Bank;

public class BankAccount {
    protected int score;

    public BankAccount(int score) {
        this.score = score;
    }
    public boolean send(BankAccount receiver, int amount) {
        boolean flag = true;
        if (this.score - amount >= 0) {
            this.score -= amount;
            receiver.plusScore(amount);
        } else {
            flag = false;
            System.out.println("Недостаточно средств для перевода.");
        }
        return flag;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public void plusScore (int score) {
        this.score +=score;
    }
    public void minusScore (int score) {
        if ((this.score - score) >= 0) {
            this.score -=score;
        } else System.out.println("Отказано. Недостаточно средств.");
    }
}
