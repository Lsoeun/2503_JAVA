public class ArrayTest5 {
    public static void main(String[] args) {
        double[] data = new double[5];
        // double타입으로 길이가 5인 배열 선언

        data[0] = 10.0;
        data[1] = 20.0;
        data[2] = 30.0;

        for (int i = 0; i < data.length; i++){
            // 전체 배열 길이만큼 반복
            System.out.println(data[i]);
        }
    }
}
