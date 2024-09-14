package com.example.exjpa;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ItemRun {

    @PersistenceContext
    private EntityManager entityManager;

    @Transactional
    public void sample() {
        // Save new records with different values
        saveNewItem("Nintendo Switch", "Gaming Console", 299.99);
        saveNewItem("Xbox Series X", "Gaming Console", 499.99);
        saveNewItem("The Last of Us Part II", "Game", 39.99);
    }

    private void saveNewItem(String name, String catalog, double price) {
        Item item = new Item();
        item.setName(name);
        item.setCatalog(catalog);
        item.setPrice(price);
        entityManager.persist(item);
    }

    @Transactional
    public void findAndUpdateItems() {
        // Selecting and finding records
        List<Item> allItems = entityManager.createQuery("from Item", Item.class).getResultList();
        allItems.forEach(System.out::println);

        // Updating record
        if (allItems.size() > 1) {
            allItems.get(1).setName("Xbox One");
        }
    }
}


//        delete specific record
//        em.remove(allItem.get(0));
//
//        // delete all records
//        for (Item item : allItem) {
//            em.remove(item);
//
//        }




