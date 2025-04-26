package com.example.antlersrenderer.views;

import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.html.IFrame;

@Route("pricing")
@JsModule("./pricing.html")
public class PricingView extends Div {

    public PricingView() {
        setId("pricing-view");
        // Create a layout for the pricing view
        VerticalLayout layout = new VerticalLayout();
        layout.setSizeFull();

        // Add the pricing HTML content
        IFrame pricingFrame = new IFrame("frontend/pricing.html");
        pricingFrame.setWidth("100%");
        pricingFrame.setHeight("100%");
        layout.add(pricingFrame);

        // Add a button for form submission (example)
        Button submitButton = new Button("Submit", event -> {
            Notification.show("Form submitted!");
            // Here you can add form validation logic
        });
        layout.add(submitButton);

        add(layout);
    }
}