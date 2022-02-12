package com.soj.principle.interfacesegregation;

import com.soj.principle.interfacesegregation.service.BurgerOrderService;
import com.soj.principle.interfacesegregation.service.FriesOrderService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FriesOrderServiceImplTest {
    @Test
    void testToOrderFriesOfFries() {
        FriesOrderService friesOrderService=new FriesOrderServiceImpl();
        int actual=friesOrderService.orderFries(4);
        Assertions.assertEquals(4,actual);
    }
}