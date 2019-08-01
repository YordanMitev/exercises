package c;

public class App {
    public static void main(String[] args) throws Exception {

        Warrior jackieChan = new Warrior(100);
        System.out.println("lvl: " + jackieChan.getLevel());
        System.out.println("exp: " + jackieChan.getExperience());
        System.out.println("rank: " + jackieChan.getRank());
        System.out.println("training: " + jackieChan.getTraining());
        System.out.println("train: " + jackieChan.train("Smashed Hulk", 9000, 1));
        System.out.println("exp: " + jackieChan.getExperience());
        System.out.println("lvl: " + jackieChan.getLevel());
        System.out.println("rank: " + jackieChan.getRank());
        System.out.println("fight: " + jackieChan.fight(90));
        System.out.println("exp: " + jackieChan.getExperience());
        System.out.println("training: " + jackieChan.getTraining());

        // System.out.println("train: " + jackieChan.train("Defeated Super Mario", 3,
        // 3));
        // System.out.println("lvl: " + jackieChan.getLevel());
        // System.out.println("exp: " + jackieChan.getExperience());
        // System.out.println("rank: " + jackieChan.getRank());
        // System.out.println("training: " + jackieChan.getTraining());

        // System.out.println("train: " + jackieChan.train("Killed Hitler", 892, 90));
        // System.out.println("lvl: " + jackieChan.getLevel());
        // System.out.println("exp: " + jackieChan.getExperience());
        // System.out.println("rank: " + jackieChan.getRank());
        // System.out.println("training: " + jackieChan.getTraining());
    }
}