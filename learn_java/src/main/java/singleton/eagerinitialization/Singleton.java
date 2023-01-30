package singleton.eagerinitialization;

public class Singleton {
/**
 * Eager Initialization
- 가장 간단한 형태의 구현 방법이다.
- 이는 싱글톤 클래스의 인스턴스를 클래스 로딩 단계에서 생성하는 방법이다.

 단점
- 어플리케이션에서 해당 인스턴스를 사용하지 않더라도 인스턴스를 생성하기 때문에 낭비가 발생할 수 있다.
- 큰 리소스들을 다루는 싱글톤을 구현할 때는 getInstance() 메소드가 호출될 때까지
  싱글톤 인스턴스를 생성하지 않는 것이 더 좋다.
- Exception에 대한 Handling을 제공하지 않는다.

*/
    private static final Singleton instance = new Singleton();

    // private 생성자
    private Singleton() {}

    public static Singleton getInstance() {
        System.out.println("Eager Initialization");
        return instance;
    }

}






