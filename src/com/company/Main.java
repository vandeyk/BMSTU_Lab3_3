package com.company;

public class Main {

    public static void main(String[] args) {
        House h = new House("Sagbottom mansion", "unlocked");
        h.addwindow("Closed");
        h.adddoor("Closed", "Outside"); //Входная дверь
        h.adddoor("Closed", "Kitchen");
        h.addwindow("Blocked");
        h.addwindow("Jammed");
        h.adddoor("Closed", "Bathroom");
        h.show();
        h.lock();
        h.show();
    }
}
