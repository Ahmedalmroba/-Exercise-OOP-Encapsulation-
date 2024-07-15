public class Account {

    private String id;
    private String name;
    private int balance;

    public Account(String id, String name) {
        this.id = id;
       this.name=name;
    }

    public Account(String id, String name, int balance) {
        this.id = id;
        this.name=name;
        this.balance = balance;
    }
    public void set_ID(String id){
        this.id =id;
    }


    public String getID() {
        return id;
    }
    public void set_Name(String name){
        this.name=name;
    }

    public String getName() {
        return name;
    }
    public void set_Balance(int balance){
        this.balance=balance;
    }

    public int getBalance() {
        return balance;
    }


    public int credit(int amount) {
        balance += amount;
        return balance;
    }

    public int debit(int amount) {
        if (amount<=balance)
        balance -= amount;
        return balance;
    }

    public int transferTo(Account another, int amount) {
        if (amount<=balance)
        balance -= amount;
        another.balance += amount;
        return amount;
    }

    public String toString() {
        return "Account ID: " + id + ", Name: " + name + ", Balance: " + balance;
    }
}
