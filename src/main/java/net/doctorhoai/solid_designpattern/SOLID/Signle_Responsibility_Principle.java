package net.doctorhoai.solid_designpattern.SOLID;

import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.net.URL;
import java.util.List;
import java.util.ArrayList;

public class Signle_Responsibility_Principle {
    static class Journal{
        private final List<String> entries = new ArrayList<>();
        private static int count = 0;
        public void addEntry( String text ){
            entries.add("" + (++count) + ": " + text);
        }
        public void removeEntry( int index ){
            entries.remove(index);
        }
        @Override
        public String toString(){
            return String.join(System.lineSeparator() , entries);
        }


        // mot class chi nen giai quyet mot van de va chi sua boi 1 ly do
//        public void save( String fileName ){
//            try (PrintStream out = new PrintStream(fileName)){
//                out.println(toString());
//            } catch (FileNotFoundException e) {
//                throw new RuntimeException(e);
//            }
//        }
//        public void load( String fileName) {}
//        public void load( URL url) {}
    }
    public static void main( String arg[] ) {
        Journal j = new Journal();
        j.addEntry("I cried today");
        j.addEntry("I ate a bug!");
        System.out.println(j);
    }
}
