package com.company;

public class Profile extends Registration {
    /**
     * @param balance holds the user's balance
     */
    protected double balance;

    public Profile(){
        super();
    };

    /**
     * inherited class from registeration
     * @param name holds the name of the user
     * @param password holds the password
     * @param phone holds the phone number
     * @param location holds their location
     * @param ID holds their ID
     * @param email holds their email address
     * @param type holds what type of user they're (player,playground owenr)
     * @param balance holds their balance
     */

    public Profile(String name, String password, String phone, String location, String ID, String email, String type,double balance) {
        super(name, password, phone, location, ID, email, type);
        this.balance=balance;
    }
    public Profile(String name, String password, String phone, String location, String ID, String email, String type) {
        super(name, password, phone, location, ID, email, type);

    }

    /**
     *
     * @return balance
     */
    public double getBalance() {
        return balance;
    }

    /**
     *
     * @param balance sets the balance
     */
    public void setBalance(double balance) {
        this.balance = balance;
    }

    /**
     *
     * @return a string form the inherited and stored details
     */

    @Override
    public String toString() {
        return "Profile{" +
                "balance=" + balance +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", phone='" + phone + '\'' +
                ", location='" + location + '\'' +
                ", ID='" + ID + '\'' +
                ", Email='" + Email + '\'' +
                ", Type='" + Type + '\'' +
                '}';
    }

}
