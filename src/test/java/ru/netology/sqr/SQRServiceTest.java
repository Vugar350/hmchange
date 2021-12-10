package ru.netology.sqr;

import org.junit.jupiter.api.Assertions;

import static org.junit.jupiter.api.Assertions.*;

class SQRServiceTest {

    @org.junit.jupiter.api.Test
    void calculateInsideRange() {
        SQRService service = new SQRService();
        int expected = 3;
        int actual = service.calculate(200, 300);
        Assertions.assertEquals(expected, actual);
    }
    @org.junit.jupiter.api.Test
    void calculateOutRange() {
        SQRService service = new SQRService();
        int expected = 0;
        int actual = service.calculate(10, 99);
        Assertions.assertEquals(expected, actual);
    }
}