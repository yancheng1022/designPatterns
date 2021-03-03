package factory;

/**
 * 简单工厂模式
 */
public class ComputerFactory_01 {
    public static Computer createComputer(String type){
        Computer mComputer=null;
        switch (type) {
            case "lenovo":
                mComputer=new LenovoComputer();
                break;
            case "hp":
                mComputer=new HPComputer();
                break;
        }
        return mComputer;
    }
}
