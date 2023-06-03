package com.example.EjercicioArraylistSpring.services;

import com.example.EjercicioArraylistSpring.entity.ComidaRapida;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ComidaRapidaServicio {
    private List<ComidaRapida> comidasRapidas = new ArrayList<>();

    public ComidaRapidaServicio() {
        comidasRapidas.add(new ComidaRapida("Hamburguesa", "001", 10.99, "Deliciosa hamburguesa con carne y vegetales"));
        comidasRapidas.add(new ComidaRapida("Pizza", "002", 8.99, "Sabrosa pizza con diferentes ingredientes"));
        comidasRapidas.add(new ComidaRapida("Hot dog", "003", 4.99, "Clásico hot dog con salchicha y salsas"));
        comidasRapidas.add(new ComidaRapida("Tacos", "004", 6.99, "Deliciosos tacos mexicanos con variedad de rellenos"));
        comidasRapidas.add(new ComidaRapida("Sushi", "005", 12.99, "Rolls de sushi frescos y variados"));
    }


    public List<ComidaRapida> listarComidasRapidas() {
        return comidasRapidas;
    }
    public boolean borrarComidaRapida(String codigo) {
        for (ComidaRapida comida : comidasRapidas) {
            if (comida.getCodigo().equals(codigo)) {
                comidasRapidas.remove(comida);
                return true;
            }
        }
        return false;
    }
    public boolean actualizarComidaRapida(String codigo, ComidaRapida comidaActualizada) {
        for (ComidaRapida comida : comidasRapidas) {
            if (comida.getCodigo().equals(codigo)) {
                comida.setNombre(comidaActualizada.getNombre());
                comida.setPrecio(comidaActualizada.getPrecio());
                comida.setDescripcion(comidaActualizada.getDescripcion());
                return true;
            }
        }
        return false;
    }




    private int ultimoCodigo = 0; // Variable para almacenar el último código generado

    public void agregarComidaRapida(String nombre, double precio, String descripcion) {
        String codigo = generarCodigo(); // Generar el código automáticamente
        ComidaRapida comidaRapida = new ComidaRapida(nombre, codigo, precio, descripcion);
        comidasRapidas.add(comidaRapida);
    }

    private String generarCodigo() {
        ultimoCodigo++; // Incrementar el último código generado
        return String.format("%03d", ultimoCodigo); // Formatear el código como un número de 3 dígitos con ceros a la izquierda
    }

}
