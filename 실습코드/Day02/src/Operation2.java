public class Operation2 {
    public static void main(String[] args) {
        int mathScore = 90;
        int engScore = 70;

        // 총점 구하기
        int totalScore = mathScore + engScore;
        System.out.println(totalScore);

        // 평균 구하기
        double avgScore = totalScore / 2.0;
        System.out.println(avgScore);

        int result = 10 + 2 * 3 - 4 / 2;
        System.out.println(result);

        int result2 = (10 + 2) * 3 - 4 / 2;
        System.out.println(result2);
    }
}
