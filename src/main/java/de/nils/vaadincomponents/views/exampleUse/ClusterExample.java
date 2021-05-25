package de.nils.vaadincomponents.views.exampleUse;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.NumberField;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import de.nils.vaadincomponents.components.cards.Card;
import de.nils.vaadincomponents.components.cluster.Cluster;
import de.nils.vaadincomponents.views.main.MainView;

@Route(value="cluster", layout= MainView.class)
@PageTitle("Cluster")
public class ClusterExample extends VerticalLayout {

    public ClusterExample(){
        Cluster c = new Cluster();
        c.setWidthFull();
        c.setMaxElements(2);
        c.addRow(new Card(), new Card(), new Card(), new Card());
        c.addRow(new Card(), new Card(), new Card(), new Card());
        c.addRow(new Card(), new Card(), new Card(), new Card());

        NumberField nf = new NumberField();
        nf.setValue(2d);
        nf.setHasControls(true);
        nf.setMin(1);
        nf.setMax(4);

        nf.addValueChangeListener(e -> {
           c.setMaxElements(e.getSource().getValue().intValue());
        });

        add(nf, c);
    }

}
