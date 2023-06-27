package Proxy;

import com.mysql.cj.protocol.Message;
import org.mockito.internal.util.StringUtil;

import java.lang.reflect.Proxy;
import java.text.MessageFormat;

public class Students implements Person {

    private String name;

    public Students() {
    }

    public Students(String name) {
        this.name = name;
    }


    @Override
    public void wakeUp() {
        System.out.println(MessageFormat.format("学生{0}早晨醒来了", name));

    }

    @Override
    public void sleep() {
        System.out.println(MessageFormat.format("学生{0}晚上睡觉", name));

    }

    public static void main(String[] args) {
        Person student1 = new Students("张三");
        PersonProxy personProxy = new PersonProxy(student1);
        personProxy.wakeUp();
        personProxy.sleep();
        //动态代理测试
        JdkProxy proxy = new JdkProxy(new Students("王五"));
        Person student2 = (Person) Proxy.newProxyInstance(proxy.getClass().getClassLoader(), new Class[]{Person.class}, proxy);
        student2.wakeUp();
        student2.sleep();
    }
}
