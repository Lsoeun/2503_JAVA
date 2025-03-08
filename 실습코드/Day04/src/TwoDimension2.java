public class TwoDimension2 {
    public static void main(String[] args) {
        int[][] arr = new int[2][3]; // 2행 3열의 2차원 배열 선언

        for(int i = 0; i < arr.length; i++) { // 행 순회
            for(int j = 0; j < arr[i].length; j++) { // 열 순회
                System.out.println(arr[i][j]);
            }
            System.out.println();
        }
        System.out.println(arr.length); // 행 길이 출력
        System.out.println(arr[0].length); // 열 길이 출력
    }
}
