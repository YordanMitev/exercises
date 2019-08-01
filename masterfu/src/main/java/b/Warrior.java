package b;

import java.lang.Math;

public class Warrior {

    private int experience;

    Warrior() {
        // A warrior starts at level 1 and can progress all the way to 100.
        // A warrior's experience starts from 100.
        // Each time the warrior's experience increases by another 100, the warrior's level rises to the next level.
        this.experience = 100;
    }


    public int getExperience() {
        return this.experience;
    }

    public void setExperience(int experience) {
        // experience ne moje da e < 100 ili > 10000 nikoga
        if(experience < 100) experience = 100;
        if(experience > 10000) experience = 10000;

        // v sluchaq "experience" e referenciq kym parametyra na metoda
        // a "this.experience" e kym private class-member-a definiran v nachaloto na faila
        this.experience = experience;
    }

    // getLevel
    public double getLevel() {
        return Math.floor(experience / 100);
    }

    public String getRank() {
        if(this.getLevel() < 10) {
            return "Pushover";
        } else if (this.getLevel() < 20) {
            return "Novice";
        } else if (this.getLevel() < 30) {
            return "Fighter";
        } else if (this.getLevel() < 40) {
            return "Warrior";
        } else if (this.getLevel() < 50) {
            return "Veteran";
        } else if (this.getLevel() < 60) {
            return "Sage";
        } else if (this.getLevel() < 70) {
            return "Elite";
        } else if (this.getLevel() < 80) {
            return "Conqueror";
        } else if (this.getLevel() < 90) {
            return "Champion";
        } else if (this.getLevel() < 100) {
            return "Master";
        } else {
            return "Greatest";
        }
    }
}

