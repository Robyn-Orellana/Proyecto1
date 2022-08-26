/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.proyecto1;

import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author robyn
 */
public class Proyecto1 {
    
    public static List<ClsVendedores> al = new ArrayList();
    public static ClsVendedores ven = new ClsVendedores();
    

    public static void main(String[] args) {
        
        calculos();
        
    }
    
    public static void nombres(){
        ven.setNombre("Alonso");
        cantidades();
        al.add(ven);
        ven = new ClsVendedores();
        
        ven.setNombre("Luis");
        cantidades();
        al.add(ven);
        ven = new ClsVendedores();
        
        ven.setNombre("Jonatan");
        cantidades();
        al.add(ven);
        ven = new ClsVendedores();
        
        ven.setNombre("Marcos");
        cantidades();
        al.add(ven);
        ven = new ClsVendedores();
        
        ven.setNombre("Modric");
        al.add(ven);
        cantidades();
        ven = new ClsVendedores();
        
        ven.setNombre("Axl");
        al.add(ven);
        cantidades();
        ven = new ClsVendedores();
        
        ven.setNombre("Messi");
        al.add(ven);
        cantidades();
        ven = new ClsVendedores();
        
        ven.setNombre("Lewan");
        al.add(ven);
        cantidades();
        ven = new ClsVendedores();
        
    }
    
    public static void cantidades(){
        
                double nume = (int)(Math.random()*1000);
                double numf = (int)(Math.random()*1000);
                double numm = (int)(Math.random()*1000);
                double numa = (int)(Math.random()*1000);
                
                ven.setEnero(nume);
                ven.setFebrero(numf);
                ven.setMarzo(numm);
                ven.setAbril(numa);     
        
    }   
    
    public static void calculos(){
        nombres();
        double ene=0.0;
        double feb=0.0;
        double mar=0.0;
        double abr=0.0;
        double tv=0.0;
        double comi=0.0;
        double tvc=0.0;
        double isr=0.0;
        double liq=0.0;
        

         for(ClsVendedores v : al){
             
            ene=ene+ v.getEnero();
            feb=feb+v.getFebrero();
            mar=mar+v.getMarzo();
            abr=abr+v.getAbril();
            
            tv=v.getEnero()+v.getFebrero()+v.getMarzo()+v.getAbril();
            comi=tv*0.25;
            tvc=tv+comi;
            isr=tvc*0.05;
            liq=tvc-isr;
            
            System.out.println("Nombre =\t" + v.getNombre() + "\tEnero "+ v.getEnero() + "\tFebrero "
                    + v.getFebrero() + "\tMarzo "+ v.getMarzo() + "\tAbril " + v.getAbril() +
                    "\tTV " + tv + "\tComi "+ comi + "\tTVC " + tvc + "\tISR " + isr + "\tLIQ " + liq);
            
            }

        System.out.println("TOTAL DE VENTAS: "+ (ene+feb+mar+abr));
        
    }
        
}
