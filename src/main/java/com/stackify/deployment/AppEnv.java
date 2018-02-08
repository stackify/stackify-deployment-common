/*
 * AppEnv.java
 * Copyright 2018 Stackify
 */
package com.stackify.deployment;

import lombok.Data;

/**
 * AppEnv
 * @author Eric Martin
 */
@Data
public class AppEnv {

    /**
     * Application name
     */
    private String app;

    /**
     * Environment name
     */
    private String env;

}
