import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RadioTest {


    @Test

    public void setCurrentStation_ValidStation_ShouldSetStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(5);
        assertEquals(5, radio.getCurrentStation());
    }

    @Test

    public void setCurrentStation_UpperBound_ShouldSetStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(9);
        assertEquals(9, radio.getCurrentStation());
    }

    @Test

    public void setCurrentStation_InvalidStation_ShouldNotSetStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(15);
        assertEquals(0, radio.getCurrentStation());
    }

    @Test

    public void setCurrentStation_LowerBound_ShouldSetStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(0);
        assertEquals(0, radio.getCurrentStation());
    }

    @Test

    public void setCurrentStation_TooLow_ShouldNotSetStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(-1);
        assertEquals(0, radio.getCurrentStation());
    }

    @Test

    public void increaseVolume_NotAtMaxVolume_ShouldIncreaseVolume() {
        Radio radio = new Radio();
        radio.increaseVolume();
        assertEquals(1, radio.getCurrentVolume());
    }

    @Test
    public void increaseVolume_AtMaxVolume_ShouldNotIncreaseVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(100);
        radio.increaseVolume();
        assertEquals(100, radio.getCurrentVolume());
    }

    @Test
    public void decreaseVolume_NotAtMinVolume_ShouldDecreaseVolume() {
        Radio radio = new Radio();
        radio.decreaseVolume();
        assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    public void decreaseVolume_AtMinVolume_ShouldNotDecreaseVolume() {
        Radio radio = new Radio();
        radio.decreaseVolume();
        assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    public void notCurrentVolumeInvalidVolumeShouldNotSetVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(150);
        assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    public void Volume_NotAtMinVolume_ShouldDecreaseVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(50);
        radio.decreaseVolume();
        assertEquals(49, radio.getCurrentVolume());
    }

    @Test

    public void setCurrentVolume_VolumeBelowZero_ShouldNotSetVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(-5);
        assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    public void nextStation_NotAtMaxStation_ShouldIncreaseStation() {
        Radio radio = new Radio();
        radio.nextStation();
        assertEquals(1, radio.getCurrentStation());
    }

    @Test
    public void nextStation_AtMaxStation_ShouldResetToMinStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(9);
        radio.nextStation();
        assertEquals(0, radio.getCurrentStation());
    }

    @Test
    public void prevStation_NotAtMinStation_ShouldDecreaseStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(9);
        radio.prevStation();
        assertEquals(8, radio.getCurrentStation());
    }

    @Test
    public void prevStation_AtMinStation_ShouldResetToMaxStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(0);
        radio.prevStation();
        assertEquals(9, radio.getCurrentStation());
    }

    @Test
    public void prevStation_AtStationNine_ShouldDecrementToStationEight() {
        Radio radio = new Radio();
        radio.setCurrentStation(9);
        radio.prevStation();
        assertEquals(8, radio.getCurrentStation());
    }
    @Test
    public void test() {
        Radio rad = new Radio(10);
        assertEquals(10, rad.getMaxStation());
        assertEquals(0, rad.getCurrentStation());
    }


    @Test
    public void radioConstructor_ValidMaxStations_ShouldSetMaxStations() {
        Radio rad = new Radio(5);
        assertEquals(5, rad.getMaxStation());
    }

    @Test
    public void radioConstructor_ZeroMaxStations_ShouldSetDefault() {
        Radio rad = new Radio(0);
        assertEquals(10, rad.getMaxStation());
    }

    @Test
    public void radioConstructor_NegativeMaxStations_ShouldSetDefault() {
        Radio rad = new Radio(-5);
        assertEquals(10, rad.getMaxStation());
    }

    @Test
    public void radioConstructor_DefaultConstructor_ShouldSetDefaultMaxStations() {
        Radio rad = new Radio();
        assertEquals(10, rad.getMaxStation());
    }

    @Test
    public void radioConstructor_DefaultConstructor_ShouldSetDefaultCurrentStation() {
        Radio rad = new Radio();
        assertEquals(0, rad.getCurrentStation());
    }
}
