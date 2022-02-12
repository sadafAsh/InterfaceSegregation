package com.soj.principle.interfacesegregation;

import com.soj.principle.interfacesegregation.service.BurgerOrderService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BurgerOrderServiceImplTest {

    @Test
    void testToOrderQuantityOfBurger() {
        BurgerOrderService burgerOrderService=new BurgerOrderServiceImpl();
       int actual= burgerOrderService.orderBurger(5);
        Assertions.assertEquals(5,actual);
    }
}