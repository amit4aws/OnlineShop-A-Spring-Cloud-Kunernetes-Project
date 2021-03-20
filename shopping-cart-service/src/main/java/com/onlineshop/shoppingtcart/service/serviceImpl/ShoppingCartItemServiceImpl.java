package com.onlineshop.shoppingtcart.service.serviceImpl;

import java.util.List;

import com.onlineshop.shoppingtcart.entity.Item;
import com.onlineshop.shoppingtcart.entity.ShoppingCart;
import com.onlineshop.shoppingtcart.proxy.ItemServiceProxy;
import com.onlineshop.shoppingtcart.service.ShoppingCartItemService;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;


@Service
public class ShoppingCartItemServiceImpl implements ShoppingCartItemService{

    @Autowired
	private ItemServiceProxy proxy;

    private org.slf4j.Logger logger=LoggerFactory.getLogger(this.getClass());

    @Override
    public ShoppingCart getShoppingCartState() {

        ShoppingCart shoppingcartObj =null;
        logger.info("ShoppingCart :: getShoppingCartState");
        try{

            List<Item> itemlist = proxy.getAllItemsOnCart();
            
            if(itemlist!=null){
                logger.info("itemlist :: itemlist.size("+itemlist.size()+")");
                shoppingcartObj = new ShoppingCart();  

            shoppingcartObj.setItemlist(itemlist);
            shoppingcartObj.setItemcount(itemlist.size());
            double totalamount=0.0;
            for(Item item:itemlist){
                totalamount =+ item.getPrice();
    
            }
            shoppingcartObj.setCartamount(totalamount);
        }

        }catch(Exception excep){

            logger.debug("ShoppingCart :: getShoppingCartState::Exception Occured "+excep.getMessage());
        }
     
        return shoppingcartObj;
    }


    
}
