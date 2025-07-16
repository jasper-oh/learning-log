package com.jasperlab.demo.application.domain.service;

import com.jasperlab.demo.application.domain.model.Item;
import com.jasperlab.demo.application.port.in.RefrigeratorUseCase;
import com.jasperlab.demo.application.port.out.ItemPort;

import java.util.List;

public class RefrigeratorService implements RefrigeratorUseCase {

    private final ItemPort itemPort;

    public RefrigeratorService(ItemPort itemPort) {
        this.itemPort = itemPort;
    }

    @Override
    public void putItem(Item item) {
        itemPort.save(item);
    }

    @Override
    public List<Item> getItem(String name) {
        return itemPort.findByName(name);
    }

    @Override
    public void removeAll() {
        itemPort.clear();

    }
}
