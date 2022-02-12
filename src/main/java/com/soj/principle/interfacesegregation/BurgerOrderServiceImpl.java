package com.soj.principle.interfacesegregation;

import com.soj.principle.interfacesegregation.service.BurgerOrderService;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class BurgerOrderServiceImpl implements BurgerOrderService {
    static final Logger logger = LogManager.getLogger(BurgerOrderServiceImpl.class.getName());


    @Override
    public int orderBurger(int quantity) {
        logger.log(Level.DEBUG,"Received order of {} burgers .",quantity);
    return quantity;
    }




}
