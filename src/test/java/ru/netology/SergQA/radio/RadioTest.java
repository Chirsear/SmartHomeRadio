package ru.netology.SergQA.radio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void shouldSetStation() {
        Radio station = new Radio();

        int expected = 0;
        int actual = station.currentRadioStation;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetVolume() {
        Radio volume = new Radio();

        int expected = 0;
        int actual = volume.currentVolume;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetAfterLastStation() {
        Radio next = new Radio();

        next.currentRadioStation = 9;
        next.switchTheNextStation();

        int expected = 0;
        int actual = next.currentRadioStation;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetInvalidStation() {
        Radio next = new Radio();

        next.currentRadioStation = 10;
        next.switchTheNextStation();

        int expected = 0;
        int actual = next.currentRadioStation;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetNextStation() {
        Radio next = new Radio();

        next.currentRadioStation = 7;
        next.switchTheNextStation();

        int expected = 8;
        int actual = next.currentRadioStation;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetBelowZeroStation() {
        Radio prev = new Radio();

        prev.currentRadioStation = 0;
        prev.switchThePrevStation();

        int expected = 9;
        int actual = prev.currentRadioStation;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetPrevStation() {
        Radio prev = new Radio();

        prev.currentRadioStation = 9;
        prev.switchThePrevStation();

        int expected = 8;
        int actual = prev.currentRadioStation;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetInvalidStation2() {
        Radio prev = new Radio();

        prev.currentRadioStation = 10;
        prev.switchThePrevStation();

        int expected = 0;
        int actual = prev.currentRadioStation;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetAboveMaxStation() {
        Radio radio = new Radio();

        radio.setCurrentRadioStation(10);

        int expected = 0;
        int actual = radio.currentRadioStation;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetValidStation() {
        Radio radio = new Radio();

        radio.setCurrentRadioStation(5);

        int expected = 5;
        int actual = radio.currentRadioStation;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolume() {
        Radio increase = new Radio();

        increase.currentVolume = 99;
        increase.increaseVolume();

        int expected = 100;
        int actual = increase.currentVolume;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotIncreaseAboveMAxVolume() {
        Radio increase = new Radio();

        increase.currentVolume = 101;
        increase.increaseVolume();

        int expected = 100;
        int actual = increase.currentVolume;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseVolume() {
        Radio decrease = new Radio();

        decrease.currentVolume = 100;
        decrease.decreaseVolume();

        int expected = 99;
        int actual = decrease.currentVolume;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDecrease2Volume() {
        Radio decrease = new Radio();

        decrease.currentVolume = 33;
        decrease.decreaseVolume();

        int expected = 32;
        int actual = decrease.currentVolume;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetBelowMinVolume() {
        Radio decrease = new Radio();

        decrease.currentVolume = 0;
        decrease.decreaseVolume();

        int expected = 0;
        int actual = decrease.currentVolume;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetAboveMaxVolume() {
        Radio decrease = new Radio();

        decrease.currentVolume = 101;
        decrease.decreaseVolume();

        int expected = 100;
        int actual = decrease.currentVolume;

        Assertions.assertEquals(expected, actual);
    }


}
