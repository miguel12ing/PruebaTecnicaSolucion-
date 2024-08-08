package com.avaldigitallabs.devops_pipeline_qa_example.interactions;

import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.targets.Target;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class FilterELementList implements Interaction {

    Target searchedOpcion;
    String center;

    public FilterELementList(Target searchedOpcion, String center) {
        this.searchedOpcion = searchedOpcion;
        this.center = center;
    }

    public static FilterELementList withTarget (Target searchedCountry, String country){
        return instrumented (FilterELementList.class,searchedCountry, country);
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
            WaitUntil.the(searchedOpcion, WebElementStateMatchers.isCurrentlyVisible())
                .forNoMoreThan(10).seconds()
        );

        WebElementFacade ElementCountry = searchedOpcion.resolveAllFor(actor)
            .stream()
                .filter(element -> element.getText().contains(center))
                .findFirst()
                .get();

        actor.attemptsTo(
                Click.on(ElementCountry)
        );

        }

    }

