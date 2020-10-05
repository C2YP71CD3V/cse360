package cse360assignment02;

/*
Name: Joseph Feruglio
Class: CSE360
Assignment: Assignment1
Lecture: Tuesday
 */

/**
 * This class defines an adding machine, will perform simple addition and subtraction to a total (starts at 0).
 * Will also keep track of past operations performed and print it out with toString.
 *
 */
public class AddingMachine {
    private int total; // Declaring private integer
    private String history = "0"; // Initializing private string

    /**
     * Constructor method for AddingMachine
     * Initializes total to 0
     */
    public AddingMachine(){
        total = 0; // not needed - included for clarity
    }

    /**
     * Retrieves value of total
     * @return value of total
     */
    public int getTotal(){
        return this.total;
    }

    /**
     * Adds to the total
     * @param value value to be added
     */
    public void add(int value){
        this.total = total + value;
        this.history += " + " + value;
    }

    /**
     * Subtracts from the total
     * @param value value to be subtracted
     */
    public void subtract (int value){
        this.total = total - value;
        this.history += " - " + value;
    }

    /**
     * toString of all the past operations
     * @return history
     */
    public String toString(){
        return this.history;
    }

    /**
     * Resets the "memory" or history and resets total
     */
    public void clear(){
        this.history = "0";
        this.total = 0;
    }

}
