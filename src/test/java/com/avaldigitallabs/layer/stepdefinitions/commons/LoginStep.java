package com.avaldigitallabs.layer.stepdefinitions.commons;

import com.avaldigitallabs.devops_pipeline_qa_example.task.DoLoginTask;
import io.cucumber.java.es.*;
import net.serenitybdd.screenplay.actions.Open;

import static com.avaldigitallabs.devops_pipeline_qa_example.commons.Actors.COMMON_ACTOR;

public class LoginStep {

    private static final String PAGE_NAME_ACADEMY_BUGS = "pages.CuraHealthcareService";

    @Dado("quiero entrar a la pagina")
    public void quieroEntrarALaPagina() {
        COMMON_ACTOR.attemptsTo(
            Open.browserOn().thePageNamed(PAGE_NAME_ACADEMY_BUGS)
        );
    }

    @Dado("inicar sesion con el user {string} y el password {string}")
    public void inicar_sesion_con_el_user_y_el_password(String user, String password) {
        COMMON_ACTOR.attemptsTo(DoLoginTask.doLogin(user, password));
    }
}
