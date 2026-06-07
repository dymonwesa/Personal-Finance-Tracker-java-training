package model;

import java.time.LocalDate;

public class Transaction {
    private int amount;
    private Type type;
    private Category category;
    private String description;
    private LocalDate date;


    public Transaction(int amount, Type type, Category category, String description) {
        this.amount = amount;
        this.type = type;
        this.category = category;
        this.description = description;
        this.date = LocalDate.now();
    }

    public Transaction(){
        this.date = LocalDate.now();
    }
//setters

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setDescription(){
        this.description = "Empty";
    }

//getters

    public int getAmount() {
        return amount;
    }

    public Type getType() {
        return type;
    }

    public Category getCategory() {
        return category;
    }

    public String getDescription() {
        return description;
    }

    public LocalDate getDate() {
        return date;
    }

    @Override
    public String toString(){
        return date + " | " + type + " | " + category + " | " + amount + "рублей | " + description;
    }

}
