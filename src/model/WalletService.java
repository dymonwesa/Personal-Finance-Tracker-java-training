package model;

import java.util.ArrayList;

public class WalletService {
    ArrayList<Transaction> walletList = new ArrayList<>();

    public WalletService(ArrayList<Transaction> walletList) {
        this.walletList = walletList;
    }
    public WalletService(){}

    public void addTransaction(Transaction transaction) {
        walletList.add(transaction);
    }

    public void getTransactions(){
        for (int i = 0; i < walletList.size(); i++){
            System.out.println(walletList.get(i));
        }
    }

    public int getBalance(){
        int balance = 0;
            for (int i = 0; i < walletList.size(); i++){
                if (walletList.get(i).getType() == Type.INCONE){
                    balance += walletList.get(i).getAmount();
                } else if (walletList.get(i).getType() == Type.EXPENSE){
                    balance -= walletList.get(i).getAmount();
                }
            }
            return balance;

    }

}
