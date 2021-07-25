package com.company;

public class Player {
    /**
     *
     * @param profile stores all his details from the profile class
     */
    protected Profile profile;

    /**
     *
     * @param profile stores all his details from the profile class
     */

    public Player(Profile profile) {
        this.profile=profile;
    }
    public Player() {}


    /**
     *
     * @return profile
     */

    public Profile getProfile() {
        return profile;
    }
    /**
     *
     * @param profile sets profile manually
     */

    public void setProfile(Profile profile) {
        this.profile = profile;
    }

    /**
     * a method to call the book method from the PlaygroundsPlayer class
     */

    public void bookPlayground(){
        System.out.println("Booking menu ");
        PlaygroundsPlayer.showPlaygrounds();
    }
}
