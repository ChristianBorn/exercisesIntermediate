package org.example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @ParameterizedTest
    @CsvSource({
            "1, eins",
            "2, zwei"
    })
    void translateInteger(int number, String expected) {
        //When
        String actual = Main.translateInteger(number);
        //Then
        assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvSource({
            "eins, snie",
            "Hello World, dlroW olleH"
    })
    void reverseString(String stringToReverse, String expected) {
        //When
        String actual = Main.reverseString(stringToReverse);
        //Then
        assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvSource({
            "'Hello, World', Hello"
    })
    void splitByColon(String stringToSplit, String expected) {
        //When
        String[] actual = Main.splitByColon(stringToSplit);
        //Then
        assertEquals(expected, actual[0]);
    }
}