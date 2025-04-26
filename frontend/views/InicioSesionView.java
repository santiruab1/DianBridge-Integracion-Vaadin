package com.example.antlersrenderer.views;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.router.RouterLink;
import com.example.antlersrenderer.views.InterfazUsuarioView; // Importa InterfazUsuarioView

@Route("login") // Define la ruta de la vista
@JsModule("./inicioSesion.html") // Importa el archivo HTML correspondiente
public class InicioSesionView extends Div {
    public InicioSesionView() {
        setId("login-view"); // Opcional: establece un ID para la vista
        // Enlaces a otras vistas
        add(new RouterLink("Ir a Precios", PricingView.class));
        add(new RouterLink("Ir a Nosotros", AboutUsView.class));
        add(new RouterLink("Ir a la Interfaz de Usuario", InterfazUsuarioView.class));

        // Botón para iniciar sesión
        Button loginButton = new Button("Iniciar Sesión", event -> {
            getUI().ifPresent(ui -> ui.navigate("dashboard"));
        });
        add(loginButton);
    }
}