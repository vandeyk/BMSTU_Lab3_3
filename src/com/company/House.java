package com.company;

import java.util.ArrayList;
import java.util.List;

public class House {
    private List<Window> windows = new ArrayList<Window>();
    private List<Door> doors = new ArrayList<Door>();
    private String name;
    private String state;

    public House(String n, String s) {
        this.name = n;
        this.state = s;
    }

    public void show(){ //Вывод числа дверей и окон
        System.out.println("_____" + this.name + "_____");
        System.out.println("     is now " + this.state);
        System.out.println("Windows: " + this.windows.size());
        System.out.println("Doors: " + this.doors.size());
        System.out.println("___________________________");
        System.out.println();
    }

    public void addwindow(String s){
        Window w = new Window(s);
        windows.add(w);
    }

    public void adddoor(String s, String t){
        Door d = new Door(s, t);
        doors.add(d);
    }

    public void lock(){
        System.out.println("You lock all the doors leading outside");
        System.out.println();
        for (Door door : doors) {
            if (door.getTitle().equals("Outside")) { //Все двери, ведущие наружу
                door.lock();                         //подвергаются закупориванию
            }
        }
        this.state = "locked";
    }
}
