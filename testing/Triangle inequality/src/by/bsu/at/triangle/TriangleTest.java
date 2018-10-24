package by.bsu.at.triangle;

import org.junit.Test;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;

import static java.sql.Types.NULL;
import static org.junit.Assert.*;

public class TriangleTest {

    @Test
    public void isTriangle() {
        assertTrue(Triangle.isTriangle(4,5,6));
    }

    @Test
    public void negativeNumbers() {
        assertFalse(Triangle.isTriangle(-3,-3,-2));
    }

    @Test
    public void isnotTriangleDueToA() {
        assertFalse(Triangle.isTriangle(10,4,5));
    }

    @Test
    public void isnotTriangleDueToB() {
        assertFalse(Triangle.isTriangle(4,10,5));
    }

    @Test
    public void isnotTriangleDueToC() {
        assertFalse(Triangle.isTriangle(5,4,10));
    }

    @Test
    public void AisZero() {
        assertFalse(Triangle.isTriangle(0,5,3));
    }

    @Test
    public void BisZero() {
        assertFalse(Triangle.isTriangle(10,0,3));
    }

    @Test
    public void CisZero() {
        assertFalse(Triangle.isTriangle(6,5,0));
    }

    @Test
    public void equilateralTriangle() {
        assertTrue(Triangle.isTriangle(5,5,5));
    }

    @Test
    public void AplusBequalsC() {
        assertFalse(Triangle.isTriangle(10,5,15));
    }
}