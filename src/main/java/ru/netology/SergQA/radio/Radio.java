package ru.netology.SergQA.radio;

public class Radio {
    private int currentRadioStation;
    private int currentVolume;
    private int maxRadioStation;

    public Radio() {
        this.maxRadioStation = 9;
    }

    public Radio(int numberOfStation) {
        this.maxRadioStation = numberOfStation - 1;
    }

    public int getCurrentRadioStation() {
        return currentRadioStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentRadioStation(int newCurrentRadioStation) {
        if (newCurrentRadioStation < 0) {
            return;
        }
        if (newCurrentRadioStation > maxRadioStation) {
            return;
        }
        currentRadioStation = newCurrentRadioStation;
    }

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume < 0) {
            return;
        }
        if (newCurrentVolume > 100) {
            return;
        }
        currentVolume = newCurrentVolume;
    }

    public void switchToTheNextStation() {
        if (currentRadioStation != maxRadioStation) {
            currentRadioStation++;
        } else {
            currentRadioStation = 0;
        }
    }

    public void switchToPrevStation() {
        if (currentRadioStation != 0) {
            currentRadioStation--;
        } else {
            currentRadioStation = maxRadioStation;
        }

    }

    public void increaseVolume() {
        if (currentVolume != 100) {
            currentVolume++;
        }
    }

    public void decreaseVolume() {
        if (currentVolume != 0) {
            currentVolume--;
        }
    }


}