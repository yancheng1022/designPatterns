package factory;

//工厂接口
interface ComputerFactory_03 {
    public Computer createLenvoComputer();
    public Computer createHpComputer();
}
//工厂实现
class Factory implements ComputerFactory_03{
    @Override
    public Computer createLenvoComputer() {
        return new LenovoComputer();
    }
    @Override
    public Computer createHpComputer() {
        return new HPComputer();
    }
}

class Client {
    public static void main(String[] args){
//        ComputerFactory_03 factory = new Factory();
//        factory.createHpComputer();
//        factory.createLenvoComputer();
        String a = "__";
        String[] split = a.split("_",3);
        return;
    }
}

