package ru.stqa.pft.sandbox;

import org.testng.Assert;
import org.testng.annotations.Test;

public class PrimeTest {

    @Test
    public void testPrime() {
        Assert.assertTrue(Prime.isPrimeFor(Integer.MAX_VALUE));
    }

    @Test
    public void testNonPrime() {
        Assert.assertTrue(Prime.isPrimeFor(Integer.MAX_VALUE - 2));
    }

    @Test (enabled = false)
    public void testPrime( long n) {
        n = Integer.MAX_VALUE;
        Assert.assertTrue(Prime.isPrimeFor(Integer.MAX_VALUE));
    }

    @Test
    public void testPrimeSqrt() {
        Assert.assertTrue(Prime.isPrimeFor(Integer.MAX_VALUE));
    }
}
