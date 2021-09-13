package com.ssm.controller;

import com.ssm.pojo.Books;
import com.ssm.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/book")
public class BookController {
    //controller 调用service
    @Autowired
    @Qualifier("BookServiceImpl")
    private BookService bookService;

    @RequestMapping("/allBook")
    public String list(Model model) {
        List<Books> list = bookService.queryAllBook();
        model.addAttribute("list", list);
        return "allBook";
    }
    //新增书籍
    @RequestMapping("/toaddBook")
    public String addPaper(Books books) {
        return "addBook";
    }
    //添加书籍页面的按钮事件
    @RequestMapping("addBook")
    public String addBook(Books books)
    {
        System.out.println("addBook=>"+books);
        bookService.addBook(books);
        return "redirect:/book/allBook";//重定向到allBook
    }
    //跳转到修改页面
    @RequestMapping("/toUpdateBook")
    public String toUpdatePage(int id,Model model){
        Books book = bookService.queryBookById(id);
        model.addAttribute("book",book);
        return "updateBook";
    }
    //修改书籍
    @RequestMapping("/updateBook")
    public String updateBook(Books book){
        System.out.println(book);
        bookService.updateBook(book);
        return "redirect:/book/allBook";

    }
    //删除书籍
    @RequestMapping("/deleteBook/{bookID}")
    public String deleteBook(@PathVariable("bookID") int id){

        bookService.deleteBookById(id);
        return "redirect:/book/allBook";

    }

    //查询书籍
    @RequestMapping("/queryBook")
    public String queryBook(String queryBookName,Model model){
        Books book = bookService.queryBookByName(queryBookName);
        List<Books> lists = new ArrayList<Books>();
        lists.add(book);
        if (book == null){
            lists =  bookService.queryAllBook();
            model.addAttribute("error","error");
        }
        model.addAttribute("list",lists);
        return "allBook";
    }

}
