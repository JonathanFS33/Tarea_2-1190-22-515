package com.prototype;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Jonathan
 */
public class ProtoTypeBus {
    public static void main(String[] args){
        List<Bus> listaBuses = new ArrayList<>();
        
        Bus bus = new Bus("Urbano", 40, "Hyundai", 4.99, new Piloto("Juan",10,45));
        listaBuses.add(bus);
        
        Bus clon1 = (Bus)bus.crearClon();
        Bus clon2 = (Bus)bus.crearClon();
        
        clon1.setMarca("Volvo");
        clon1.setMaxPasajeros(55);
        clon1.setTipo("Escolar");
        clon1.setPrecioPasaje(5.99);
        clon1.getPiloto().setNombre("Pedro");
        listaBuses.add(clon1);
        
        clon2.setMaxPasajeros(60);
        clon2.getPiloto().setNombre("Eduardo");
        listaBuses.add(clon2);
        
        compararClon(clon1, clon2);
        
        listaBuses.forEach((buses) -> {
        System.out.println(buses);
    });
        
    }
    public static boolean compararClon(Object objeto1, Object objeto2) {
        boolean res = false;
        
        if(!(objeto1.equals(objeto2))){
            System.out.println("FELICIDADES, OBJETO: " + objeto1 + "\nES DISTINTO DE: " + objeto2+"\n");
            res = true;
        } else{
            System.out.println("Por desgracia, se trata del mismo objeto");
            res = false;
        }
        
        return res;
    }
}
