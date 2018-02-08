/*
 * ServiceLocator.java
 * Copyright 2018 Stackify
 */
package com.stackify.deployment;

import com.stackify.deployment.http.HttpApiDataService;

import lombok.experimental.UtilityClass;
import lombok.extern.slf4j.Slf4j;

/**
 * ServiceLocator
 * @author Eric Martin
 */
@Slf4j
@UtilityClass
public class ServiceLocator {

    /**
     * Singleton data service instance
     */
    private ApiDataService dataService;
    
    /**
     * @return Data service instance
     */
    public synchronized ApiDataService getApiDataService() {
        log.debug("ServiceLocator.getApiDataService()");
        
        if (dataService == null) {
            dataService = new HttpApiDataService();
        }
        
        return dataService;        
    }
}
