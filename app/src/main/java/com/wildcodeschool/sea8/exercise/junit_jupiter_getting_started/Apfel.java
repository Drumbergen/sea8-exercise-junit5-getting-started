package com.wildcodeschool.sea8.exercise.junit_jupiter_getting_started;

/*
Die Klasse Apfel enhält die Apfelsorte
*/

public class Apfel {

    protected String apfelsorte;
    
    // Construtor

    public Apfel(String apfelsorte) {
            this.apfelsorte = apfelsorte;
    }

    // getter

    public String getApfelsorte() {
        return this.apfelsorte;
        
    }

    // setter

    public void setApfelsorte(String apfelsorte) {
        this.apfelsorte = apfelsorte;
    }


}