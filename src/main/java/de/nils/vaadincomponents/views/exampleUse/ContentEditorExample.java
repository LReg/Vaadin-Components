package de.nils.vaadincomponents.views.exampleUse;

import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import de.nils.vaadincomponents.components.ContentEditor.ContentEditor;
import de.nils.vaadincomponents.views.main.MainView;

@PageTitle("Content Editor")
@Route(value = "/contenteditor", layout = MainView.class)
public class ContentEditorExample extends VerticalLayout {
    public ContentEditorExample(){
        this.setMinHeight("100%");
        this.getStyle().set("background-color", "#d6d6d6");
        this.setAlignItems(Alignment.CENTER);
        ContentEditor ce = new ContentEditor();
        Div placeholder = new Div();
        placeholder.setHeight("10px");
        add(placeholder, ce);
    }
}
