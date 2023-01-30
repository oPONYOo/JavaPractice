package singleton;

import singleton.eagerinitialization.Singleton;

public class MainClass {
    public static void main(String[] args) {
        Singleton.getInstance();
        singleton.staticblockinitialization.Singleton.getInstance();
    }
}
