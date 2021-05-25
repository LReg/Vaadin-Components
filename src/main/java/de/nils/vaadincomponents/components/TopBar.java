package de.nils.vaadincomponents.components;

import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import java.util.Dictionary;

public class TopBar extends VerticalLayout {

    Div openClose = new Div();
    boolean openByDefault = false;
    boolean open;
    VerticalLayout content = new VerticalLayout();

    public TopBar(){
        settings();
        listener();
    }

    private void listener() {
        openClose.addClickListener(e ->  {
            if(open)
                close();
            else
                open();
        });
    }

    private void close() {
    }

    private void settings() {
        openClose.setWidth("100%");
    }

    private void open(){

    }



}
