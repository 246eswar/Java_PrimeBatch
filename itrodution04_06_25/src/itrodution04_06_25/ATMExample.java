package itrodution04_06_25;

public class ATMExample {
    public static void main(String[] args) {
        AtmWithdraw a = new AtmWithdraw(1000);
        System.out.println(a.withDraw(500));  // Should print success message
        System.out.println(a.withDraw(1500)); // Should print insufficient balance
    }
}

abstract class ATM {
    void msg() {
        System.out.println("Welcome");
    }

    abstract String withDraw(float amount);
}

class AtmWithdraw extends ATM {
    float balance;

    AtmWithdraw(float bal) {
        this.balance = bal;
    }

    //@Override
    String withDraw(float amount) {
        if (balance < amount) {
            return "Insufficient balance";
        } else {
            balance -= amount;
            return "Withdrawal successful, remaining balance: " + balance;
        }
    }
}
