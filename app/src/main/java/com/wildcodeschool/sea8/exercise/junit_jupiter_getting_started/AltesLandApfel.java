package com.wildcodeschool.sea8.exercise.junit_jupiter_getting_started;

import java.util.ArrayList;
import java.util.List;

public class AltesLandApfel<A> {
    
    List<A> apfel = new ArrayList<>();
   

     // Getter Apfel    
    public A getLastApfel() {
        return apfel.get(apfel.size()-1);
    }

    public A getFirstApfel() {
        return apfel.get(0);
    }

    // Setter Apfel

    public void setApfel(A newApfel) {
        apfel.add(newApfel);
    }
  

}