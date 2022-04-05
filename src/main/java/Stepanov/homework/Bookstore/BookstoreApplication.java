package Stepanov.homework.Bookstore;

import Stepanov.homework.Bookstore.author.AuthorService;
import Stepanov.homework.Bookstore.book.BookService;
import Stepanov.homework.Bookstore.bookWarehouse.BookWarehouseService;
import Stepanov.homework.Bookstore.buyer.BuyerService;
import Stepanov.homework.Bookstore.entity.Author;
import Stepanov.homework.Bookstore.entity.Book;
import Stepanov.homework.Bookstore.entity.Ordering;
import Stepanov.homework.Bookstore.entity.OrderingDetails;
import Stepanov.homework.Bookstore.ordering.OrderService;
import Stepanov.homework.Bookstore.ordering_details.OrderingDetailsService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class BookstoreApplication {

    private static final Logger log = LoggerFactory.getLogger(BookstoreApplication.class);

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(BookstoreApplication.class, args);

        AuthorService authorService = context.getBean(AuthorService.class);
        BookService bookService = context.getBean(BookService.class);
        BookWarehouseService bookWarehouseService = context.getBean(BookWarehouseService.class);
        BuyerService buyerService = context.getBean(BuyerService.class);
        OrderService orderService = context.getBean(OrderService.class);
        OrderingDetailsService orderingDetailsService = context.getBean(OrderingDetailsService.class);

        //       authorService.createAuthor(new Author("Petrov", "Ivan", "Ivanovich")); //"Ivanov", "Ivan", "Ivanovich"

        //      bookService.createBook(new Book("Summer", authorService.getAuthorById(2L), 2002, 220, 600));

        //    log.info("Authors: {}", authorService.getAuthors());

    }
}
