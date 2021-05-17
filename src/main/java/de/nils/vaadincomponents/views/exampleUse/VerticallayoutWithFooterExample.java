package de.nils.vaadincomponents.views.exampleUse;

import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import de.nils.vaadincomponents.components.Card;
import de.nils.vaadincomponents.components.ContentEditor.ContentEditor;
import de.nils.vaadincomponents.components.VerticalLayoutWithFooter;
import de.nils.vaadincomponents.views.main.MainView;

@PageTitle("Verticallayout with Footer")
@Route(value = "/vlwithfooter", layout= MainView.class)
public class VerticallayoutWithFooterExample extends VerticalLayoutWithFooter {
    public VerticallayoutWithFooterExample() {
        this.getStyle().set("background-color", "#d6d6d6");
        this.setHeightFull();
        Card card = new Card();
        card.setTitle("Content").setDescription("Content").setNavigationTarget(CardExample.class);
        add(card);
    }
}
