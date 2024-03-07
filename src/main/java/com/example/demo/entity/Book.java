package com.example.demo.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "books")
public class Book extends BaseEntity{
    @jakarta.persistence.Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer Id;

    @NotBlank(message = "タイトルが未入力です。")
    @Size(max = 255, message = "著者は255文字以内で入力してください")
    private String title;

    @NotBlank(message = "価格が未入力です。")
    @Min(value = 0, message = "価格は0以上の整数を入力してください")
    private String price;

    @NotBlank(message = "著者が未入力です。")
    @ManyToOne
    private Author author;

    @NotBlank(message = "カテゴリが未入力です。")
    @ManyToOne
    private Category category;
}
