package com.experts.core.biller.statemachine.api;

import com.experts.core.biller.statemachine.api.constants.Events;
import com.experts.core.biller.statemachine.api.constants.States;
import org.springframework.messaging.Message;
import org.springframework.statemachine.StateContext;
import org.springframework.statemachine.StateMachine;
import org.springframework.statemachine.listener.StateMachineListenerAdapter;
import org.springframework.statemachine.state.State;
import org.springframework.statemachine.transition.Transition;

public class StateMachineEventListener
        extends StateMachineListenerAdapter<States, Events> {

    @Override
    public void stateChanged(State<States, Events> from, State<States, Events> to) {
    }

    @Override
    public void stateEntered(State<States, Events> state) {
    }

    @Override
    public void stateExited(State<States, Events> state) {
    }

    @Override
    public void transition(Transition<States, Events> transition) {
    }

    @Override
    public void transitionStarted(Transition<States, Events> transition) {
    }

    @Override
    public void transitionEnded(Transition<States, Events> transition) {
    }

    @Override
    public void stateMachineStarted(StateMachine<States, Events> stateMachine) {
    }

    @Override
    public void stateMachineStopped(StateMachine<States, Events> stateMachine) {
    }

    @Override
    public void eventNotAccepted(Message<Events> event) {
    }

    @Override
    public void extendedStateChanged(Object key, Object value) {
    }

    @Override
    public void stateMachineError(StateMachine<States, Events> stateMachine, Exception exception) {
    }

    @Override
    public void stateContext(StateContext<States, Events> stateContext) {
    }
}
