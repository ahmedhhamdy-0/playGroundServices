package com.company;
public class Sign_in {
    /**
     *
     * @param userName stores user's username to be checked
     * @param userPassword stores user's password to be checked
     * @param State shows whether a login has been successful or not
     */

    protected static String userName;
    protected static String userPassword;
    protected static boolean state=false;

    /**
     *
     * @param userName stores user's username to be checked
     * @param userPassword stores user's password to be checked
     */

    public Sign_in(String userName, String userPassword) {
        Sign_in.userName = userName.toLowerCase();
        Sign_in.userPassword = userPassword.toLowerCase();
        Profile tempVar2= UserList.getUserNP(userName);

        if(tempVar2.getName().equals(userName)&&tempVar2.getPassword().equals(userPassword)){
        state=true;

        }


    }

    /**
     *
     * @param userName gets user's type by his username
     * @param userPassword gets user's type by his password
     * @return a type string
     */
    public static String getType(String userName , String userPassword){
        Profile tempVar2= UserList.getUserNP(userName);
        return tempVar2.getType();
    }

    /**
     *
     * @return Whether the login has been successful or not
     */
    public static boolean isState() {
        return state;
    }

    /**
     *
     * @param userName validates his username
     * @param userPassword validates his password
     */

    public static void log_in(String userName, String userPassword){
        Sign_in.userName = userName.toLowerCase();
        Sign_in.userPassword = userPassword.toLowerCase();
        Profile tempVar2= UserList.getUserNP(userName);
        if(tempVar2.getName().equals(userName)&&tempVar2.getPassword().equals(userPassword)){
            state=true;
        }
        else{
            System.out.println("Wrong User name or password !");
        }

    }

}
