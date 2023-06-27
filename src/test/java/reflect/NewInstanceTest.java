package reflect;

import org.junit.jupiter.api.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Modifier;
import java.util.Date;
import java.util.Scanner;

public class NewInstanceTest {

    @Test
    public void create() throws InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        //第一种方式 使用Class对象的newInstance()方法来创建Class对象对应类的实例
        Class<Date> c = Date.class;
        Date date = (Date) c.newInstance();
        System.out.println(date);
        //第二种方式 先通过Class对象获取指定的Constructor对象，再调用Constructor对象的newInstance()方法来创建实例
        long time = date.getTime();
        Constructor<Date> constructor = c.getConstructor(long.class);
        Date newInstance = (Date) constructor.newInstance(time);
        System.out.println(newInstance);


    }

    public static void main(String[] args) {
        String name;
        if (args.length > 0) {
            name = args[0];
        } else {
            Scanner scanner = new Scanner(System.in);
            System.out.println("输入一个类名");
            name = scanner.next();

        }
        try {
            Class<?> c1 = Class.forName(name);
            Class<?> superC1 = c1.getSuperclass();
            String modifiers = Modifier.toString(c1.getModifiers());
            if (modifiers.length() > 0) {
                System.out.println(modifiers + " ");
            }
            System.out.println("class: " + name);
            if(superC1!=null&&superC1!=Object.class){
                System.out.println("extend: " + superC1.getName());
            }

        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }


    }

}
