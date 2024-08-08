package com.avaldigitallabs.layer.stepdefinitions.commons;

import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import net.serenitybdd.core.Serenity;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static com.avaldigitallabs.devops_pipeline_qa_example.commons.Actors.COMMON_ACTOR;
import static com.avaldigitallabs.devops_pipeline_qa_example.data.Constans.SCENARIO;

public class Hooks {

    private static final Logger LOG = LoggerFactory.getLogger(Hooks.class.getSimpleName());
    private static final  String SEPARATOR = "*********************************************";
    private WebDriver driver = Serenity.getDriver();

    @Before
    public void setTheStageWeb(Scenario scenario){
        OnStage.setTheStage(new OnlineCast());
        COMMON_ACTOR.whoCan(BrowseTheWeb.with(driver));
        COMMON_ACTOR.remember(SCENARIO, scenario.getName());
        COMMON_ACTOR.describedAs("Usuario Aplicacion");

        LOG.info(SEPARATOR);
        LOG.info("scenario" + scenario.getName());
        LOG.info("tag: " + scenario.getSourceTagNames());
        LOG.info(SEPARATOR);

    }

}
