package de.nils.vaadincomponents.views.exampleUse;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;
import de.nils.vaadincomponents.components.TopBar;
import de.nils.vaadincomponents.views.main.MainView;

@Route(value="topBar", layout= MainView.class)
public class TopBarExample extends VerticalLayout {
    public TopBarExample(){
        TopBar tb = new TopBar();
        tb.add(new Button("Einstellungen"));

        this.setPadding(false);
        add(tb);
    }
}
