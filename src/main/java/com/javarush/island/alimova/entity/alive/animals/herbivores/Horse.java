package com.javarush.island.alimova.entity.alive.animals.herbivores;

import com.javarush.island.alimova.entity.alive.Organism;
import com.javarush.island.alimova.entity.map.Cell;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = false)
public class Horse extends Herbivore{

    public Horse(double weight, int maxAmount, int maxSpeed, double maxFoodWeight) {
        super(weight, maxAmount, maxSpeed, maxFoodWeight);
    }

    @Override
    public Organism clone() throws CloneNotSupportedException {
        return new Horse(this.weight, this.maxAmount, this.maxSpeed, this.maxFoodWeight);
    }


    @Override
    public String toString() {
        return "Horse";
    }
}
