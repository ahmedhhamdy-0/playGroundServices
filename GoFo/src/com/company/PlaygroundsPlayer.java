package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class PlaygroundsPlayer  {

/**
 * @param playgroundList an array list to hold all the playground objects to display for the player class
 */

   protected static ArrayList<Playgrounds> playgroundsList=new ArrayList<Playgrounds>();

    /**
     * @return a static method that show the player class all the available playgrounds and allows them to book
     */
   public static void showPlaygrounds() {
       if (playgroundsList.size() == 0) {
           System.out.println("There are not  playgrounds currently available.");
           return;
       } else {
           Scanner in = new Scanner(System.in);
           for (int i = 0; i < playgroundsList.size() ; i++) {
               System.out.println((i + 1) + "-" + playgroundsList.get(i).toString());
           }
           System.out.println("Press 1 if you want to proceed to booking" +
                   "\nPress 2 if you want to exit");
           int choice = in.nextInt();
           if (choice == 2) {
               return;
           } else if (choice == 1) {
               System.out.println("Please enter the index of the playground that you want to book.");
               int choice2 = in.nextInt();
               choice2-=1;
               playgroundsList.get(choice2).getTimeSlots();
               System.out.println("Which timeslot you would like to book ?");
               int choice3 = in.nextInt();
               choice3-=1;
               playgroundsList.get(choice2).getTimeSlots().remove(choice3);
               System.out.println("Playground has been booked ! " +
                       "\nnow proceeding to payment");
           }

       }
   }

    /**
     *
     * @param playgrounds to be added to the playgroundsList
     */
   public static void addPlayground(Playgrounds playgrounds){
       System.out.println("Playground has been successfully added to the playgrounds list");
       playgroundsList.add(playgrounds);
   }
}
