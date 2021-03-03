package decorator;

/**
 * 抽象装饰类
 */
public class Decorator implements IMilkyTea{
    //持有抽象构建类的一个引用
    private IMilkyTea iMilkyTea;

    public void setMilkyTea(IMilkyTea iMilkyTea){
        this.iMilkyTea = iMilkyTea;
    }

    @Override
    public void makeMilkyTea() {
        iMilkyTea.makeMilkyTea();
    }
}
