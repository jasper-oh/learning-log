package com.jasperlab.demo.application.port.in;

import com.jasperlab.demo.application.domain.model.Item;

import java.util.List;

public interface RefrigeratorUseCase {
    void putItem(Item item);
    List<Item> getItem(String name);
    void removeAll();
}
