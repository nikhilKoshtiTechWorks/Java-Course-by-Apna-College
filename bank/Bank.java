package bank;

class Account {
    public String name;
}

public class Bank{
    public String name;
    // setter-getter function
    public String accessToBank(String x) {
        Account account1 = new Account();
        account1.name = x;
        return account1.name;
    }

    public static void main(String[] args) {
        
    }
    
}

