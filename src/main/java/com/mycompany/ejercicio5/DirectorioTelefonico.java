/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio5;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/**
 *
 * @author valer
 */
public class DirectorioTelefonico {
    public static TreeMap <Long,Contacto> agenda = new TreeMap<>();
    
    
    
    public boolean agregarContacto(Long telefono, Contacto contacto){
        if(agenda.containsKey(telefono)){
            return false;
        }else{
            agenda.put(telefono, contacto);
            return true;
        }
    }
    
    public Contacto buscarContacto(Long telefono){
        
        
        if(agenda.containsKey(telefono)){
            
            return agenda.get(telefono);   
        }else{
            
            return null;
        }
    }
    
    public Set<Long> buscarTelefono(String apellido){
        Set<Long> telefonos = new HashSet<>();
        
        Iterator<Map.Entry<Long,Contacto>> it = agenda.entrySet().iterator();
        
        while(it.hasNext()){
            Map.Entry<Long, Contacto> entry = it.next();
            if (entry.getValue().getApellido().equalsIgnoreCase(apellido)) {
                telefonos.add(entry.getKey());
            }
        }
        
        return telefonos;
    }
    
    public ArrayList<Contacto> buscarContactos(String ciudad){
        ArrayList<Contacto> listaContactos = new ArrayList<>();
        Iterator<Contacto> it = agenda.values().iterator();
        
        while(it.hasNext()){
            Contacto c = it.next();
            if (c.getCiudad().equalsIgnoreCase(ciudad)) {
                listaContactos.add(c);
            }
        }
        System.out.println(listaContactos);
        return listaContactos;
    }
    
    public void borrarContacto(Long telefono){
        if(agenda.containsKey(telefono)){
            agenda.remove(telefono);
        }
    }
    
    
}
