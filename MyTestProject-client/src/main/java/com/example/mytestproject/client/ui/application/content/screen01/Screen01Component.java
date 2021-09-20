package com.example.mytestproject.client.ui.application.content.screen01;

import com.example.mytestproject.shared.model.MyModel;
import com.github.nalukit.nalu.client.component.AbstractComponent;
import elemental2.dom.HTMLElement;
import java.lang.Override;
import java.util.logging.Logger;

import org.dominokit.domino.ui.button.Button;
import org.dominokit.domino.ui.cards.Card;

public class Screen01Component extends AbstractComponent<IScreen01Component.Controller, HTMLElement> implements IScreen01Component {

    private static final Logger logger = Logger.getLogger(Screen01Component.class.getName());
    private Card card;

    public Screen01Component() {
        super();
    }

    @Override
    public void edit(MyModel model) {
        // That's a good place to move your data out of the model into the widgets.
        //
        // Using GWT 2.x you can use the editor framework and in this case
        // it is a good idea to edit and flush the data inside the presenter.
        card.setTitle(model.getActiveScreen());
    }

    @Override
    public void render() {
        card = Card.create("");

        Button button = Button.create("Submit");
        card.appendChild(button);
        button.addCss("btn-submit");

        // button.setHeight("100px");

        logger.info("height " + button.element().style.height.asString());
        initElement(card.element());
    }
}
