package Stepanov.homework.Bookstore.entity;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Getter
@Setter
@ToString
@RequiredArgsConstructor
public class BookWarehouse {
    @Id
    private Long id;

    @OneToOne
    @JoinColumn(nullable = false)
    private Book book;

    @Column
    private Integer balance;

}
