package com.experts.core.biller.statemachine.api.transitions;


import com.experts.core.biller.statemachine.api.annotation.StatesOnTransition;
import com.experts.core.biller.statemachine.api.constants.States;
import org.springframework.statemachine.ExtendedState;
import org.springframework.statemachine.annotation.EventHeaders;
import org.springframework.statemachine.annotation.WithStateMachine;

import java.util.Map;

@WithStateMachine(name = "billerCoreEngineFSM")
public class TransitionExecutionBean {

    @StatesOnTransition(source = States.WAITING, target = States.COMPLETED)
    public void init(@EventHeaders Map<String, Object> headers, ExtendedState extendedState) {
    }

}
