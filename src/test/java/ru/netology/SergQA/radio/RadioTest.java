package ru.netology.SergQA.radio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void test() {
        Radio radio = new Radio(31);

        radio.setCurrentRadioStation(30);

        Assertions.assertEquals(30, radio.getCurrentRadioStation());
    }

    @Test
    public void test1() {
        Radio radio = new Radio();

        radio.setCurrentRadioStation(9);

        Assertions.assertEquals(9, radio.getCurrentRadioStation());
    }

    @Test
    public void shouldSwitchToTheNextStation() {
        Radio next = new Radio();
        next.setCurrentRadioStation(9);

        next.switchToTheNextStation();

        int expected = 0;
        int actual = next.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldToSwitchToStation0thAfter9th() {
        Radio next = new Radio();
        next.setCurrentRadioStation(9);

        next.switchToTheNextStation();

        int expected = 0;
        int actual = next.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldToSwitchTo9thStation() {
        Radio next = new Radio();
        next.setCurrentRadioStation(8);

        next.switchToTheNextStation();

        int expected = 9;
        int actual = next.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSwitchToThePrevStation() {
        Radio prev = new Radio();
        prev.setCurrentRadioStation(9);

        prev.switchToPrevStation();

        int expected = 8;
        int actual = prev.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSwitchToStation9thAfter0th() {
        Radio prev = new Radio();
        prev.setCurrentRadioStation(0);

        prev.switchToPrevStation();

        int expected = 9;
        int actual = prev.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSwitchToStation0th() {
        Radio prev = new Radio();
        prev.setCurrentRadioStation(1);

        prev.switchToPrevStation();

        int expected = 0;
        int actual = prev.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSet9thStation() {
        Radio valid = new Radio();


        valid.setCurrentRadioStation(9);

        int expected = 9;
        int actual = valid.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSet0thStation() {
        Radio valid = new Radio();


        valid.setCurrentRadioStation(0);

        int expected = 0;
        int actual = valid.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetAboveTheValidStation() {
        Radio valid = new Radio();


        valid.setCurrentRadioStation(10);

        int expected = 0;
        int actual = valid.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetBelowTheValidStation() {
        Radio valid = new Radio();


        valid.setCurrentRadioStation(-1);

        int expected = 0;
        int actual = valid.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetAboveTheValidVolume() {
        Radio valid = new Radio();


        valid.setCurrentVolume(101);

        int expected = 0;
        int actual = valid.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetBelowTheValidVolume() {
        Radio valid = new Radio();


        valid.setCurrentVolume(-1);

        int expected = 0;
        int actual = valid.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseTheVolumeByOne() {
        Radio increase = new Radio();
        increase.setCurrentVolume(0);

        increase.increaseVolume();

        int expected = 1;
        int actual = increase.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotIncreaseAboveTheMaxVolume() {
        Radio increase = new Radio();
        increase.setCurrentVolume(100);

        increase.increaseVolume();

        int expected = 100;
        int actual = increase.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetTheMaxVolume() {
        Radio increase = new Radio();
        increase.setCurrentVolume(99);

        increase.increaseVolume();

        int expected = 100;
        int actual = increase.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseTheVolumeByOne() {
        Radio decrease = new Radio();
        decrease.setCurrentVolume(100);

        decrease.decreaseVolume();

        int expected = 99;
        int actual = decrease.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotDecreaseBelowTheMinVolume() {
        Radio decrease = new Radio();
        decrease.setCurrentVolume(0);

        decrease.decreaseVolume();

        int expected = 0;
        int actual = decrease.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetTheMinVolume() {
        Radio decrease = new Radio();
        decrease.setCurrentVolume(1);

        decrease.decreaseVolume();

        int expected = 0;
        int actual = decrease.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }


}
