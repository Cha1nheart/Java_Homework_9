public class Radio {
    private int currentRadioStation, currentVolume, defaultRadioStationsListSize;

    public Radio() {
        this.defaultRadioStationsListSize = 9;
    }

    public Radio(int customRadioStationListSize) {
        this.defaultRadioStationsListSize = customRadioStationListSize--;
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
        if (newCurrentRadioStation > defaultRadioStationsListSize) {
            return;
        }
        currentRadioStation = newCurrentRadioStation;
    }

    public void setNextRadioStation() {
        if (currentRadioStation == 9) {
            currentRadioStation = 0;
        } else {
            currentRadioStation++;
        }
    }

    public void setPreviousRadioStation() {
        if (currentRadioStation == 0) {
            currentRadioStation = defaultRadioStationsListSize;
        } else {
            currentRadioStation--;
        }
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

    public void increaseVolume() {
        if (currentVolume < 100) {
            currentVolume++;
        }
    }

    public void decreaseVolume() {
        if (currentVolume > 0) {
            currentVolume--;
        }
    }

}