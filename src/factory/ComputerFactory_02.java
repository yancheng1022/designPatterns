package factory;

import net.sf.cglib.proxy.Factory;

/**
 * 工厂方法模式
 */
interface ComputerFactory_02 {
    public Computer createComputer();
}

class LenvoComputerFactory implements ComputerFactory_02{
    @Override
    public Computer createComputer() {
        return new LenovoComputer();
    }
}

class HPComputerFactory implements ComputerFactory_02{
    @Override
    public Computer createComputer() {
        return new HPComputer();
    }
}
