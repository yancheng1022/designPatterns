package proxy.cglibProxy;

import net.sf.cglib.proxy.Enhancer;

public class Client {
    public static void main(String[] args) {
        // 通过CGLIB动态代理获取代理对象的过程
        Enhancer enhancer = new Enhancer();
        // 设置enhancer对象的父类
        enhancer.setSuperclass(Host.class);
        // 设置enhancer的回调对象
        enhancer.setCallback(new MyMethodInterceptor());
        // 创建代理对象
        Host proxy= (Host)enhancer.create();
        // 通过代理对象调用目标方法
        proxy.rent();
    }
}
