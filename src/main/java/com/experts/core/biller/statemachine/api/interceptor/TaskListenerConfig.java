package com.experts.core.biller.statemachine.api.interceptor;

import org.springframework.statemachine.StateContext;
import org.springframework.statemachine.recipes.tasks.TasksHandler;

public class TaskListenerConfig extends TasksHandler.TasksListenerAdapter {

    @Override
    public void onTasksStarted() {
    }

    @Override
    public void onTasksContinue() {
    }

    @Override
    public void onTaskPreExecute(Object id) {
    }

    @Override
    public void onTaskPostExecute(Object id) {
    }

    @Override
    public void onTaskFailed(Object id, Exception exception) {
    }

    @Override
    public void onTaskSuccess(Object id) {
    }

    @Override
    public void onTasksSuccess() {
    }

    @Override
    public void onTasksError() {
    }

    @Override
    public void onTasksAutomaticFix(TasksHandler handler, StateContext<String, String> context) {
    }
}
