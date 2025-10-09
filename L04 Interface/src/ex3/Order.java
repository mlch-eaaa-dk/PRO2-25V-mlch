package ex3;

import java.util.ArrayList;

public class Order {
    private int number;

    // link Order --> 0..* OrderLine
    private final ArrayList<OrderLine> orderLines = new ArrayList<>();

    public Order(int number) {
        this.number = number;
    }

    public int getNumber() {
        return this.number;
    }

    public ArrayList<OrderLine> getOrderLines() {
        return orderLines;
    }

    public void addOrderLine(OrderLine line) {
        orderLines.add(line);
    }
}
