package com.example.antlersrenderer.views;

import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.html.Paragraph;
import com.vaadin.flow.component.html.Anchor;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.html.Image;

@Route("")
public class IndexView extends VerticalLayout {

    public IndexView() {
        setSizeFull();
        addClassName("index-view");

        // Welcome message
        H1 welcomeTitle = new H1("Bienvenido a DIANBridge");
        Paragraph welcomeText = new Paragraph("Automatizamos la integración entre los sistemas contables y la DIAN.");
        
        // Logo
        Image logo = new Image("frontend/assets/images/LogoBlancoSombra.png", "DIANBridge Logo");
        logo.setWidth("300px");

        // Navigation buttons
        Button aboutUsButton = new Button("Sobre nosotros", e -> getUI().ifPresent(ui -> ui.navigate("aboutus")));
        Button pricingButton = new Button("Precios", e -> getUI().ifPresent(ui -> ui.navigate("pricing")));
        Button loginButton = new Button("Iniciar Sesión", e -> getUI().ifPresent(ui -> ui.navigate("inicioSesion")));

        // Add components to layout
        add(logo, welcomeTitle, welcomeText, aboutUsButton, pricingButton, loginButton);
        
        // Set spacing and alignment
        setAlignItems(Alignment.CENTER);
        setJustifyContentMode(JustifyContentMode.CENTER);
    }
}