package chapter03;

public class UnsafeLazyInitialization {
    private static Instance instance;

    public static Instance getInstance() {
        if (instance == null) //1��A�߳�ִ��
            instance = new Instance(); //2��B�߳�ִ��
        return instance;
    }

    static class Instance {
    }
}
