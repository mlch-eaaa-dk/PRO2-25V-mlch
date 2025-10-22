package observer_ex4student;

public interface Subject {
    void addObserver(ColorObserver observer);
    void removeObserver(ColorObserver observer);
    void notifyObservers();
}
