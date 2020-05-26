/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.vista;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;

/**
 *
 * @author NANCY
 */
public class MiTelefono extends Frame {
    
    public MiTelefono()
    {
        this.setTitle("Agenda telefonica");
        this.setSize(500, 300);
        this.setLocation(10,10);
        
        BorderLayout border= new BorderLayout();
        GridLayout grid= new GridLayout(5,1);
        
        Panel panelPrincipal= new Panel(border);
        Panel panelCentral= new Panel(grid);
        
        Button boton1 = new Button("Registrar Telefono");
        Button boton2 = new Button("Modificar Telefono");
        Button boton3 = new Button("Eliminar Telefono");
        Button boton4 = new Button("Buscar Telefono");
        Button boton5 = new Button("Listar sus Telefonos");
        Button boton6 = new Button("Salir");
        
        panelCentral.add(boton1);
        panelCentral.add(boton2);
        panelCentral.add(boton3);
        panelCentral.add(boton4);
        panelCentral.add(boton5);
        
        panelPrincipal.add(new Label("Bienvenido Usuario", Label.CENTER), BorderLayout.NORTH);
        panelPrincipal.add(panelCentral, BorderLayout.CENTER);
        panelPrincipal.add(boton6, BorderLayout.SOUTH);
        
        
        this.add(panelPrincipal);
        
        this.setVisible(true);
    }
}
