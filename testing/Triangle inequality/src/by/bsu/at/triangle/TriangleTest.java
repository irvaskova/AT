package by.bsu.at.triangle;

import org.junit.Test;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;

import static java.sql.Types.NULL;
import static org.junit.Assert.*;

public class TriangleTest {

    @Test
    public void isTriangle() {
        assertTrue(Triangle.isTriangle(4,5,6)==true);
    }

    @Test
    public void negativeNumbers() {
        assertTrue(Triangle.isTriangle(-3,-3,-2)==false);
    }

    @Test
    public void isnotTriangleDueToA() {
        assertTrue(Triangle.isTriangle(10,4,5)==false);
    }

    @Test
    public void isnotTriangleDueToB() {
        assertTrue(Triangle.isTriangle(4,10,5)==false);
    }

    @Test
    public void isnotTriangleDueToC() {
        assertTrue(Triangle.isTriangle(5,4,10)==false);
    }

    @Test
    public void zero() {
        assertTrue(Triangle.isTriangle(0,0,0)==false);
    }

    @Test
    public void equilateralTriangle() {
        assertTrue(Triangle.isTriangle(5,5,5)==true);
    }

    @Test
    public void resultIsNotNull() {
        assertNotNull(Triangle.isTriangle(11,5,6));
    }

    @Test
    public void AplusBequalsC() {
        assertTrue(Triangle.isTriangle(10,5,15)==false);
    }

    @Test
    public void ifValueIsNull() {
        assertTrue(Triangle.isTriangle(3,4,NULL)==false);
    }
}