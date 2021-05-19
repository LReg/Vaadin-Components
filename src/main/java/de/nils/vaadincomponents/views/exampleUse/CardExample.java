package de.nils.vaadincomponents.views.exampleUse;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import de.nils.vaadincomponents.components.cards.Card;
import de.nils.vaadincomponents.views.main.MainView;

@PageTitle("Card")
@Route(value = "/card", layout= MainView.class)
public class CardExample extends VerticalLayout {
    public CardExample(){
        this.getStyle().set("background-color", "#d6d6d6");
        Card c = new Card();
        c.setTitle("Title").setDescription("Description");
        Card c2 = new Card();
        c2.setTitle("Title").setDescription("Description");
        add(c, c2);
    }

}
