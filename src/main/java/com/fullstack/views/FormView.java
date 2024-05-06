package com.fullstack.views;

import com.fullstack.backend.entities.Gender;
import com.fullstack.backend.entities.University;
import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.Key;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.button.ButtonVariant;
import com.vaadin.flow.component.combobox.ComboBox;
import com.vaadin.flow.component.formlayout.FormLayout;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.textfield.EmailField;
import com.vaadin.flow.component.textfield.TextField;

import java.util.List;

public class FormView extends FormLayout {

    TextField firstname = new TextField("First Name");
    TextField lastname = new TextField("Last Name");
    EmailField email = new EmailField("Email");
    ComboBox<University> university = new ComboBox<>("University");
    ComboBox<Gender> gender = new ComboBox<>("Gender");

    Button save = new Button("Save");
    Button close = new Button("Close");
    Button update = new Button("Update");

    public FormView(List<University> universities) {

        addClassName("form");

        university.setItems(universities);
        university.setItemLabelGenerator(University::getName);

        gender.setItems(Gender.FEMALE,Gender.MALE,Gender.OTHER);

        add(firstname,lastname,email,university,gender,buttons());
    }

    private Component buttons() {

        save.addThemeVariants(ButtonVariant.LUMO_TERTIARY);
        update.addThemeVariants(ButtonVariant.LUMO_SUCCESS);
        close.addThemeVariants(ButtonVariant.LUMO_ERROR);


        save.addClickShortcut(Key.ENTER);
        close.addClickShortcut(Key.ESCAPE);

        return new HorizontalLayout(save,update,close);
    }
}
