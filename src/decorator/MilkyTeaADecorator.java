package decorator;

/**
 * 具体装饰类
 */
public class MilkyTeaADecorator extends Decorator{
    @Override
    public void makeMilkyTea() {
        super.makeMilkyTea();
        //增强
        System.out.println("加珍珠");
    }
}
