package ch04;
/*
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ClassTest {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        Class c1 = Class.forName("ch04.Person");
        Person person1 = (Person)c1.newInstance();

        person1.setName("Lee");
        System.out.println(person1);

        Class c2 = person1.getClass();
        Person person2 = (Person)c2.newInstance();

        System.out.println(person2);

        Class[] parameterTypes = {String.class};
        Constructor cons = c2.getConstructor(parameterTypes);

        Object[] initargs = {"Kim"};
        Person kimPerson = (Person)cons.newInstance(initargs);
        System.out.println(kimPerson);
    }
}
*/