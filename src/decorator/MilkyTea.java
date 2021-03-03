package decorator;

/**
 * 具体构建类 - （奶茶实现）
 */
public class MilkyTea implements IMilkyTea{
    @Override
    public void makeMilkyTea() {
        System.out.println("普通奶茶");
    }
}
