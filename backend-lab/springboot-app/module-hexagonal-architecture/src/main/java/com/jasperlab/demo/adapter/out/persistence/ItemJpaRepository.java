package com.jasperlab.demo.adapter.out.persistence;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ItemJpaRepository extends JpaRepository<ItemJpaEntity, String> {
    List<ItemJpaEntity> findByName(String name);
}
