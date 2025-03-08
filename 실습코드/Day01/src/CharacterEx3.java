public class CharacterEx3 {
    public static void main(String[] args) {
        int a = 65; // 정수 자료형에는 양수 음수 모두 가능
        int b = -65;

        char a2 = 65; // 문자 자료형에 양수 값을 넣는 것은 가능
        // char b2 = -65; // 문자 자료형 변수에는 음수를 넣으면 오류가 발생!

        System.out.println(a);
        System.out.println((char)a);
        System.out.println((char)b); // 음수는 char로 변환할 수 없음
        System.out.println(a2);
    }
}
