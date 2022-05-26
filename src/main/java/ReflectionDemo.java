import java.io.*;
import java.lang.reflect.Method;
import java.util.*;


import java.io.File;
import java.util.LinkedList;

public class ReflectionDemo {
    public static int countOfHumans(LinkedList<Object> list){
        int result = 0;
        for (Object l : list) {
            if (l instanceof Human) {
                result++;
            }
        }

        return result;
    }

    public static HashSet<Method> getMethodsOfClass(Class Class){
        HashSet<Method> result = new HashSet<>(Arrays.asList(Class.getDeclaredMethods()));
        return  result;

    }
    public static ArrayList<String> GetSuperClasses(Class Class){
        ArrayList<String> result = new ArrayList<>();
        while (Class != null) {
            result.add(Class.getName());
            Class = Class.getSuperclass();
        }
        return result;
    }
}
