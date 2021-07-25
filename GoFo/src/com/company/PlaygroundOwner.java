package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class PlaygroundOwner {

    /**
     *
     * @param profile stores all his details from the profile class
     * @param playgrounds stores the playgrounds that belongs to the specific playground owner
     *
     */
    protected Profile profile;
    protected ArrayList<Playgrounds> playgrounds=new ArrayList<Playgrounds>();
    protected Boolean state=true;


    public PlaygroundOwner(){}

    /**
     *
     * @param profile stores all his details from the profile class
     */
    public PlaygroundOwner(Profile profile) {
        this.profile=profile;
    }

    /**
     *
     * @param playground to add a recently created playground to the playground owner's ArrayList of playgrounds
     */
    public void addPlayground(Playgrounds playground){
        playgrounds.add(playground);
        System.out.println("Playground has been successfully added");
    }

    /**
     * A function to delete a playground
     */

    public void deletePlayground(){
        if(playgrounds.size()==0){
            System.out.println("You don't have any registered playgrounds.");
        }
        else {
            Scanner input =new Scanner(System.in);
            for (int i = 0; i < playgrounds.size(); i++) {
                System.out.println(i+1+"-"+playgrounds.get(i).toString());
            }

            System.out.println("Enter the number of the playground you wish to delete! ");
            int choice =input.nextInt();

            if(choice>playgrounds.size()||choice<0){
                System.out.println("Wrong index,please try again! ");
            }
            else {
                playgrounds.remove(choice-1);
                System.out.println("Playground has been successfully deleted!");
            }
        }
    }

}
