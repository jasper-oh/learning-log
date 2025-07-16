package com.jasperlab.demo.adapter.in.web;

import com.jasperlab.demo.application.domain.model.Item;
import com.jasperlab.demo.application.port.in.RefrigeratorUseCase;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/refrigerator")
@AllArgsConstructor
public class RefrigeratorController {

    private final RefrigeratorUseCase refrigerator;

    @PostMapping("/item")
    public void putItem(@RequestBody Item item){
        refrigerator.putItem(item);
    }

    @GetMapping("/item")
    public List<Item> getItem(@RequestParam String name) {
        return refrigerator.getItem(name);
    }

    @DeleteMapping("/items")
    public void removeAll() {
        refrigerator.removeAll();
    }


}
