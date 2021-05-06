package singleton;

public class Singleton_lazy2 {
    private Singleton_lazy2(){};
    private static volatile Singleton_lazy2 instance;
    public Singleton_lazy2 getInstance(){
        //第一次校验singleton是否为空（已经创建实例不用竞争锁，提高效率）
        if(instance == null){
            synchronized (Singleton_lazy2.class){
                //第二次判断是因为假设有两个线程A、B,两个同时通过了第一个if，然后A获取了锁，进入然后判断doubleLock是null，他就实例化了doubleLock，然后他出了锁，
                //这时候线程B经过等待A释放的锁，B获取锁了，如果没有第二个判断，那么他还是会去new DoubleLock()，再创建一个实例，所以为了防止这种情况，需要第二次判断
                if (instance == null){
                    instance =  new Singleton_lazy2();
                }
            }
        }
        return instance;
    }
}
