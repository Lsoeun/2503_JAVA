public class Constant {
    public static void main(String[] args) {
        // int maxScore = 100; // 변수
        final int MAX_SCORE = 100; // 상수 선언과 초기화
        System.out.println("최고 점수 : " + MAX_SCORE);
        // MAX_SCORE = 200; 오류 발생 : 상수는 값을 변경할 수 없음

        final double PI = 3.14;
        final int MAX_NUM = 100;
    }
}
