package com.experts.core.biller.statemachine.api.transitions;

import org.springframework.statemachine.annotation.OnStateMachineStart;
import org.springframework.statemachine.annotation.OnStateMachineStop;
import org.springframework.statemachine.annotation.WithStateMachine;

@WithStateMachine
public class FSMStartingBean {

    @OnStateMachineStart
    public void onStateMachineStart() {
    }

    @OnStateMachineStop
    public void onStateMachineStop() {
    }
}