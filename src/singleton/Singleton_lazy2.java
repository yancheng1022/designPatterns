package singleton;

public class Singleton_lazy2 {
    private Singleton_lazy2(){};
    private volatile Singleton_lazy2 instance = null;

    public Singleton_lazy2 getInstance(){
        //第一次校验singleton是否为空（已经创建实例不用竞争锁，提高效率）
        if(instance == null){
            synchronized (Singleton_lazy2.class){
                //第二次校验singleton是否为空
                if (instance == null){
                    return new Singleton_lazy2();
                }
            }
        }
        return instance;
    }
}
