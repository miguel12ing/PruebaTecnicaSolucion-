package com.avaldigitallabs.devops_pipeline_qa_example.question;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static com.avaldigitallabs.devops_pipeline_qa_example.ui.CompleteFormPage.BTN_BOOK_APPOINTMENT;
import static com.avaldigitallabs.devops_pipeline_qa_example.ui.CompleteFormPage.BTN_GO_TO_HOMEPAGE;
import static com.ibm.icu.impl.ValidIdentifiers.Datatype.x;

public class ValideElementQuestion implements Question<Boolean> {
    @Override
    public Boolean answeredBy(Actor actor) {
        if (BTN_GO_TO_HOMEPAGE.isVisibleFor(actor)) {
            return true;
        } else {
            return false;
        }
    }
    public static Question<Boolean> elementVisible() {
        return new ValideElementQuestion();
    }
}
