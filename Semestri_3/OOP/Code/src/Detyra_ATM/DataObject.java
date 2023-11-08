package Detyra_ATM;

public class DataObject {
    private final String cardNumber;
    private final String name;
    private double balance;

    public DataObject(String info) {

        String[] data = info.split(",");
//        if (data.length == 3) {
        this.cardNumber = data[0];
        this.name = data[1];
        this.balance = Double.parseDouble(data[2]);
//        }
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public String getName() {
        return name;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }


}
