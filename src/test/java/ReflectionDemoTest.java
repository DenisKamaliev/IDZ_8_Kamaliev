
import org.junit.Test;

import java.io.*;
import java.util.List;

import static org.junit.Assert.*;
import java.lang.reflect.Method;
import java.util.*;


import java.io.File;
import java.util.LinkedList;



public class ReflectionDemoTest {

    @Test
    public void TestCountOfHumans(){
        Human human = new Human();
        Human human1 = new Human();
        Human human2 = new Human();
        Object object = new Object();
        File file = new File("src\\testTestChar.txt");
        LinkedList<Object> list = new LinkedList<>();
        list.add(human);
        list.add(human1);
        list.add(human2);
        list.add(object);
        list.add(file);
        assertEquals( 3, ReflectionDemo.countOfHumans(list));
    }

    @Test
    public void TestGetMethodsOfClass()throws NoSuchMethodException{
        HashSet<Method> expected = new HashSet<>();
        Human human = new Human();
        Class<Human> ClassHuman = (Class<Human>) human.getClass();

        expected.add(ClassHuman.getMethod("getAge"));
        expected.add(ClassHuman.getMethod("getFirstName"));
        expected.add(ClassHuman.getMethod("getSecondName"));
        expected.add(ClassHuman.getMethod("getFathersName"));
        expected.add(ClassHuman.getMethod("equals", Object.class));
        expected.add(ClassHuman.getMethod("hashCode"));
        assertEquals(expected, ReflectionDemo.getMethodsOfClass(ClassHuman));
    }

    @Test
    public void TestGetSuperClasses() {
        Class<?> Class = Student.class;
        ArrayList<String> List = new ArrayList<>();
        List.add("Student");
        List.add("Human");
        List.add("java.lang.Object");
        assertEquals(List, ReflectionDemo.GetSuperClasses(Class));
    }


}