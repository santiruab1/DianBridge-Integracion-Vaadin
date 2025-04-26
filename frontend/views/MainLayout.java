package com.example.antlersrenderer.views;

import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.html.Nav;
import com.vaadin.flow.component.html.Anchor;
import com.vaadin.flow.router.RouterLayout;

public class MainLayout extends Div implements RouterLayout {
    public MainLayout() {
        Nav nav = new Nav();
        nav.add(new Anchor("login", "Login"));
        nav.add(new Anchor("dashboard", "Dashboard"));
        nav.add(new Anchor("pricing", "Pricing"));
        nav.add(new Anchor("about-us", "About Us"));

        add(nav);
    }
}
