package com.avaldigitallabs.devops_pipeline_qa_example.task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.actions.ScrollTo;
import net.serenitybdd.screenplay.actors.OnStage;

import static com.avaldigitallabs.devops_pipeline_qa_example.ui.CompleteFormPage.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class DoLoginTask implements Task {

    private String username;
    private String password;

    public DoLoginTask(String username, String password) {
        this.username = username;
        this.password = password;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
            Click.on(BTN_MAKE_APPOINTMENT),
            Scroll.to(INPUT_USERNAME),
            Click.on(INPUT_USERNAME),
            Enter.keyValues (username).into(INPUT_USERNAME),
            Click.on(INPUT_PASSWORD),
            Enter.keyValues(password).into(INPUT_PASSWORD),
            Click.on(BTN_LOGIN)
        );

    }

    public static DoLoginTask doLogin(String username, String password) {
        return instrumented(DoLoginTask.class,username, password);
    }
}
