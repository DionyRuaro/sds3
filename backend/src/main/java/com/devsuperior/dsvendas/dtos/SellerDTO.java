package com.devsuperior.dsvendas.dtos;

import com.devsuperior.dsvendas.entities.Sale;
import com.devsuperior.dsvendas.entities.Seller;

import java.io.Serializable;

public class SellerDTO implements Serializable {
    private Long id;
    private String name;

    public SellerDTO(){
    }

    public SellerDTO(Seller seller){
        id = seller.getId();
        name = seller.getName();
    }

    public SellerDTO(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
