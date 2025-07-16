package com.jasperlab.demo.adapter.out.persistence;

import com.jasperlab.demo.application.domain.model.Item;
import com.jasperlab.demo.application.port.out.ItemPort;
import com.jasperlab.demo.common.validation.PersistenceAdapter;
import lombok.RequiredArgsConstructor;

import java.util.List;

@PersistenceAdapter
@RequiredArgsConstructor
public class ItemPersistenceAdapter implements ItemPort {

    private final ItemJpaRepository itemJpaRepository;
    private final ItemMapper itemMapper;

    @Override
    public void save(Item item) {
        itemJpaRepository.save(itemMapper.toEntity(item));
    }

    @Override
    public List<Item> findByName(String name) {
        return itemJpaRepository.findByName(name)
                .stream()
                .map(itemMapper::toDomain)
                .toList();
    }

    @Override
    public void clear() {
        itemJpaRepository.deleteAll();
    }
}
