package pbc.car;


import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static pbc.car.ValueCarRepository.getCarList;

public class CarTest {


    @Test
    private void CheckTheProperBrandWhenBlackColorCalled() {
        Assert.assertEquals("Audi", getCarList().stream().toArray());

    }

    @Test
    private void CheckTheNumberOfCarsInMap() {
        Assert.assertEquals(5, getCarList().size());

    }

    @Test
    private void CheckTheNumberOfCarsInGroupOfWhite() {
        assertEquals(2, );
    }


    @Test
    private void CheckListOfCarsInGroupOfBlack() {
        assertEquals("Audi", getCarList().stream().allMatch(Car.));
        assertEquals(["Ford", "Ferrari"],getCarList().  );
    }
}
//TODO
//to create tests for list map and methods (except getters/setters)