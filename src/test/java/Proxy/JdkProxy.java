package Proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class JdkProxy implements InvocationHandler {

    private final Object bean;

    public JdkProxy(Object bean) {
        this.bean = bean;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        String name = method.getName();
        if(name.equals("wakeUp")){
            System.out.println("早安");
        } else if (name.equals("sleep")) {
            System.out.println("晚安");
        }

        return method.invoke(bean,args);
    }
}
