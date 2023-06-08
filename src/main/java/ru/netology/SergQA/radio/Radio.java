package ru.netology.SergQA.radio;

public class Radio {

    public int currentRadioStation;
    public int currentVolume;

    public void switchTheNextStation() {
        if (currentRadioStation <= 9) {
            currentRadioStation++;
        }
        if (currentRadioStation > 9) {
            currentRadioStation = 0;
        }
    }

    public void switchThePrevStation() {
        if (currentRadioStation <= 9) {
            currentRadioStation--;
        } else {
            currentRadioStation = 0;
        }
        if (currentRadioStation < 0) {
            currentRadioStation = 9;
        }
    }

    public void setCurrentRadioStation(int newCurrentRadioStation) {
        if (newCurrentRadioStation > 9) {
            return;
        }
        currentRadioStation = newCurrentRadioStation;
    }

    public void increaseVolume() {
        if (currentVolume < 100) {
            currentVolume++;
        } else {
            currentVolume = 100;
        }
    }

    public void decreaseVolume() {
        if (currentVolume <= 100) {
            currentVolume--;
        } else {
            currentVolume = 100;
        }
        if (currentVolume < 0) {
            currentVolume = 0;
        }
    }


}