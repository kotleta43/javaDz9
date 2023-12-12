public class Radio {
    private int currentStation;
    private int maxStation;
    private int currentVolume;

    public Radio() {
        this.maxStation = 10;
        this.currentStation = 0;
    }

    public Radio(int maxStation) {
        if (maxStation > 0) {
            this.maxStation = maxStation;
        } else {
            this.maxStation = 10;
        }
        this.currentStation = 0;
    }
    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int station) {
        if (station >= 0 && station <= maxStation) {
            currentStation = station;
        }
    }

    public int getMaxStation() {
        return maxStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int volume) {
        if (volume >= 0 && volume <= 100) {
            currentVolume = volume;
        }
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

    public void nextStation() {
        if (currentStation == maxStation - 1) {
            currentStation = 0;
        } else {
            currentStation++;
        }
    }

    public void prevStation() {
        if (currentStation == 0) {
            currentStation = maxStation - 1;
        } else {
            currentStation--;
        }
    }
}