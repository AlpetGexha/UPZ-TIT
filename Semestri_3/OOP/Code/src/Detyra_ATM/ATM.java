package Detyra_ATM;

import java.io.*;
import java.util.HashMap;

public class ATM {
    private final HashMap<String, DataObject> accountData;
    private final String inputFile;

    public ATM(String inputFile) {
        this.accountData = new HashMap<>();
        this.inputFile = inputFile;
        loadAccountData();
    }

    public void loadAccountData() {
        try (BufferedReader reader = new BufferedReader(new FileReader(inputFile))) {

            String line;
            while ((line = reader.readLine()) != null) {
                DataObject dataObject = new DataObject(line);
                accountData.put(dataObject.getCardNumber(), dataObject);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void transferFunds(String from, String to, double amount) {
        DataObject fromAccount = accountData.get(from);
        DataObject toAccount = accountData.get(to);

        if (fromAccount == null || toAccount == null) {
            System.out.println("One or both account numbers not found");
            return; // Exit the method if one or both accounts are not found
        }

        double fromBalance = fromAccount.getBalance();
        double toBalance = toAccount.getBalance();

        if (fromBalance >= amount) {
            fromAccount.setBalance(fromBalance - amount);
            toAccount.setBalance(toBalance + amount);

            System.out.println("Transfer successful");
        } else {
            System.out.println("Insufficient funds");
        }

    }

    public void saveAccountData() {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(inputFile));
            for (DataObject dataObject : accountData.values()) {
                writer.write(dataObject.getCardNumber() + "," + dataObject.getName() + "," + dataObject.getBalance() + "\n");
            }
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
