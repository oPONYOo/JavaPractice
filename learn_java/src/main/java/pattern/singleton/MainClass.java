package pattern.singleton;

import pattern.singleton.eagerinitialization.Singleton;

public class MainClass {
    public static void main(String[] args) {
        Singleton.getInstance();
        pattern.singleton.staticblockinitialization.Singleton.getInstance();
        pattern.singleton.lazyInitialization.Singleton.getInstance();
    }
}
