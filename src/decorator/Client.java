package decorator;

public class Client {
    public static void main(String[] args) {
        //奶茶实现类
        MilkyTea milkyTea = new MilkyTea();
        //装饰者实现类（加珍珠）
        MilkyTeaADecorator milkyTeaADecorator = new MilkyTeaADecorator();
        milkyTeaADecorator.setMilkyTea(milkyTea);
        milkyTeaADecorator.makeMilkyTea();
    }
}
