import java.io.Serializable;

public class Species implements Serializable {
    private String name;
    private int population;
    private double growthRate;

    public String getName() {
        return name;
    }

    public int getPopulation() {
        return population;
    }

    public double getGrowthRate() {
        return growthRate;
    }

    public Species(String name, int initialPopulation, double growthRate) {
        this.name = name;
        if (initialPopulation >= 0) {
            this.population = initialPopulation;
        } else {
            throw new IllegalArgumentException("initial population is less than zero");
        }
        this.growthRate = growthRate;
    }

    public String toString() {
        return ("Name = " + name + "\n" +
                "Population = " + population + "\n" +
                "Growth rate = " + growthRate + "%");
    }
}