package com.avaldigitallabs.layer.stepdefinitions;

import com.avaldigitallabs.devops_pipeline_qa_example.question.ValideElementQuestion;
import com.avaldigitallabs.devops_pipeline_qa_example.task.CompleteFormAppointmentTask;
import io.cucumber.java.es.*;

import static com.avaldigitallabs.devops_pipeline_qa_example.commons.Actors.COMMON_ACTOR;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

public class CreateAppointmentStep {

    @Cuando("llene los campos del formulario {string}{string}{string}")
    public void llene_los_campos_del_formulario(String facility, String visitDate, String comment) {
        COMMON_ACTOR.attemptsTo(CompleteFormAppointmentTask.completeForm(facility,visitDate,comment));
    }

    @Entonces("Validar que se guarde informacion")
    public void validar_que_se_guarde_informacion() {
        COMMON_ACTOR.should(seeThat(ValideElementQuestion.elementVisible()));

    }
}
