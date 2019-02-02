package com.experts.core.biller.statemachine.api;

import org.sitemesh.builder.SiteMeshFilterBuilder;
import org.sitemesh.config.ConfigurableSiteMeshFilter;

public class BillerCoreSiteMeshFilter extends ConfigurableSiteMeshFilter {

    @Override
    protected void applyCustomConfiguration(SiteMeshFilterBuilder builder) {
        builder.setMimeTypes("text/html", "application/xhtml+xml", "application/vnd.wap.xhtml+xml");
    }

}