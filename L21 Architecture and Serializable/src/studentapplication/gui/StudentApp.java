package studentapplication.gui;

import javafx.application.Application;
import studentapplication.controller.Controller;
import studentapplication.controller.Storage;
import studentapplication.storage.ListStorage;

public class StudentApp {

    public static void main(String[] args) {
        String fileName = "L21 Architecture and Serializable/src/studentapplication/storage.ser";
        Storage storage = ListStorage.loadStorage(fileName);
        if (storage == null) {
            storage = new ListStorage();
            System.out.println("Empty ListStorage is created");
            Controller.setStorage(storage);
            initStorage();
            System.out.println("Storage is initialized");
        } else {
            Controller.setStorage(storage);
        }

        Application.launch(StudentGui.class);

        ListStorage.saveStorage(fileName, storage);
    }

    public static void initStorage() {
        Controller.createStudent("Ib Ibsen", 20, true);
        Controller.createStudent("Jens Jens", 30, false);
    }
}
