package com.fullstack.views;

import com.fullstack.backend.entities.Student;
import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.data.value.ValueChangeMode;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;

import java.awt.*;

@PageTitle("Students")
@Route("")
public class ListView extends VerticalLayout {

    Grid<Student> grid = new Grid<>(Student.class);
    TextField searchText = new TextField();
    public ListView() {

        addClassName("list");
        setSizeFull();

        GridConf();
        add(SearchBar(),grid);
    }

    private void GridConf(){

        grid.addClassName("grid");
        grid.setSizeFull();
        grid.setColumns("firstname","lastname","email");
        grid.addColumn(s->s.getUniversity().getName()).setHeader("University");
        grid.addColumn(s->s.getGender().toString()).setHeader("Gender");
        grid.getColumns().forEach(c-> c.setAutoWidth(true));
    }

    private Component SearchBar(){
        searchText.setPlaceholder("Search For Student");
        searchText.setClearButtonVisible(true);
        searchText.setValueChangeMode(ValueChangeMode.LAZY);//don't hit the database with every key wait until the user finish typing

        Button addStudent = new Button("Add Student");

        HorizontalLayout searchBar = new HorizontalLayout(searchText,addStudent);
        searchBar.addClassName("searchBar");

        return searchBar;
    }
}
