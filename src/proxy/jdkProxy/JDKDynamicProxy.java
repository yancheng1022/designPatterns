package proxy.jdkProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class JDKDynamicProxy implements InvocationHandler {
    private Object target;

    public JDKDynamicProxy(Object target){
        this.target = target;
    }

    //invoke 代表的是执行代理对象的方法
    //method：代表目标对象的方法字节码对象
    //args:代表目标对象的响应的方法的参数
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("看房子");
        System.out.println("谈价格");
        //当代理对象调用真实对象的方法时，其会自动的跳转到代理对象关联的handler对象的invoke方法来进行调用
        Object result = method.invoke(target, args);
        return result;
    }
}
