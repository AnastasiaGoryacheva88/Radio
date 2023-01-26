package ru.netilogy.javaqa.radio;

public class Radio {
    public int currentRadioStation;
    public int maxRadioStation = 9;
    public int minRadioStation = 0;

    public Radio() {
        currentRadioStation = 0;
        currentSoundVolume = 0;
    }

    public int getCurrentRadioStation() {
        return currentRadioStation;
    }

    public void setCurrentRadioStation(int newCurrentRadioStation) {
        if (newCurrentRadioStation < 0) {
            newCurrentRadioStation = 0;
        }
        if (newCurrentRadioStation > 9) {
            newCurrentRadioStation = 9;
        }
        currentRadioStation = newCurrentRadioStation;
    }

    public void nextRadioStation() {
        if (currentRadioStation < maxRadioStation) {
            currentRadioStation = currentRadioStation + 1;
        }
    }

    public void preRadioStation() {
        if (currentRadioStation > minRadioStation) {
            currentRadioStation = currentRadioStation - 1;
        }
    }

    public int currentSoundVolume;
    public int maxSoundVolume = 10;
    public int minSoundVolume = 0;

    public int getCurrentSoundVolume() {
        return currentSoundVolume;
    }

    public void setCurrentSoundVolume(int newCurrentSoundVolume) {
        if (newCurrentSoundVolume < 0) {
            newCurrentSoundVolume = 0;
        }
        if (newCurrentSoundVolume > 10) {
            return;
        }
        currentSoundVolume = newCurrentSoundVolume;
    }

    public void increaseSoundVolume() {
        if (currentSoundVolume < 10) {
            currentSoundVolume = currentSoundVolume + 1;
        }
    }

    public void lowSoundVolume() {
        if (currentSoundVolume > 0) {
            currentSoundVolume = currentSoundVolume - 1;
        }
    }

}

