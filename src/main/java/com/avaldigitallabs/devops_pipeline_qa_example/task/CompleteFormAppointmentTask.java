package com.avaldigitallabs.devops_pipeline_qa_example.task;

import com.avaldigitallabs.devops_pipeline_qa_example.interactions.FilterELementList;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static com.avaldigitallabs.devops_pipeline_qa_example.ui.CompleteFormPage.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class CompleteFormAppointmentTask implements Task {

    String facility;
    String visitDate;
    String comment;

    public CompleteFormAppointmentTask(String facility, String visitDate, String comment) {
        this.facility = facility;
        this.visitDate = visitDate;
        this.comment = comment;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        switch (facility) {
            case "Tokyo CURA Healthcare Center":
                actor.attemptsTo(
                    Click.on(SELECT_FACILITY),
                    FilterELementList.withTarget(SELECT_CAMBO_FACILITY, facility),
                    Click.on(CHECK_HOSPOTAL_REMISSION),
                    Click.on(INPUT_VISIT_DATE),
                    Click.on(SELECT_DATE.of(visitDate)),
                    Enter.theValue(comment).into(INPUT_COMENT),
                    Click.on(BTN_BOOK_APPOINTMENT)
                );
                break;
            case "Hongkong CURA Healthcare Center":
                actor.attemptsTo(
                    Click.on(SELECT_FACILITY),
                    FilterELementList.withTarget(SELECT_CAMBO_FACILITY, facility),
                    Click.on(RADIO_PROGRAM_MEDICAID),
                    Click.on(INPUT_VISIT_DATE),
                    Click.on(SELECT_DATE.of(visitDate)),
                    Click.on(BTN_BOOK_APPOINTMENT)
                );
                break;
          
            case "Seoul CURA Healthcare Center":
                actor.attemptsTo(
                     Click.on(SELECT_FACILITY),
                     FilterELementList.withTarget(SELECT_CAMBO_FACILITY, facility),
                     Click.on(CHECK_HOSPOTAL_REMISSION),
                     Click.on(RADIO_PROGRAM_NONE),
                     Click.on(INPUT_VISIT_DATE),
                     Click.on(SELECT_DATE.of(visitDate)),
                     Enter.theValue(comment).into(INPUT_COMENT),
                     Click.on(BTN_BOOK_APPOINTMENT)
                );
                break;

            default:
                throw new IllegalStateException("Unexpected value: " + facility);
        }
    }
    public static CompleteFormAppointmentTask completeForm(String facility, String visitDate, String comment) {
        return instrumented(CompleteFormAppointmentTask.class,facility, visitDate, comment);
    }
}
