package observer_weatherstation_simplified;

public interface Observer {
    void update(float temp, float humidity, float pressure); // push
}

// public interface Observer {
//     void update(WeatherData weatherData); // pull
// }
