package ru.netology.sqr;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SQRServiceTest {
    @ParameterizedTest
    @CsvSource(value = {"boundary limits 200-300, 200, 300, 3",
            "boundary limits 100-500, 100, 500, 13",
    "boundary limits 1-10, 1, 10, 0"})
    void shouldCalculate(String testName, int lowerLimit, int upperLimit, int expected) {
        SQRService service = new SQRService();
        int actual = service.calculate(lowerLimit, upperLimit);
        assertEquals(expected, actual);

    }
}