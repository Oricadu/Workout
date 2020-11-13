package com.hfad.workout;

public class Workout {
    private String name;
    private String description;

    public static final Workout[] workouts = {
            new Workout("The Limb Loosener", "5 Handstand push-ups\n 10 1-legged squats\n 15 Pull0ups"),
            new Workout("The Limb ", "25 Handstand push-ups\n 10 2-legged squats\n 15 Pull-ups"),
            new Workout("The Limb Loosener", "5 legstand push-ups\n 10 1-hand squats\n 15 Pull-ups"),
    };

    private Workout(String name, String description){
        this.name = name;
        this.description = description;
    }

    public String getDescription(){
        return description;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return this.name;
    }
}
