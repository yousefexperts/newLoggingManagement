package com.experts.core.biller.statemachine.api.solr.domain;

import lombok.*;
/*import org.apache.solr.client.solrj.beans.Field;*/
import org.apache.solr.client.solrj.beans.Field;
import org.springframework.data.annotation.Id;
import org.springframework.data.solr.core.mapping.SolrDocument;
/*import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;*/
/*import org.springframework.data.solr.core.mapping.SolrDocument;*/

import java.io.Serializable;

@Data
@SolrDocument(solrCoreName = "default" )
public class ElasticRequestDomain implements Serializable {

    @Id
    @Field
    private Long id;

    @Field
    private String ymqTitle;

    @Field
    private String ymqUrl;

    @Field
    private String ymqContent;


}