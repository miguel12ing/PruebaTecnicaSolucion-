package com.avaldigitallabs.devops_pipeline_qa_example.ui;

import net.serenitybdd.screenplay.targets.Target;

public class CompleteFormPage {
    public CompleteFormPage() { }

    public static Target BTN_MAKE_APPOINTMENT = Target.the("BTN para Crear cita")
        .locatedBy("#btn-make-appointment");

    public static Target LABEL_LOGIN = Target.the("BTN Vaidar Label")
        .locatedBy("//h2[normalize-space()='Login']");

    public static Target INPUT_USERNAME = Target.the("input para ingresar usuario")
        .locatedBy("//input[@id='txt-username']");

    public static Target INPUT_PASSWORD = Target.the("input para ingresar contraseña")
        .locatedBy("//input[@id='txt-password']");

    public static Target BTN_LOGIN = Target.the("BTN para hacer login")
        .locatedBy("#btn-login");

    public static Target LABEL_MAKE_APPOINTMENT = Target.the("BTN para Crear orden")
        .locatedBy("//h2[normalize-space()='Make Appointment']");

    public static Target SELECT_FACILITY = Target.the("BTN para Seleccionar centro ")
        .locatedBy("//select[@id='combo_facility']");

    public static Target SELECT_CAMBO_FACILITY = Target.the("List para Seleccionar centro ")
        .locatedBy("//select[@id='combo_facility']//option");

    public static Target CHECK_HOSPOTAL_REMISSION = Target.the("check si necesita remision")
        .locatedBy("#chk_hospotal_readmission");

    public static Target RADIO_PROGRAM_MEDICAID = Target.the("check para seleccionar programa medicaid ")
        .locatedBy("#radio_program_medicaid");

    public static Target RADIO_PROGRAM_NONE = Target.the("check para seleccionar programa none ")
        .locatedBy("#radio_program_none");

    public static Target INPUT_VISIT_DATE = Target.the("input para ingresar comentario")
        .locatedBy("#txt_visit_date");
    public static Target SELECT_DATE = Target.the("input para ingresar fecha de visita")
            .locatedBy("//td[normalize-space()='{0}']");

    public static Target INPUT_COMENT = Target.the("input para ingresar comentario")
        .locatedBy("//textarea[@id='txt_comment']");

    public static Target BTN_BOOK_APPOINTMENT = Target.the("input para ingresar comentario")
        .locatedBy("#btn-book-appointment");

    public static Target BTN_GO_TO_HOMEPAGE = Target.the("input para ingresar comentario")
        .locatedBy("//a[normalize-space()='Go to Homepage']");
}
