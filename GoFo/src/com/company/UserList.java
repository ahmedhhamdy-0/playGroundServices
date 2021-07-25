package com.company;

import java.util.ArrayList;

public class UserList {
    /**
     * @param usersList An ArrayList of all the existing users on the system
     */
    protected static ArrayList<Registration> usersList = new ArrayList<Registration>();

    public UserList(Registration user) {
        usersList.add(user);
    }

    /**
     * A function to display all the users
     */
    public static void displayUsers(){
        for (int i = 0; i < usersList.size()-1; i++) {
            System.out.println("This is the first iteration of users list :");
            usersList.get(i).toString();
        }
    }

    /**
     *
     * @param email to get a user by their email
     * @return a Registration object
     */
    public static Registration getUser(String email){

        for (int i = 0; i < usersList.size(); i++) {
            if(email==usersList.get(i).getEmail()){
                return usersList.get(i);
            }
        }
        Registration registration = usersList.get(0);
        return registration;
    }

    /**
     *
     * @param email to get a user's type by their email
     * @return a string of their type
     */
    public static String getType(String email){
        String output="nothing found";

        for (int i = 0; i < usersList.size(); i++) {
            if(email==usersList.get(i).getEmail()){
                output=usersList.get(i).getType();
                return output;
            }
        }
        return output;
    }

    /**
     *
     * @param name gets user by their user name
     * @return a Registration object
     */
    public static Registration getUserN(String name){
        for (int i = 0; i < usersList.size(); i++) {
            if(name==usersList.get(i).getName()){
                return usersList.get(i);
            }
        }
        Registration registration = usersList.get(0);
        return registration;
    }
    /**
     *
     * @param name gets user by their user name
     * @return a Profile object
     */

    public static Profile getUserNP(String name){
        for (int i = 0; i < usersList.size(); i++) {
            if(name.equals(usersList.get(i).getName())){
                return (Profile) usersList.get(i);
            }
        }
        Profile profile = (Profile) usersList.get(0);
        return profile;
    }

    /**
     *
     * @param user sets user automatically from the Registration constructor
     */

    public static void setUser(Registration user){
        usersList.add(user);
        System.out.println("Account has been added successfully : "+user.getName());
    }

}
