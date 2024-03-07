package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;
import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "authors")
public class Author extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer Id;

    @NotBlank(message = "著者が未入力です。")
    @Size(max = 255, message = "著者は255文字以内で入力してください。")
    private String name;

    @OneToMany(mappedBy = "author")
    private List<Book> books;
}
