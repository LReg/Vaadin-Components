package de.nils.vaadincomponents.views.exampleUse;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.Anchor;
import com.vaadin.flow.component.icon.Icon;
import com.vaadin.flow.component.icon.VaadinIcon;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.server.StreamResource;
import com.vaadin.flow.server.frontend.installer.DefaultFileDownloader;
import de.nils.vaadincomponents.components.Card;
import de.nils.vaadincomponents.views.main.MainView;

import javax.xml.transform.stream.StreamSource;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.zip.ZipOutputStream;

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
