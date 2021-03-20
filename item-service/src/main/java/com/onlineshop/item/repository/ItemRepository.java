package com.onlineshop.item.repository;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.onlineshop.item.entity.Item;

import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class ItemRepository {
    private org.slf4j.Logger logger=LoggerFactory.getLogger(this.getClass());
  
    public List<Item> getAll(){

    logger.info("ItemRepository :: getAll");

  return Arrays.asList( 
                new Item(1L,"TV","Samsung 70 inch 4k Ultra HD",4000.00),
                new Item(2L,"AC","Frigidaire Large Room Energy Star",200.10),
                new Item(3L,"Microwave","Hamilton Beach 1.1 Cu. Ft. 1000W Stainless Steel Microwave",100.30),
                new Item(4L,"Refrigerator","Commercial Cool 7.3 Cu. Ft. Refrigerator",400.20),
                new Item(5L,"Washer & Dryer","Equator Advanced Appliances EW 824 N-ED 850 Stackable",1392.06));  
                
    
    }


}
