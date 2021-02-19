package singleton;

public class Singleton_lazy {
    private Singleton_lazy(){}
    private static Singleton_lazy instance = null;
    public Singleton_lazy getInstance(){
        if (instance == null){
            return new Singleton_lazy();
        }
        return instance;
    }
}
