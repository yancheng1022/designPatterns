package singleton;

public class Singleton_hungry {
    //构造函数私有化
    private Singleton_hungry(){}
    //定义私有的引用
    private static Singleton_hungry instance = new Singleton_hungry();
    //对外提供获取实例的方法
    public static Singleton_hungry getInstance(){
        return instance;
    }
}
