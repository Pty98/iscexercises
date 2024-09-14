package com.example.exjpa;
import jakarta.persistence.*;
import jakarta.persistence.OneToOne;
import lombok.Getter;
import lombok.Setter;





@Entity
@Getter
@Setter
@Table(name = "Item")



public class Item {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String name;
    private long id;
    private String catalog;
    private double price;




    @OneToOne(mappedBy = "item", cascade = CascadeType.ALL)
    private CorruptedItem corruptedItem;


}