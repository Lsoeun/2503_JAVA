public class Variable3 { // 변수 특징 알아보기
    public static void main(String[] args) {
        // 1. 변수는 선언(정의)되어야만 사용이 가능합니다.
        int level;

        // 2. 변수를 선언할 때 변수명 앞에 반드시 데이터 타입이 명시되어야 한다.
        String name;
        // number; -> 변수 선언 오류(데이터 타입을 명시하지 않았기 때문!)

        // 3. 변수는 값을 저장할 수 있는 공간이다.!
        int id = 1000;

        // 4. 변수는 중복해서 정의하는 것이 불가능하다.
        // int level; 동일한 이름의 변수를 또 정의하는 것은 불가능하다!
        // int id = 2000;
        id = 2000; // 변수에 새로운 값을 대입하는 것은 가능

        // 5. 변수는 재사용이 가능하다.
        int x = 30;
        System.out.println(x);

        x = 10; // 변수 재사용
        System.out.println(x);

        x = x + 50;
        System.out.println(x);

        // 6. 변수에는 값을 오직 하나만 저장이 가능하다.
        System.out.println(x);

        // 7. 변수는 초기화 하지 않으면 사용이 불가능하다.
        int ini;
        // System.out.println(ini);

        // 8. 변수명을 다르게 하면 얼마든지 새로운 변수를 선언할 수 있다.
        int a = 10;
        int b = 20;
        int c = 30;
    }
}
