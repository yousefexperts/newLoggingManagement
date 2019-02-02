package com.experts.core.biller.statemachine.api.monitor;

import com.experts.core.biller.statemachine.api.constants.Events;
import com.experts.core.biller.statemachine.api.constants.States;
import org.springframework.statemachine.StateMachine;
import org.springframework.statemachine.action.Action;
import org.springframework.statemachine.monitor.AbstractStateMachineMonitor;
import org.springframework.statemachine.transition.Transition;

public class TestStateMachineMonitor extends AbstractStateMachineMonitor<States, Events> {

    @Override
    public void transition(StateMachine<States, Events> stateMachine, Transition<States, Events> transition, long duration) {
    }

    @Override
    public void action(StateMachine<States, Events> stateMachine, Action<States, Events> action, long duration) {
    }
}
