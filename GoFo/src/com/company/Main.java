package com.company;
/**
 * @author Islam Ahmed Mohamed
 */

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


            PlaygroundOwner playgroundOwner= new PlaygroundOwner() ;
            Player player =new Player() ;
        while (true){


            Scanner choiceInput = new Scanner(System.in);
            Scanner inputStr = new Scanner(System.in);
            Scanner inputInt = new Scanner(System.in);

            System.out.println("\n------------------------------------------------------\n" +
                    "\nPress 1 to Register" +
                    "\nPress 2 to login" +
                    "\nPress 3 to exit");
            int choice =choiceInput.nextInt();


            if (choice==1) {

                    System.out.println("Enter your name : ");
                    String name = inputStr.nextLine();

                    System.out.println("Enter your password : ");
                    String password = inputStr.nextLine();

                    System.out.println("Enter your phone : ");
                    String phone = inputStr.nextLine();

                    System.out.println("Enter your location : ");
                    String location = inputStr.nextLine();

                    System.out.println("Enter your ID : ");
                    String ID = inputStr.nextLine();

                    System.out.println("Enter your E-mail : ");
                    String email = inputStr.nextLine();

                    System.out.println("Are you a ?" +
                            "\n1-Player" +
                            "\n2-Playground owner");
                    int typeChoice=inputInt.nextInt();
                    String type="";
                    if(typeChoice==1){
                        type="player";
                    }
                    else if(typeChoice==2){
                        type="playground owner";
                    }
                    else{
                        System.out.println("Enter a valid choice!");
                    }

                    Profile profile = new Profile(name.toLowerCase(), password.toLowerCase(), phone, location, ID, email, type.toLowerCase());

                    if (type.toLowerCase().equals("player") ) {
                        player = new Player(profile);
                    } else if (type.toLowerCase().equals("Playground owner") ) {

                        playgroundOwner = new PlaygroundOwner(profile);
                    }

            }
                else if(choice==2) {
                System.out.println("Enter your User name : ");
                String userName = inputStr.nextLine();

                System.out.println("Enter your password : ");
                String userPassword = inputStr.nextLine();

                Sign_in.log_in(userName, userPassword);
                if (Sign_in.isState()) {
                    System.out.println("logged in successfully.");

                    if (Sign_in.getType(userName, userPassword).equals("player")) {
                        player.bookPlayground();
                    } else if (Sign_in.getType(userName, userPassword).equals("playground owner")) {
                        System.out.println("Press 1 to add a playground" +
                                "\nPress 2 t delete a playground");
                        int choiceOwner = choiceInput.nextInt();
                        if (choiceOwner==1) {


                            System.out.println("Enter the playground's name :");
                            String nameP = inputStr.nextLine();

                            System.out.println("Enter the playground's size :");
                            int size = inputInt.nextInt();

                            System.out.println("Enter the playground's location :");
                            String locationP = inputStr.nextLine();

                            System.out.println("Enter the playground's price :");
                            int price = inputInt.nextInt();

                            Playgrounds playgrounds = new Playgrounds(nameP, size, locationP, price, true);

                            System.out.println("How many time slots you would like to make available ? ");
                            int slots =inputInt.nextInt();

                            playgrounds.setTimeSlots(slots);

                            playgroundOwner.addPlayground(playgrounds);

                        }

                            else if(choiceOwner==2){
                                playgroundOwner.deletePlayground();
                            }




                    }
                }
            }
                else if(choice==3){
                    return;
            }
                else{
                    return;
            }


            }
        }


    }

