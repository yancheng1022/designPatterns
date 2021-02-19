package proxy.jdkProxy;

import java.lang.reflect.Proxy;

/**
 * 源码分析：
 * （1）为接口创建代理类的字节码文件
 * （2）使用ClassLoader将字节码文件加载到JVM
 * （3）创建爱你代理类目标对象，执行对象的目标方法
 */

public class Client {
    public static void main(String[] args) {
        Rent host = new Host();
        Rent rent = (Rent)Proxy.newProxyInstance(host.getClass().getClassLoader(), new Class[]{Rent.class}, new JDKDynamicProxy(host));
        rent.rent();
    }
}
