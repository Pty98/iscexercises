package com.example.exjpa;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Component;
import java.util.List;

@Component
public class Relation {
    @PersistenceContext
    private EntityManager entitymanager;

    @Transactional
    public void sample() {
        Item item = new Item();
        item.setName("LG Mobile");
        item.setCatalog("Communication Tools");
        item.setPrice(150000);

        CorruptedItem corruptedItem = new CorruptedItem();
        corruptedItem.setReasons("Battery Burn");
        corruptedItem.setName(item.getName());

        item.setCorruptedItem(corruptedItem);
        corruptedItem.setItem(item);
        entitymanager.persist(item);

        //selecting and find records
        List<CorruptedItem> allCorruptedItem = entitymanager.createQuery("from CorruptedItem ", CorruptedItem.class).getResultList();
        allCorruptedItem.stream().forEach(s -> System.out.println(s));



        //updating record
        allCorruptedItem.get(0).setReasons("Broken Glass");



       // deleting the item object
       //entitymanager.remove(item);
    }


}