// 명시적 형변환(강제 형변환) 예제
public class ExplicitConversion {
    public static void main(String[] args) {
        // 바이트 크기가 큰 자료형에서 작은 자료형으로 대입
        int iNum = 10;
        byte bNum = (byte)iNum;
        System.out.println(iNum);
        System.out.println(bNum);

        // 더 정밀한 자료형에서 덜 정밀한 자료형으로 대입
        double dNum = 3.14;
        int iNum2 = (int)dNum;
        System.out.println(dNum);
        System.out.println(iNum2);

        // 연산 중 강제 형 변환
        double dNum1 = 1.2;
        float dNum2 = 0.9F;

        int iNum3 = (int)dNum1 + (int)dNum2;
        int iNum4 = (int)(dNum1 + dNum2);
        System.out.println(iNum3);
        System.out.println(iNum4);
    }
}
