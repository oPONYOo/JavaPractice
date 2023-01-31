package pattern.singleton.staticblockinitialization;

public class Singleton {
    /**
     * Static Block Initialization
     - Eager Initialization과 유사하다.
     - static block을 통해서 Exception Handling에 대한 옵션을 제공하는 방법이다.

     단점(Eager Initialization과 유사)
     - 어플리케이션에서 해당 인스턴스를 사용하지 않더라도 인스턴스를 생성하기 때문에 낭비가 발생할 수 있다.
     - 큰 리소스들을 다루는 싱글톤을 구현할 때는 getInstance() 메소드가 호출될 때까지
     싱글톤 인스턴스를 생성하지 않는 것이 더 좋다.


     */
    private static Singleton instance;

    private Singleton() {
    }

    static {
        System.out.println("Static Block Initialization: Static block ");
        try {
            instance = new Singleton();
        } catch (Exception e) {
            throw new RuntimeException("Exception occured in creating singleton instance");
        }
    }

    public static Singleton getInstance() {
        System.out.println("Static Block Initialization");
        return instance;
    }
}
