package com.example.URLshortner.Repository;


import com.example.URLshortner.Data.Entity.Url;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class UrlRepository {

    @Autowired
    @PersistenceContext
    private EntityManager entityManager;

    public void createUrl(Url url) {
        entityManager.merge(url);
    }

    public Url getByKey(String key) {
        return entityManager.find(Url.class, key);
    }

    public void deleteUrl(Url url) {
        entityManager.remove(url);
    }

}
