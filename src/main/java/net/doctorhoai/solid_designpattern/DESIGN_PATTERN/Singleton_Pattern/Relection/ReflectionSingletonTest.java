package net.doctorhoai.solid_designpattern.DESIGN_PATTERN.Singleton_Pattern.Relection;

import net.doctorhoai.solid_designpattern.DESIGN_PATTERN.Singleton_Pattern.Eager_Initialization.Eager;

import java.lang.reflect.Constructor;

public class ReflectionSingletonTest {
    public static void main(String[] args) {
        Eager instanceOne = Eager.getEager();
        Eager instanceTwo = null;
        try {
            Constructor[] constructors = Eager.class.getDeclaredConstructors();
            for (Constructor constructor : constructors) {
                //Below code will destroy the singleton pattern
                constructor.setAccessible(true);
                instanceTwo = (Eager) constructor.newInstance();
                break;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(instanceOne.hashCode());
        System.out.println(instanceTwo.hashCode());
    }
}
