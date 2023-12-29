package com.example.bmicalculator.model;

public class BMI {

    private double weight;
    private double height;
    private double bmi;
    private String interpretation;

    // constructeur de la classe

    public BMI(double weight, double height) {
        this.weight = weight;
        this.height = height;
    }


    // getters nécessaires

    public double getBmi() {
        return bmi;
    }

    public String getInterpretation() {
        return interpretation;
    }

    // Methode de calcule et interpretation du BMI
    public void calculer(){
        bmi = weight /(height * height);
        if(bmi < 18.5){
            interpretation = "Insuffisance pondérale";
        } else if (bmi >= 18.5 && bmi < 25) {
            interpretation = "Poids normal";
        } else if (bmi >= 25 && bmi < 30) {
            interpretation = "Surpoids";
        } else if (bmi >= 30) {
            interpretation = "Obésité";
        }
    }
}