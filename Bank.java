
class InsufficientBalanceException extends Exception {
    InsufficientBalanceException(String msg) {
        super(msg);
    }
}

class Bank {
    double balance = 5000;

    void withdrew(double amount) {
        try {
            if (amount > balance) {
                throw new InsufficientBalanceException("Insufficient balance");
            } else {
                balance = balance - amount;
                System.out.println("Withdraw successful");
                System.out.println("Remaining balance: " + balance);
            }
        }
        catch (InsufficientBalanceException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void main(String[] args) {
        Bank b = new Bank();

        b.withdrew(2000);
        b.withdrew(6000);
    }
}
