package com.soj.principle.interfacesegregation;

import com.soj.principle.interfacesegregation.service.BurgerOrderService;
import com.soj.principle.interfacesegregation.service.ComboOrderService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Main {
    static final Logger logger= LogManager.getLogger(Main.class.getName());
    public static void main(String[] args){

        BurgerOrderService burgerOrderService=new BurgerOrderServiceImpl();
        burgerOrderService.orderBurger(5);

        ComboOrderService comboOrderService=new ComboOrderServiceImpl();
        comboOrderService.orderCombo(4,5);

    }

}
