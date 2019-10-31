package ru.stqa.pft.sandbox;

import org.testng.Assert;
import org.testng.annotations.Test;

import static ru.stqa.pft.sandbox.MyFirstProgram.distance;

@Test
public class DistanceTest {
    public void testDistanceBetween() {
        Point p1 = new Point (1,2);
        Point p2 = new Point (3,4);
        Assert.assertEquals(distance(p1,p2), 2.0);

    }
}
