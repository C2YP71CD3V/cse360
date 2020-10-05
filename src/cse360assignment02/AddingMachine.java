package cse360assignment02;

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
     * Clear method to be finished
     */
    public void clear(){
        this.history = "0";
        this.total = 0;
    }

}
