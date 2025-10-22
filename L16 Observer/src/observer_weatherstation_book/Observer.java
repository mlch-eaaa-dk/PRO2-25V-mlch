package observer_weatherstation_book;

public interface Observer {
    void update(float temp, float humidity, float pressure); // push
}
