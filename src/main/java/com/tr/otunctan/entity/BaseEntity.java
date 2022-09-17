package com.tr.otunctan.entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import java.io.Serializable;

@MappedSuperclass
public abstract class BaseEntity<ID extends Number> implements Serializable {


    @Id
    @GeneratedValue(generator = "idGenerator", strategy = GenerationType.IDENTITY)
    private ID id;


    public BaseEntity(ID id) {
        this.id = id;
    }

    public ID getId() {
        return id;
    }

    public void setId(ID id) {
        this.id = id;
    }


}
