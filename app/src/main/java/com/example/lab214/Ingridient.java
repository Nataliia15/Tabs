package com.example.lab214;

public class Ingridient {
    private String nameOfIngredient;
    private String amount;

    public Ingridient(String nameOfIngredient, String amount) {
        this.nameOfIngredient = nameOfIngredient;
        this.amount = amount;
    }

    public void setNameOfIngredient(String nameOfIngredient) {
        this.nameOfIngredient = nameOfIngredient;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getNameOfIngredient() {
        return nameOfIngredient;
    }

    public String getAmount() {
        return amount;
    }
}
