package de.nils.vaadincomponents.components.cards;

import com.vaadin.flow.component.html.H2;
import com.vaadin.flow.component.html.Span;

public class NumberCard{

    public final int NORMAL = 1;
    public final int WARNING = 2;
    public final int GOOD = 4;

    public int type;

    Span title = new Span("-");
    H2 number = new H2("-");
    Span description = new Span("-");


    public NumberCard(){

    }

    
}
