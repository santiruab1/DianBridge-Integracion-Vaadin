package com.example.antlersrenderer.views;

import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.router.Route;

@Route("interfazUsuario") // Define la ruta de la vista
@JsModule("./interfazUsuario.html") // Importa el archivo HTML correspondiente
public class InterfazUsuarioView extends Div {
    public InterfazUsuarioView() {
        setId("interfaz-usuario-view"); // Opcional: establece un ID para la vista
    }
}