package singleton;

public class Singleton_hungry {
    private Singleton_hungry(){}
    Singleton_hungry instance = new Singleton_hungry();
    public Singleton_hungry getInstance(){
        return instance;
    }
}
