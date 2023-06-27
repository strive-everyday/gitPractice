package Proxy;

public class PersonProxy implements Person {

    private Person person;

    public PersonProxy(Person person) {
        this.person = person;
    }

    @Override
    public void wakeUp() {
        System.out.println("早安");
        person.wakeUp();

    }

    @Override
    public void sleep() {
        System.out.println("晚安");
        person.sleep();
    }
}
