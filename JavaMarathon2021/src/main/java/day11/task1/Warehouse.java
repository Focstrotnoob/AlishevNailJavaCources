package day11.task1;

import java.util.ArrayList;

public class Warehouse {

    private int countPickedOrders;
    private int countDeliveredOrders;
    private int countPickers;
    private int countDeliverers;

    public int getCountPickedOrders() {
        return countPickedOrders;
    }

    public int getCountDeliveredOrders() {
        return countDeliveredOrders;
    }

    public void setCountPickedOrders(int countPickedOrders) {
        this.countPickedOrders = countPickedOrders;
    }

    public void setCountDeliveredOrders(int countDeliveredOrders) {
        this.countDeliveredOrders = countDeliveredOrders;
    }

    public int getCountPickers() {
        return countPickers;
    }

    public void setCountPickers(int countPickers) {
        this.countPickers = countPickers;
    }

    public int getCountDeliverers() {
        return countDeliverers;
    }

    public void setCountDeliverers(int countDeliverers) {
        this.countDeliverers = countDeliverers;
    }

    @Override
    public String toString() {
        return "Warehouse: {" +
                "countPickedOrders=" + countPickedOrders +
                ", countDeliveredOrders=" + countDeliveredOrders +
                '}';
    }
}
