/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio5;

/**
 *
 * @author valer
 */
public class Ejercicio5 {

    public static void main(String[] args) {
        DirectorioTelefonico guia = new DirectorioTelefonico();
        guia.agregarContacto(20002L, new Contacto(42632437,"Valeria","Muñoz","San Luis","Ayacucho 2026"));
        guia.agregarContacto(40004L, new Contacto(36876900,"Florencia","Olguin","Mendoza","Sarmiento 1503"));
        guia.agregarContacto(70007L, new Contacto(40722600,"Estefania","Santander","Córdoba","Belgrano 1320"));
        
        guia.buscarContacto(20002L);
        guia.buscarContacto(40004L);
        guia.buscarContacto(70007L);
        
        guia.buscarTelefono("Santander");
        
        guia.buscarContactos("San Luis");
        
        guia.borrarContacto(70007L);
        
    }
}
