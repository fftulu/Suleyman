package com.fft.respository;

import com.fft.domain.Item;
import org.springframework.data.repository.CrudRepository;

public interface ItemRespository extends CrudRepository<Item, Long>
{

}
