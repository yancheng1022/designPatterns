package singleton;

public class Singleton_lazy {
    //构造函数私有化
    private Singleton_lazy(){}
    private static Singleton_lazy instance;
    //对外提供获取实例的接口
    public static Singleton_lazy getInstance(){
        if (instance == null){
            instance =  new Singleton_lazy();
        }
        return instance;
    }
}
