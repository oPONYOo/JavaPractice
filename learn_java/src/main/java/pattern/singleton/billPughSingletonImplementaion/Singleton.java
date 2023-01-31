package pattern.singleton.billPughSingletonImplementaion;

public class Singleton {
    /**
     * Bill Pugh Singleton Implementaion
     * - Bill Pugh가 고안한 방식으로, inner static helper class를 사용하는 방식이다.
     * - 앞선 방식들의 단점을 대부분 보완한 방식으로, 현재 가장 널리 쓰이는 싱글톤 구현 방법이다.
     * - private inner static class를 두어 싱글톤 인스턴스를 갖게 한다.
     * - Eager Initialization, Static Block Initialization 방식과 다르게
     *   SingletonHelper 클래스는 Singleton 클래스가 load될 때에도 load되지 않다가
     *   getInstance()가 호출됐을 때 JVM 메모리에 로드되고 인스턴스를 생성하게 된다.
     * - synchronized를 사용하지 않기 때문에 성능 저하가 발생하지 않는다.
     */
    private Singleton() {
    }

    private static class SingletonHelper {
        private static final Singleton INSTANCE = new Singleton();
    }

    public static Singleton getInstance() {
        return SingletonHelper.INSTANCE;
    }


}
