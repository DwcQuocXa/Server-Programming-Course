package com.example.demo.web;

import com.example.demo.domain.Book;
import com.example.demo.domain.BookRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class BookController {
    @GetMapping("/index")
    public String helloIndex() {
        return "index";
    }

    @Autowired
    BookRepository repository;

    @GetMapping("/booklist")
    public String bookStoreFront(Model model) {

        model.addAttribute("books", repository.findAll());
        return "booklist";
    }

    @PostMapping("/save")
    public String saveBook(Book book) {
        repository.save(book);
        return "redirect:booklist";
    }

    @GetMapping("/delete/{id}")
    public String deleteBook(@PathVariable("id") Long id, Model model) {
        repository.deleteById(id);
        return "redirect:../booklist";
    }
}
