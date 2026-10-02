package com.mateo.freetpv.util;

import javafx.geometry.Rectangle2D;
import javafx.stage.Screen;
import javafx.stage.Stage;

public final class VentanaUtil {

    private static final double ANCHO_MINIMO = 960;
    private static final double ALTO_MINIMO = 600;
    private static final double ANCHO_INICIAL = 1280;
    private static final double ALTO_INICIAL = 720;

    private VentanaUtil() {
    }

    public static void configurarVentanaPrincipal(Stage stage) {
        Rectangle2D pantalla = Screen.getPrimary().getVisualBounds();

        stage.setResizable(true);
        stage.setMinWidth(Math.min(ANCHO_MINIMO, pantalla.getWidth()));
        stage.setMinHeight(Math.min(ALTO_MINIMO, pantalla.getHeight()));
        stage.setWidth(Math.min(ANCHO_INICIAL, pantalla.getWidth()));
        stage.setHeight(Math.min(ALTO_INICIAL, pantalla.getHeight()));
        stage.centerOnScreen();
    }
}
