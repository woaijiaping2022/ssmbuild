package com.tang.controller;

import com.tang.pojo.Books;
import com.tang.service.BooksService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.List;

@Controller
@RequestMapping("/books")
public class BooksController {
    // Controller 调用service层
    @Autowired
    @Qualifier("BookServiceImpl")
    private BooksService booksService;

    // 查询全部书籍
    @RequestMapping("/allBooks")
    public String allBooks(Model model){
        List<Books> list = booksService.selectBooks();
        model.addAttribute("list",list);
        return "allBook";
    }

    // 跳转添加书籍
    @RequestMapping("/toAddBooks")
    public String toaddPaper(){
        return "addBook";
    }

    // 添加书籍请求
    @RequestMapping("/addBooks")
    public String addBooks(Books books){
        System.out.println("addBooks=>" + books);
        booksService.addBooks(books);
        return "redirect:/books/allBooks";
    }

    // 跳转书籍修改页面
    @RequestMapping("/toUpdatePaper/{id}")
    public String toUpdatePaper(@PathVariable("id") int id,Model model){
        Books books = booksService.queryBooks(id);
        System.out.println(books);
        model.addAttribute("QBook",books);
        return "updateBook";
    }

    // 修改书籍
    @RequestMapping("/updateBooks")
    public String updateBooks(Books books){
        int i = booksService.updateBooks(books);
        return "redirect:/books/allBooks";
    }

    // 删除书籍
    @RequestMapping("/deleteBooks")
    public String deleteBooks(int id){
        booksService.deleteBooks(id);
        return "redirect:/books/allBooks";
    }

    // 根据书名查询
    @RequestMapping("/queryBookName")
    public String queryBookName(Model model,String queryBookName){
        List<Books> books = booksService.queryBookName(queryBookName);
        System.err.println(books);
        if(books.size()<=0){ // 查询没有书籍则返回所有书籍
            books = booksService.selectBooks();
            model.addAttribute("err","没有书籍");
        }
        model.addAttribute("list",books);
        return "allBook";
    }

}
