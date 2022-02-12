package com.soj.principle.interfacesegregation;

import com.soj.principle.interfacesegregation.service.FriesOrderService;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class FriesOrderServiceImpl implements FriesOrderService {
    static final Logger logger = LogManager.getLogger(FriesOrderServiceImpl.class.getName());

    @Override
    public int orderFries(int fries) {
        logger.log(Level.DEBUG,"Received order of {} fries .",fries);
        return fries;
    }
}
