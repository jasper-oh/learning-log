package com.jasperlab.demo.application.port.out;

import com.jasperlab.demo.application.domain.model.Item;

import java.util.List;

public interface ItemPort {
    void save(Item item);
    List<Item> findByName(String name);
    void clear();
}
