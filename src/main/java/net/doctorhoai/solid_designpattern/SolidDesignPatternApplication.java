package net.doctorhoai.solid_designpattern;

import net.doctorhoai.solid_designpattern.DESIGN_PATTERN.Singleton_Pattern.BookController;
import net.doctorhoai.solid_designpattern.DESIGN_PATTERN.Singleton_Pattern.LibraryController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SolidDesignPatternApplication implements CommandLineRunner {
    @Autowired
    BookController bookController;
    @Autowired
    LibraryController libraryController;
    public static void main(String[] args) {
        SpringApplication.run(SolidDesignPatternApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        bookController.getBook();
        libraryController.getBook();
    }
}
