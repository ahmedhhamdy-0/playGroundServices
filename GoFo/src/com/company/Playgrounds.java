package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Playgrounds {
    /**
     *
     * @param name stores the name of the playground
     * @param size stores the size of the playground
     * @param location stores the location of the playground
     * @param price stores the price of the playground
     * @param timeSlots stores all the time slots
     * @param available shows whether is available to book or not
     */

    protected String name;
    protected int size;
    protected String location;
    protected int price;
    protected ArrayList<String> timeSlots=new ArrayList<String>();
    protected boolean available;

    /**
     *
     * @param name stores the name of the playground
     * @param size stores the size of the playground
     * @param location stores the location of the playground
     * @param price stores the price of the playground
     * @param timeSlots stores all the time slots
     * @param available shows whether is available to book or not
     */

    public Playgrounds(String name, int size, String location, int price, boolean available) {
        this.name = name;
        this.size = size;
        this.location = location;
        this.price = price;
        this.available = available;
        PlaygroundsPlayer.addPlayground(this);
    }

    /**
     *
     * @param name sets the name
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     *
     * @param size sets the size
     */

    public void setSize(int size) {
        this.size = size;
    }

    /**
     *
     * @param location sets the location
     */

    public void setLocation(String location) {
        this.location = location;
    }

    /**
     *
     * @param available changes the state of the playground
     */

    public void setAvailable(boolean available) {
        this.available = available;
    }

    /**
     *
     * @param amount allows the owner to choose how many time slots he wants
     */

    public void setTimeSlots(int amount) {
        Scanner timeInput= new Scanner(System.in);
        String time;
        for (int i = 0; i < amount; i++) {
            System.out.println("Enter the time slots you want in this format" +
                    "\nEg. 12:00~2:00");
            time =timeInput.nextLine();
            timeSlots.add(time);
        }
    }

    /**
     *
     * @param price sets the price
     */

    public void setPrice(int price) {
        this.price = price;
    }

    /**
     *
     * @return name
     */

    public String getName() {
        return name;
    }

    /**
     *
     * @return size
     */

    public int getSize() {
        return size;
    }

    /**
     *
     * @return location
     */

    public String getLocation() {
        return location;
    }

    /**
     *
     * @return availability
     */

    public boolean isAvailable() {
        return available;
    }

    /**
     *
     * @return ArrayList of the time slots
     */

    public ArrayList<String> getTimeSlots() {
        return timeSlots;
    }

    /**
     *
     * @return price
     */

    public int getPrice() {
        return price;
    }

    /**
     *
     * @return prints all the stored elements in a string form
     */

    @Override
    public String toString() {
        return "Playgrounds{" +
                "name='" + name + '\'' +
                ", size=" + size +
                ", location='" + location + '\'' +
                ", timeSlots=" + timeSlots +
                ", available=" + available +
                '}';
    }
}
