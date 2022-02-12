package com.soj.principle.interfacesegregation;

import com.soj.principle.interfacesegregation.service.ComboOrderService;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ComboOrderServiceImpl implements ComboOrderService {
    static final Logger logger = LogManager.getLogger(ComboOrderServiceImpl.class.getName());

    @Override
    public void orderCombo(int quantity, int fries) {

            logger.log(Level.DEBUG,"Received order of both {} burgers and {} fries in combo  .",quantity,fries);

    }
}
