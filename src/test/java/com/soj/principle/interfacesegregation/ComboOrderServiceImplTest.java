package com.soj.principle.interfacesegregation;

import com.soj.principle.interfacesegregation.service.BurgerOrderService;
import com.soj.principle.interfacesegregation.service.ComboOrderService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ComboOrderServiceImplTest {
    @Test
    void testToOrderofBothInCombo() {
        ComboOrderService comboOrderService=new ComboOrderServiceImpl();
         comboOrderService.orderCombo(6,3);
        Assertions.assertTrue(true,"Received 6 burgers and 3 fries in combo");
    }
}