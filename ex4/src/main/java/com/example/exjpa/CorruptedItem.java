package com.example.exjpa;
import jakarta.persistence.*;
import jakarta.persistence.OneToOne;
import lombok.Getter;
import lombok.Setter;


@Entity
@Getter
@Setter
@Table( name = "CorruptedItem")



public class CorruptedItem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;



    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "ItemId")
    private Item item;
    private String Reasons;
    private String name;

}