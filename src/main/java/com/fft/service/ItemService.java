package com.fft.service;

import com.fft.domain.Item;
import com.fft.domain.ItemAddForm;
import com.fft.respository.ItemRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

public interface ItemService {
    void addItem(ItemAddForm form);
}

@Service
public class ItemServiceImpl implements ItemService {
    private final ItemRespository itemRespository;
    private final UserService userService;

    @Autowired
    public ItemServiceImpl(ItemRespository itemRespository, UserService userService)
    {
        this.itemRespository = itemRespository;
        this.userService = userService;
    }
    public void addItem(ItemAddForm form) {

        for (int i = 0; i< form.getAmount(); i++) {
            String inventoryCode = Long.toHexString(Double.doubleToLongBits(Math.random())).substring(1, 0);
            // generate random string

            Item item = new Item(inventoryCode, form.getItemType());
            itemRespository.save(item);
            System.out.println(itemRespository.findOne(item.getId()));

        }
    }
}

