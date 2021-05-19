package de.nils.vaadincomponents.views.exampleUse;

import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import de.nils.vaadincomponents.components.cards.Card;
import de.nils.vaadincomponents.components.cards.NumberCard;
import de.nils.vaadincomponents.views.main.MainView;

@PageTitle("Card")
@Route(value = "/card", layout= MainView.class)
public class CardExample extends VerticalLayout {
    public CardExample(){
        this.getStyle().set("background-color", "#d6d6d6");
        Card c = new Card();
        c.setTitle("Title").setDescription("Description");
        HorizontalLayout hl = new HorizontalLayout();
        hl.setSpacing(true);
        hl.setMargin(false);
        hl.setPadding(true);
        NumberCard nc = new NumberCard();
        nc.setNumber(265).setNavigationTarget(CardExample.class).setType(nc.WARNING).setTitle("Todesfälle").setDescription("Todesfalle in imaginärem Laden");
        NumberCard nc1 = new NumberCard();
        nc1.setNumber(30).setNavigationTarget(CardExample.class).setType(nc.NORMAL).setTitle("Kunden").setDescription("Kunden im meinem Laden");
        NumberCard nc2 = new NumberCard();
        nc2.setNumber(56).setNavigationTarget(CardExample.class).setType(nc.GOOD).setTitle("Umsatz").setDescription("Umsatz durch Kunden");
        hl.add(nc, nc1, nc2);
        add(c, hl);
    }

}
