package com.experts.core.biller.statemachine.api;

import com.deliveredtechnologies.rulebook.model.RuleBook;
import com.deliveredtechnologies.rulebook.model.runner.RuleBookRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfigRuleBooks {
    @Bean
    public RuleBook ruleBook() {
        RuleBook ruleBook = new RuleBookRunner("com.experts.core.biller.statemachine.api.rules");
        return ruleBook;
    }
}