package de.nils.vaadincomponents.components.cluster;

import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import java.util.ArrayList;

public class Cluster extends VerticalLayout {

    //Die Idee ist folgende:
    /*
    Man kann Zeilen einfügen. Eine Zeile spiegelt wieder wie viele elemente maximal in dieser Zeile stehen können. Es gibt maximal 4 Stages.
    Angenommen, man hat in einer Zeile 3 Elemente. Dann sind in den Stages 3&4 diese 3 Elemente. In den Stages darunter, wird die Zeile aber aufgeteilt in Zeilen
    mit weniger Elementen.
     */

    int maxElements = 4;

    ArrayList<Component> components = new ArrayList<>();
    HorizontalLayout hl = createNewHl();
    int elementCount = 0;

    public Cluster(){
        settings();
        build();
    }

    private void settings() {
        this.setWidthFull();
    }

    private void build() {
        this.removeAll();
        for(Component component : components){
            hl.add(component);
            elementCount++;
            if(component instanceof Indicator || elementCount == maxElements){
                add(hl);
                hl = createNewHl();
                elementCount = 0;
            }
        }
    }

    private HorizontalLayout createNewHl(){
        HorizontalLayout hl = new HorizontalLayout();
        hl.setWidthFull();
        hl.setMargin(false);
        return hl;
    }

    public void addRow(Component... components){
        assert(components.length < 5);
        for(Component component : components){
            this.components.add(component);
        }
        this.components.add(new Indicator());
        build();
    }

    public int getMaxElements() {
        return maxElements;
    }

    public void setMaxElements(int maxElements) {
        this.maxElements = maxElements;
        build();
    }
}
