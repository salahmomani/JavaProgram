package part11.exceptions.sensorsandtemperature.application;

import java.util.List;

public class AverageSensor implements Sensor{
    private final List<Sensor> sensors;
    private final List<Integer> readings;

    public AverageSensor(List<Sensor> sensors, List<Integer> readings) {
        this.sensors = sensors;
        this.readings = readings;
    }

    @Override
    public boolean isOn() {
        for (Sensor sensor : sensors) {
            if (!sensor.isOn()) {
                return false;
            }
        }
        return true;
    }

    @Override
    public void setOn() {
        for (Sensor sensor : sensors) {
            sensor.setOn();
        }
    }

    @Override
    public void setOff() {
        for (Sensor sensor : sensors) {
            sensor.setOff();
        }
    }

    @Override
    public int read() {
        if (sensors.isEmpty() || !isOn()) {
            throw new IllegalStateException("AverageSensor is off or has no sensors.");
        }

        int sum = 0;
        for (Sensor sensor : sensors) {
            sum += sensor.read();
        }
        int average = sum / sensors.size();
        readings.add(average);
        return average;
    }
    public void addSensor(Sensor toAdd) {
        sensors.add(toAdd);
    }
    public List<Integer> readings() {
        return readings;
    }
}
