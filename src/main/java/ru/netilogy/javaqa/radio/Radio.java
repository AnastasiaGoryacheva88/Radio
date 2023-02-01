package ru.netilogy.javaqa.radio;

public class Radio {

    private int maxRadioStation = 9;
    private int minRadioStation = 0;
    private int currentRadioStation = minRadioStation;

    private int maxSoundVolume = 100;
    private int minSoundVolume = 0;
    private int currentSoundVolume = minSoundVolume;
    public Radio() {


    }
    public Radio(int stationCount){
        this.maxRadioStation=stationCount-1;

    }

    public int getCurrentRadioStation() {
        return currentRadioStation;
    }

    public int getCurrentSoundVolume() {
        return currentSoundVolume;
    }
public  int getMaxRadioStation(){
        return maxRadioStation;
}


    public void setCurrentRadioStation(int newCurrentRadioStation) {
        if (newCurrentRadioStation < minRadioStation) {
            newCurrentRadioStation = minRadioStation;
        }
        if (newCurrentRadioStation > maxRadioStation) {
            newCurrentRadioStation = maxRadioStation;
        }
        currentRadioStation = newCurrentRadioStation;
    }

    public void setCurrentSoundVolume(int newCurrentSoundVolume) {
        if (newCurrentSoundVolume < minSoundVolume) {
            newCurrentSoundVolume = minSoundVolume;
        }
        if (newCurrentSoundVolume > maxSoundVolume) {
            return;
        }
        currentSoundVolume = newCurrentSoundVolume;
    }

    public void nextRadioStation() {
        if (currentRadioStation < maxRadioStation) {
            currentRadioStation = currentRadioStation + 1;
        } else {
            currentRadioStation = 0;
        }
    }

    public void preRadioStation() {
        if (currentRadioStation > minRadioStation) {
            currentRadioStation = currentRadioStation - 1;
        } else {
            currentRadioStation = 0;
        }
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

