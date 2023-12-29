package com.example.bmicalculator.controller;


import com.example.bmicalculator.model.BMI;

public class Controller {

    // Les attributs du classes Controller
    private static  BMI bmi;
    private static Controller instance = null;

    // Instanciation du Contrôleur suivant le pattern Singleton
    public final static Controller getInstance(){
        if (Controller.instance == null){
            Controller.instance =  new Controller();
        }
        return Controller.instance;
    }

    public void createBMI(double weight, double height){
        // à compléter
        bmi = new BMI(weight, height);
    }

    // Les getters nécessaires
    public String getResult(){
        return bmi.getInterpretation();
    }
}
