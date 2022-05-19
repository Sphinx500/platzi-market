package com.platzi.market.persistence;

import com.platzi.market.persistence.crud.ProductoCrudRepository;
import com.platzi.market.persistence.entity.Producto;

import java.util.List;

public class ProductoRepository {

    private ProductoCrudRepository productoCrudRepository;

    //Metodo que recupere los productos
    public List<Producto> getAll(){
        return (List<Producto>) productoCrudRepository.findAll();
    }
}
