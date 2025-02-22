package part11.exceptions.sensorsandtemperature.application;

public interface Sensor {
    boolean isOn();
    void setOn();
    void setOff();
    int read();
}
