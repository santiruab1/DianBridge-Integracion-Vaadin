package com.example.antlersrenderer.views;

import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.html.H2;
import com.vaadin.flow.component.html.Paragraph;
import com.vaadin.flow.component.html.UnorderedList;
import com.vaadin.flow.component.html.ListItem;
import com.vaadin.flow.component.html.Paragraph;

@Route("about-us") // Define la ruta de la vista
@JsModule("./aboutus.html") // Importa el archivo HTML correspondiente
public class AboutUsView extends Div {

    public AboutUsView() {
        setId("about-us-view"); // Opcional: establece un ID para la vista

        VerticalLayout layout = new VerticalLayout();
        layout.setPadding(true);
        layout.setSpacing(true);

        H1 title = new H1("DIANBridge");
        Paragraph subtitle = new Paragraph("Tu mejor aliado para la gestión contable");

        H2 missionHeader = new H2("Misión");
        Paragraph missionText = new Paragraph("La misión de DIANBridge es simplificar y automatizar el proceso de integración de facturas electrónicas de la DIAN al sistema contable, facilitando a las empresas la gestión contable eficiente, segura y sin errores. Buscamos proporcionar una herramienta intuitiva y confiable que optimice el manejo de la información financiera, reduciendo la carga administrativa y mejorando la productividad de nuestros clientes.");

        H2 visionHeader = new H2("Visión");
        Paragraph visionText = new Paragraph("En el 2028, DIANBridge se consolidará como la solución líder en la automatización de la integración de facturas electrónicas para empresas en Colombia, expandiendo su impacto a nivel latinoamericano. Seremos reconocidos por nuestra excelencia en el desarrollo de tecnologías innovadoras que mejoran la eficiencia de los procesos contables y fomentan una cultura de transparencia y cumplimiento fiscal.");

        H2 valuesHeader = new H2("Valores Empresariales");
        UnorderedList valuesList = new UnorderedList();
        valuesList.add(new ListItem("Innovación: Impulsamos la innovación constante para ofrecer soluciones modernas que cubran las necesidades de nuestros clientes."));
        valuesList.add(new ListItem("Transparencia: Fomentamos la transparencia tanto en nuestros procesos como en la gestión de la información contable, asegurando claridad y confianza para nuestros usuarios."));
        valuesList.add(new ListItem("Compromiso con el Cliente: Nuestro objetivo es ofrecer un servicio que realmente agregue valor, siempre respondiendo de manera ágil y efectiva a las necesidades de nuestros clientes."));
        valuesList.add(new ListItem("Seguridad: Valoramos la seguridad de los datos y la privacidad de nuestros usuarios, cumpliendo con las mejores prácticas de protección de información."));
        valuesList.add(new ListItem("Excelencia: Nos esforzamos por lograr la excelencia en cada etapa del desarrollo y servicio, asegurando la máxima calidad en cada solución que entregamos."));

        layout.add(title, subtitle, missionHeader, missionText, visionHeader, visionText, valuesHeader, valuesList);
        add(layout);

        Paragraph paragraph = new Paragraph("Texto de ejemplo");
        add(paragraph);
    }
}