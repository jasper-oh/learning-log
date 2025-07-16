package com.jasperlab.demo.adapter.out.persistence;

import com.jasperlab.demo.application.domain.model.Item;
import org.springframework.stereotype.Component;

@Component
public class ItemMapper {
    public Item toDomain(ItemJpaEntity entity) {
        if (entity == null) {
            return null;
        }
        return new Item(entity.getName());
    }

    public ItemJpaEntity toEntity(Item domain) {
        if (domain == null) {
            return null;
        }
        return new ItemJpaEntity(domain.getName());
    }


}
