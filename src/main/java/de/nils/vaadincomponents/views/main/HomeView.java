package de.nils.vaadincomponents.views.main;

import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import de.nils.vaadincomponents.components.cards.TextCard;
import de.nils.vaadincomponents.views.exampleUse.CardExample;
import de.nils.vaadincomponents.views.exampleUse.ContentEditorExample;
import de.nils.vaadincomponents.views.exampleUse.VerticallayoutWithFooterExample;

@PageTitle("Home")
@Route(value = "", layout = MainView.class)
public class HomeView extends VerticalLayout {
    public HomeView(){
        //this
        this.getStyle().set("background-color", "#d6d6d6");

        //title
        H1 title = new H1("Available Components:");
        add(title);

        //Content editor
        TextCard cec = new TextCard();
        cec.setTitle("Content Editor")
                .setDescription("The content editor is an alternative to the 'Rich Text Editor', if you don't have Vaadin Pro.")
                .setNavigationTarget(ContentEditorExample.class);
        add(cec);

        //card
        TextCard cc = new TextCard();
        cc.setTitle("Card").setDescription("This is a card. A Simple way to list up things with a pretty shadow")
        .setNavigationTarget(CardExample.class);
        add(cc);

        //Verticallayout with Footer
        TextCard vlwf = new TextCard();
        vlwf.setTitle("Verticallayout with Footer")
                .setDescription("If you want a Verticallayout to have a footer, this is something to pick up from")
                .setNavigationTarget(VerticallayoutWithFooterExample.class);
        add(vlwf);

    }
}
