public class Operation3 {
    public static void main(String[] args) {
        int gameScore = 150;

        int lastScore1 = ++gameScore;
        System.out.println(lastScore1);
        System.out.println(gameScore);

        int lastScore2 = --gameScore;
        System.out.println(lastScore2);
        System.out.println(gameScore);

        int lastScore3 = gameScore++;
        System.out.println(lastScore3);
        System.out.println(gameScore);
    }
}
