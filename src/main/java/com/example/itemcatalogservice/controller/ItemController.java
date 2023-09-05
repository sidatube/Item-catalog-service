package com.example.itemcatalogservice.controller;

import com.example.itemcatalogservice.Item;
import com.example.itemcatalogservice.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/")
public class ItemController {
    @Autowired
    ItemRepository itemRepository;
    @GetMapping("/getAll")
    public List<Item> getAll (){
        return itemRepository.findAll();
    }
    @GetMapping("/find/{id}")
    public Item findById(@PathVariable long id){
        return itemRepository.findById(id).orElse(null);
    }
}
