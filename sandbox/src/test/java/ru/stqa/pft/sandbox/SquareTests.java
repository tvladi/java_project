package ru.stqa.pft.sandbox;

import org.testng.Assert;
import org.testng.annotations.Test;

@Test
public class SquareTests {
    public void testArea () {
        Square s = new Square (6);
        Assert.assertEquals(s.area(),25);
    }
}

