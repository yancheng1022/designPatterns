package factory;

//抽象产品类
public abstract class Computer {
    /**
     * 产品的抽象方法，由具体的产品类去实现
     */
    public abstract void start();
}
//具体产品类
class LenovoComputer extends Computer{
    @Override
    public void start() {
        System.out.println("联想电脑启动");
    }
}
class HPComputer extends Computer{
    @Override
    public void start() {
        System.out.println("惠普电脑启动");
    }
}
