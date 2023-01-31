package pattern.singleton.threadSafeSingleton;

public class Singleton {
    /**
     * Thread Safe Singleton
     * - Lazy Initialization의 문제를 해결하기 위한 방법이다.
     * - getInstance() 메소드에 synchronized를 걸어두는 방식이다.
     * - 이렇게 구현하면 getInstance() 메소드 내에 진입하는 스레드가 하나로 보장받기 때문에
     *   멀티 스레드 환경에서도 정상 동작하게 된다.
     *
     * 단점
     * - synchronized키워드 자체에 대한 비용이 크기 때문에 싱글톤 인스턴스 호출이 잦은
     *   어플리케이션에서는 성능이 떨어지게 된다.
     *
     * double checked locking
     * - synchronized블럭 사용하기
     * - 이는 getInstance() 메소드 수준에 lock을 걸지 않고 instance가 null인 경우에만
     *   synchronized가 동작하도록 한다.
     *
     *   */

    private static Singleton instance;

    private Singleton() {
    }

    // synchronized 비용이 큼
    /*public static synchronized Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }*/

    public static Singleton getInstance() {
        if (instance == null) {
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
}
