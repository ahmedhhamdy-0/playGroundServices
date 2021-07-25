package com.company;

public class Registration {
    /**
     *
     * @param name holds the name of the user
     * @param password holds the password
     * @param phone holds the phone number
     * @param location holds their location
     * @param ID holds their ID
     * @param email holds their email address
     * @param type holds what type of user they're (player,playground owenr)
     */

    protected String name;
    protected String password;
    protected String phone;
    protected String location;
    protected String ID;
    protected String Email;
    protected String Type;

    /**
     *
     * @param name holds the name of the user
     * @param password holds the password
     * @param phone holds the phone number
     * @param location holds their location
     * @param ID holds their ID
     * @param email holds their email address
     * @param type holds what type of user they're (player,playground owenr)
     */
    public Registration(String name, String password, String phone, String location, String ID, String email, String type) {
        this.name = name;
        this.password = password;
        this.phone = phone;
        this.location = location;
        this.ID = ID;
        Email = email;
        Type = type;
        UserList.setUser(this);
    }


    public Registration() {

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
     * @return password
     */
    public String getPassword() {
        return password;
    }


    /**
     *
     * @return phone
     */
    public String getPhone() {
        return phone;
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
     * @return ID
     */
    public String getID() {
        return ID;
    }


    /**
     *
     * @return Email
     */
    public String getEmail() {
        return Email;
    }


    /**
     *
     * @return Type
     */
    public String getType() {
        return Type;
    }




    /**
     * @return prints all the stored elements in a string form
     */
    @Override
    public String toString() {
        return "Registration{" +
                "name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", phone='" + phone + '\'' +
                ", location='" + location + '\'' +
                ", ID='" + ID + '\'' +
                ", Email='" + Email + '\'' +
                ", Type='" + Type + '\'' +
                '}';
    }
}
