import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RadioTest {

    @Test
    public void test() {
        Radio radio = new Radio();

        radio.setCurrentStation(6);

        int actual = radio.getCurrentStation();
        int expected = 6;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void NegativeTest() {
        Radio radio = new Radio();

        radio.setCurrentStation(-6);

        int actual = radio.getCurrentStation();
        int expected = 0;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testBoundaryValue() {
        Radio radio = new Radio();

        radio.setCurrentStation(-1);

        int actual = radio.getCurrentStation();
        int expected = 0;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testBoundaryValue0() {
        Radio radio = new Radio();
        radio.setCurrentStation(6);

        radio.setCurrentStation(0);

        int actual = radio.getCurrentStation();
        int expected = 0;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testBoundaryValue1() {
        Radio radio = new Radio();

        radio.setCurrentStation(1);

        int actual = radio.getCurrentStation();
        int expected = 1;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testBoundaryValue8() {
        Radio radio = new Radio();

        radio.setCurrentStation(8);

        int actual = radio.getCurrentStation();
        int expected = 8;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testBoundaryValue9() {
        Radio radio = new Radio();

        radio.setCurrentStation(9);

        int actual = radio.getCurrentStation();
        int expected = 9;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testBoundaryValue10() {
        Radio radio = new Radio();

        radio.setCurrentStation(10
        );

        int actual = radio.getCurrentStation();
        int expected = 0;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testStationNext() {
        Radio radio = new Radio();

        radio.setCurrentStation(6);

        radio.next();

        int actual = radio.getCurrentStation();
        int expected = 7;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void TestBoundaryValueOfSwitchingTheNextStations0() {
        Radio radio = new Radio();

        radio.setCurrentStation(0);

        radio.next();

        int actual = radio.getCurrentStation();
        int expected = 1;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void TestBoundaryValueOfSwitchingTheNextStations1() {
        Radio radio = new Radio();

        radio.setCurrentStation(1);

        radio.next();

        int actual = radio.getCurrentStation();
        int expected = 2;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void TestBoundaryValueOfSwitchingTheNextStations8() {
        Radio radio = new Radio();

        radio.setCurrentStation(8);

        radio.next();

        int actual = radio.getCurrentStation();
        int expected = 9;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void TestBoundaryValueOfSwitchingTheNextStations9() {
        Radio radio = new Radio();

        radio.setCurrentStation(9);

        radio.next();

        int actual = radio.getCurrentStation();
        int expected = 0;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testStationPrev() {
        Radio radio = new Radio();

        radio.setCurrentStation(6);

        radio.prev();

        int actual = radio.getCurrentStation();
        int expected = 5;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void TestBoundaryValueOfSwitchingThePreviousStations0() {
        Radio radio = new Radio();

        radio.setCurrentStation(0);

        radio.prev();

        int actual = radio.getCurrentStation();
        int expected = 9;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void TestBoundaryValueOfSwitchingThePreviousStations1() {
        Radio radio = new Radio();

        radio.setCurrentStation(1);

        radio.prev();

        int actual = radio.getCurrentStation();
        int expected = 0;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void TestBoundaryValueOfSwitchingThePreviousStations8() {
        Radio radio = new Radio();

        radio.setCurrentStation(8);

        radio.prev();

        int actual = radio.getCurrentStation();
        int expected = 7;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void TestBoundaryValueOfSwitchingThePreviousStations9() {
        Radio radio = new Radio();

        radio.setCurrentStation(9);

        radio.prev();

        int actual = radio.getCurrentStation();
        int expected = 8;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testVolume() {
        Radio radio = new Radio();

        radio.setCurrentVolume(6);

        int actual = radio.getCurrentVolume();
        int expected = 6;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void NegativeSoundBoundaryValueTest() {
        Radio radio = new Radio();

        radio.setCurrentVolume(-1);

        int actual = radio.getCurrentVolume();
        int expected = 0;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void SoundBoundaryValueTest0() {
        Radio radio = new Radio();

        radio.setCurrentVolume(0);

        int actual = radio.getCurrentVolume();
        int expected = 0;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void SoundBoundaryValueTest1() {
        Radio radio = new Radio();

        radio.setCurrentVolume(1);

        int actual = radio.getCurrentVolume();
        int expected = 1;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void SoundBoundaryValueTest99() {
        Radio radio = new Radio();

        radio.setCurrentVolume(99);

        int actual = radio.getCurrentVolume();
        int expected = 99;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void SoundBoundaryValueTest100() {
        Radio radio = new Radio();

        radio.setCurrentVolume(100);

        int actual = radio.getCurrentVolume();
        int expected = 100;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void SoundBoundaryValueTest101() {
        Radio radio = new Radio();

        radio.setCurrentVolume(101);

        int actual = radio.getCurrentVolume();
        int expected = 0;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testVolumePlus() {
        Radio radio = new Radio();

        radio.setCurrentVolume(6);

        radio.volumePlus();

        int actual = radio.getCurrentVolume();
        int expected = 7;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testVolumeMinus() {
        Radio radio = new Radio();

        radio.setCurrentVolume(6);

        radio.volumeMinus();

        int actual = radio.getCurrentVolume();
        int expected = 5;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void boundaryValueTestVolumePlus0() {
        Radio radio = new Radio();

        radio.setCurrentVolume(0);

        radio.volumePlus();

        int actual = radio.getCurrentVolume();
        int expected = 1;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void boundaryValueTestVolumePlus1() {
        Radio radio = new Radio();

        radio.setCurrentVolume(1);

        radio.volumePlus();

        int actual = radio.getCurrentVolume();
        int expected = 2;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void boundaryValueTestVolumePlus99() {
        Radio radio = new Radio();

        radio.setCurrentVolume(99);

        radio.volumePlus();

        int actual = radio.getCurrentVolume();
        int expected = 100;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void boundaryValueTestVolumePlus100() {
        Radio radio = new Radio();

        radio.setCurrentVolume(100);

        radio.volumePlus();

        int actual = radio.getCurrentVolume();
        int expected = 100;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testBoundaryValueVolumeMinus0() {
        Radio radio = new Radio();

        radio.setCurrentVolume(0);

        radio.volumeMinus();

        int actual = radio.getCurrentVolume();
        int expected = 0;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testBoundaryValueVolumeMinus1() {
        Radio radio = new Radio();

        radio.setCurrentVolume(1);

        radio.volumeMinus();

        int actual = radio.getCurrentVolume();
        int expected = 0;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testBoundaryValueVolumeMinus99() {
        Radio radio = new Radio();

        radio.setCurrentVolume(99);

        radio.volumeMinus();

        int actual = radio.getCurrentVolume();
        int expected = 98;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testBoundaryValueVolumeMinus100() {
        Radio radio = new Radio();

        radio.setCurrentVolume(100);

        radio.volumeMinus();

        int actual = radio.getCurrentVolume();
        int expected = 99;

        Assertions.assertEquals(expected, actual);
    }
}
