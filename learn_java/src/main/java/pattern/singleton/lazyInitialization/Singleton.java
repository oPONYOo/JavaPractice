package pattern.singleton.lazyInitialization;

public class Singleton {
    /**
     * Lazy Initialization
     - global access한 getInstance() 메소드를 호출할 때에 인스턴스가 없다면 생성한다.
     - 사용하지 않았을 경우 인스턴스 낭비가 일어난다는
       Eager Initalization, Static Block Initialization의 단점은 어느정도 해결된다.

     단점
     - multi-thread 환경에서 동기화 문제가 있다.
     - 만약 인스턴스가 생성되지 않은 시점에서 여러 스레드가 동시에 getInstance()를 호출한다면
       예상치 못한 결과를 얻을 수 있을 뿐만 아니라, 단 하나의 인스턴스를 생성한다는
       싱글톤 패턴에 위반하는 문제점이 야기될 수 있다.

     */

    private static Singleton instance;
    private Singleton(){}

    public static Singleton getInstance() {
        System.out.println("Lazy Initialization");
        if (instance == null) {
            System.out.println("Lazy Initialization: null");
            instance = new Singleton();
        }
        return instance;
    }
}
