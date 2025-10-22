package observer_weatherstation_simplified;

import java.util.ArrayList;
import java.util.List;

public class WeatherData {
	private float temperature;
	private float humidity;
	private float pressure;

	private final List<Observer> observers;

	public WeatherData() {
		observers = new ArrayList<>();
	}

	//-------------
	public void addObserver(Observer o) {
		observers.add(o);
	}

	public void removeObserver(Observer o) {
		observers.remove(o);
	}

	private void notifyObservers() {
		for (Observer o : observers) {
			o.update(temperature, humidity, pressure); // push
		}
	}
	//-------------

	public void setMeasurements(float temperature, float humidity, float pressure) {
		this.temperature = temperature;
		this.humidity = humidity;
		this.pressure = pressure;
		this.measurementsChanged();
	}

	public void measurementsChanged() {
		this.notifyObservers();
	}
}
