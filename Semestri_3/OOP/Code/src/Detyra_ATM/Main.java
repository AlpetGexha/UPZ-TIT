package Detyra_ATM;

public class Main {

    public static void main(String[] args) {
        String input = "src/Detyra_ATM/input.txt";
        ATM atm = new ATM(input);

        atm.transferFunds("2529901366358882", "4916028689158562", 100);

        atm.transferFunds("4532564446223996", "5530225936075036", 100);
        atm.transferFunds("4532564446223996", "5530225936075036", 100);

        atm.transferFunds("5199888306626456","6011583944285179",10);
        atm.transferFunds("5199888306626456","6011583944285179",20);
        atm.transferFunds("5199888306626456","6011583944285179",30);
        atm.transferFunds("5199888306626456","6011583944285179",40);
        atm.transferFunds("5199888306626456","6011583944285179",50);
        atm.transferFunds("5199888306626456","6011583944285179",60);

        atm.saveAccountData();
    }
}
