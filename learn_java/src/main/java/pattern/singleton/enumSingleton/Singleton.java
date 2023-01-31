package pattern.singleton.enumSingleton;

public enum Singleton {
    /**
     * Enum Singleton
     - 앞의 싱글톤 방식은 완전히 안전할 수 없다. 왜냐하면 java의 reflection을 통해
       싱글톤을 파과할 수 있기 때문이다.
     - Joshua Bloch는 Enum으로 싱글톤을 구현하는 방법을 제안했다.

     단점
     - Eager Initialization, Static Block Initialization 방식과 같이
       사용하지 않았을 경우의 메모리 문제를 해결하지 못한 것과 유연성이 떨어진다는 면에서의 한계가 있다.

     */
    INSTANCE;

    public static void doSomething() {

    }
}
