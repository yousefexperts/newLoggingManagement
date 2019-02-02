package com.experts.core.biller.statemachine.api.persist;

import com.experts.core.biller.statemachine.api.constants.Events;
import com.experts.core.biller.statemachine.api.constants.States;
import org.springframework.statemachine.StateMachineContext;
import org.springframework.statemachine.StateMachinePersist;

import java.util.HashMap;

public class InMemoryStateMachinePersist implements StateMachinePersist<States, Events, String> {

    private final HashMap<String, StateMachineContext<States, Events>> contexts = new HashMap<>();

    @Override
    public void write(StateMachineContext<States, Events> context, String contextObj) throws Exception {
        contexts.put(contextObj, context);
    }

    @Override
    public StateMachineContext<States, Events> read(String contextObj) throws Exception {
        return contexts.get(contextObj);
    }
}
