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
@Table(name = "categories")
public class Category extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @NotBlank(message = "カテゴリ名が未入力です")
    @Size(max = 255, message = "カテゴリ名は255文字以内にしてください")
    private String name;

    @OneToMany(mappedBy = "category")
    private List<Book> books;
}
