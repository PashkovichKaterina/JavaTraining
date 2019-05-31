package by.epam.javatraining.pashkovich.lesson05.task02.model;

import org.junit.Test;

import static org.junit.Assert.*;

public class CheckCharTest {
    @Test
    public void testIsVowelLowerCase() {
        char c = 'a';
        boolean expected = true;
        assertEquals(expected, CheckChar.isVowel(c));
    }

    @Test
    public void testIsVowelUpperCase() {
        char c = 'I';
        boolean expected = true;
        assertEquals(expected, CheckChar.isVowel(c));
    }

    @Test
    public void testIsVowelConsonant() {
        char c = 'b';
        boolean expected = false;
        assertEquals(expected, CheckChar.isVowel(c));
    }

    @Test
    public void testIsVowelTwoLowerCase() {
        char c = 'a';
        boolean expected = true;
        assertEquals(expected, CheckChar.isVowelTwo(c));
    }

    @Test
    public void testIsVowelTwoUpperCase() {
        char c = 'I';
        boolean expected = true;
        assertEquals(expected, CheckChar.isVowelTwo(c));
    }

    @Test
    public void testIsVowelTwoConsonant() {
        char c = 'b';
        boolean expected = false;
        assertEquals(expected, CheckChar.isVowelTwo(c));
    }

    @Test
    public void testIsVowelThreeLowerCase() {
        char c = 'a';
        boolean expected = true;
        assertEquals(expected, CheckChar.isVowelThree(c));
    }

    @Test
    public void testIsVowelThreeUpperCase() {
        char c = 'I';
        boolean expected = true;
        assertEquals(expected, CheckChar.isVowelThree(c));
    }

    @Test
    public void testIsVowelThreeConsonant() {
        char c = 'b';
        boolean expected = false;
        assertEquals(expected, CheckChar.isVowelThree(c));
    }

    @Test
    public void testIsVowelFourLowerCase() {
        char c = 'a';
        boolean expected = true;
        assertEquals(expected, CheckChar.isVowelFour(c));
    }

    @Test
    public void testIsVowelFourUpperCase() {
        char c = 'I';
        boolean expected = true;
        assertEquals(expected, CheckChar.isVowelFour(c));
    }

    @Test
    public void testIsVowelFourConsonant() {
        char c = 'b';
        boolean expected = false;
        assertEquals(expected, CheckChar.isVowelFour(c));
    }

    @Test
    public void testIsVowelFifeLowerCase() {
        char c = 'a';
        boolean expected = true;
        assertEquals(expected, CheckChar.isVowelFife(c));
    }

    @Test
    public void testIsVowelFifeUpperCase() {
        char c = 'I';
        boolean expected = true;
        assertEquals(expected, CheckChar.isVowelFife(c));
    }

    @Test
    public void testIsVowelFifeConsonant() {
        char c = 'b';
        boolean expected = false;
        assertEquals(expected, CheckChar.isVowelFife(c));
    }
}