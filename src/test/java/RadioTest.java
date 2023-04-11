import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void shouldSetCurrentRadioStation() {
        Radio rad = new Radio();

        rad.setCurrentRadioStation(5);

        int expected = 5;
        int actual = rad.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotAcceptNumbersAboveNineForRadioStation() {
        Radio rad = new Radio();

        rad.setCurrentRadioStation(10);

        int expected = 0;
        int actual = rad.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotAcceptNegativeNumbersForRadioStations() {
        Radio rad = new Radio();

        rad.setCurrentRadioStation(-1);

        int expected = 0;
        int actual = rad.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSwapToNextRadioStation() {
        Radio rad = new Radio();

        rad.setCurrentRadioStation(1);
        rad.setNextRadioStation();

        int expected = 2;
        int actual = rad.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSwapToPreviousRadioStation() {
        Radio rad = new Radio();

        rad.setCurrentRadioStation(2);
        rad.setPreviousRadioStation();

        int expected = 1;
        int actual = rad.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldCycleAboveNine() {
        Radio rad = new Radio();

        rad.setCurrentRadioStation(9);
        rad.setNextRadioStation();

        int expected = 0;
        int actual = rad.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldCycleBellowZero() {
        Radio rad = new Radio();

        rad.setCurrentRadioStation(0);
        rad.setPreviousRadioStation();

        int expected = 9;
        int actual = rad.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetCurrentVolume() {
        Radio rad = new Radio();

        rad.setCurrentVolume(50);

        int expected = 50;
        int actual = rad.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotAcceptNumbersAboveOneHundred() {
        Radio rad = new Radio();

        rad.setCurrentVolume(101);

        int expected = 0;
        int actual = rad.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotAcceptNegativeNumbersForVolume() {
        Radio rad = new Radio();

        rad.setCurrentVolume(-1);

        int expected = 0;
        int actual = rad.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolume() {
        Radio rad = new Radio();

        rad.setCurrentVolume(1);
        rad.increaseVolume();

        int expected = 2;
        int actual = rad.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseVolume() {
        Radio rad = new Radio();

        rad.setCurrentVolume(2);
        rad.decreaseVolume();

        int expected = 1;
        int actual = rad.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldCycleVolumeAboveOneHundred() {
        Radio rad = new Radio();

        rad.setCurrentVolume(100);
        rad.increaseVolume();

        int expected = 100;
        int actual = rad.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldCycleVolumeBellowZero() {
        Radio rad = new Radio();

        rad.setCurrentVolume(0);
        rad.decreaseVolume();

        int expected = 0;
        int actual = rad.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

}
