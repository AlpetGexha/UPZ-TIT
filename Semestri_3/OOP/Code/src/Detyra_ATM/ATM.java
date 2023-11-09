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

        if (!areAccountsValid(fromAccount, toAccount)) {
            System.out.println("Transfer failed. Not Valid Account");
            return;
        }

        if (canTransferFunds(fromAccount, amount)) {
            performTransfer(fromAccount, toAccount, amount);
            System.out.println("Transfer successful");
        } else {
            System.out.println("Insufficient funds");
        }
    }

    private boolean areAccountsValid(DataObject fromAccount, DataObject toAccount) {
        if (fromAccount == null || toAccount == null) {
            System.out.println("One or both account numbers not found");
            return false;
        }
        return true;
    }

    private boolean canTransferFunds(DataObject fromAccount, double amount) {
        return fromAccount.getBalance() >= amount;
    }

    private void performTransfer(DataObject fromAccount, DataObject toAccount, double amount) {
        double fromBalance = fromAccount.getBalance();
        double toBalance = toAccount.getBalance();

        fromAccount.setBalance(fromBalance - amount);
        toAccount.setBalance(toBalance + amount);
    }


    public void saveAccountData() {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(inputFile))){
            for (DataObject dataObject : accountData.values()) {
                writer.write(reWriteAccountData(dataObject));
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private String reWriteAccountData(DataObject dataObject){
        return (dataObject.getCardNumber() + "," + dataObject.getName() + "," + dataObject.getBalance() + "\n");
    }


}
