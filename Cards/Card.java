package de.nils.vaadincomponents.components.cards;

import com.vaadin.flow.component.dependency.CssImport;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
@CssImport("./components/card.css")
public class Card extends VerticalLayout {
    Class navigationTarget;
    public Card(){
        this.addClassName("card");
        listener();
    }
    private void listener() {
        this.addClickListener(e -> {
            e.getSource().getUI().ifPresent(ui -> {
                if(navigationTarget!=null)
                    ui.navigate(navigationTarget);
            });
        });
    }

    public Class getNavigationTarget() {
        return navigationTarget;
    }

    public Card setNavigationTarget(Class navigationTarget) {
        this.navigationTarget = navigationTarget;
        return this;
    }
}
