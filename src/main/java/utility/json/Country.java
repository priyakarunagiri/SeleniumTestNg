package utility.json;

import java.util.ArrayList;


public class Country {
    private String name;
    private float population;
    ArrayList< Object > states = new ArrayList < Object > ();


    // Getter Methods

    public String getName() {
        return name;
    }

    public float getPopulation() {
        return population;
    }

    // Setter Methods

    public void setName(String name) {
        this.name = name;
    }

    public void setPopulation(float population) {
        this.population = population;
    }
}