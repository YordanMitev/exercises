package c;

import java.lang.Math;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

public class Warrior {

    private int experience;
    private List<String> training = new ArrayList<String>();
    private static final List<String> ranks = Arrays.asList("Pushover", "Novice", "Fighter", "Warrior", "Veteran", "Sage",
            "Elite", "Conqueror", "Champion", "Master", "Greatest");

    Warrior(int experience) {
        // A warrior starts at level 1 and can progress all the way to 100.
        // A warrior's experience starts from 100.
        // Each time the warrior's experience increases by another 100, the warrior's
        // level rises to the next level.
        this.setExperience(experience);
    }

    public void setExperience(int experience) {
        // experience ne moje da e < 100 ili > 10000 nikoga
        if (experience < 100)
            experience = 100;
        if (experience > 10000)
            experience = 10000;

        this.experience = experience;
    }

    public void addExperience(int experience) {
        this.setExperience(this.experience + experience);
    }

    public int getExperience() {
        return this.experience;
    }

    public int getLevel() {
        return (int) Math.floor(experience / 100);
    }

    public int getRankIndex(int level) {
        if (level < 1)
            level = 1;
        if (level > 10)
            level = 10;
        return (int) Math.floor(level / 10);
    }

    public String getRank() {
        return ranks.get(this.getRankIndex(this.getLevel()));
    }

    public List<String> getTraining() {
        return training;
    }

    public String fight(int enemyLevel) {
        int levelDifference = enemyLevel - this.getLevel();
        int enemyRank = this.getRankIndex(enemyLevel);
        int rankDifference = enemyRank - this.getRankIndex(this.getLevel());

        // Completing a battle against an enemy with the same level as your warrior will
        // be worth 10 experience points.
        if (levelDifference == 0) {
            this.addExperience(10);
            return "A good fight!";
        }

        // Completing a battle against an enemy who is one level lower than your warrior
        // will be worth 5 experience points.
        if (levelDifference == -1) {
            this.addExperience(5);
            return "A good fight!";
        }

        // Completing a battle against an enemy who is two levels lower or more than
        // your warrior will give 0 experience points.
        if (levelDifference < -1) {
            return "Easy fight!";
        }

        // Completing a battle against an enemy who is one level higher or
        // more than your warrior will accelerate your experience gaining.
        // The greater the difference between levels, the more experience
        // your warrior will gain.
        // ​The formula is 20 * diff * diff​ where ​diff ​equals the difference
        // in levels between the enemy and your warrior.
        if ((rankDifference == 0 && levelDifference >= 1) || (rankDifference > 0 && levelDifference <= 5)) {
            this.addExperience(20 * levelDifference * levelDifference);
            return "An intense fight!";
        } else {
            return "You've been defeated!";
        }
    }

    public String train(String description, int experienceGained, int minLevel) {
        if (this.getLevel() < minLevel) {
            return "Not strong enough!";
        }
        this.addExperience(experienceGained);
        training.add(description);
        return description;
    }
}
