package net.doctorhoai.solid_designpattern.DESIGN_PATTERN.Singleton_Pattern;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookController {
    @Autowired
    BookRepository bookRepository;
    public void getBook(){
        System.out.println(bookRepository);
    }
}
