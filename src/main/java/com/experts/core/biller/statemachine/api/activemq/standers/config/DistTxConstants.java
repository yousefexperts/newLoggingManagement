package com.experts.core.biller.statemachine.api.activemq.standers.config;

public class DistTxConstants {

    // view resolver
    public static final String VIEW_PREFIX = "/WEB-INF/views/";
    public static final String VIEW_SUFFIX = ".jsp";

    // properties
    public static final String DEV_PROPERTIES_RESOURCE = "/META-INF/dev.properties";
    public static final String TEST_PROPERTIES_RESOURCE = "/META-INF/test.properties";

    public static final String LOCALE_TURKISH = "tr";

    public static final String DEFAULT_BROKER_URL_SERVER0 = "tcp://localhost:61616";
    public static final String DEFAULT_BROKER_URL_SERVER1 = "tcp://localhost:61617";

    public static final String GROUP_ADDRESS = "231.7.7.7";
    public static final int GROUP_PORT = 9876;

    public static final String USERNAME = "admin";
    public static final String PASSWD = "admin";
    public static final String ACCOUNTS_QUEUE = "accounts-queue";

    public static final String UNIQUE_RESOURCE_NAME_DATASOURCE = "xads";
    public static final String UNIQUE_RESOURCE_NAME_MESSAGE_QUEUE = "xamq";

}