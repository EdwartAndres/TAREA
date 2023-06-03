package com.example.EjercicioArraylistSpring.controller;
import com.example.EjercicioArraylistSpring.entity.ComidaRapida;
import com.example.EjercicioArraylistSpring.services.ComidaRapidaServicio;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;



import java.util.List;
@RequestMapping("/comidas")
@RestController
@CrossOrigin(origins = "*")

public class controlador {
    private ComidaRapidaServicio services;

    public controlador(ComidaRapidaServicio services) {
        this.services = services;
    }
    @GetMapping("/listarcomidas")
    public List<ComidaRapida> listarComidasRapidas() {
        return services.listarComidasRapidas();
    }
    @GetMapping("/listarcomidas/{nombre}")
    public String obtenerComidaRapida(@PathVariable String nombre) {
        return "Comida: " + nombre;
    }
    @PostMapping("/agregarcomida")
    public void agregarComidaRapida(@RequestBody ComidaRapida comida) {
        services.agregarComidaRapida(comida.getNombre(), comida.getPrecio(), comida.getDescripcion());
    }
    @DeleteMapping("/borrarcomida/{codigo}")
    public ResponseEntity<String> borrarComidaRapida(@PathVariable String codigo) {
        boolean eliminada = services.borrarComidaRapida(codigo);
        if (eliminada) {
            return ResponseEntity.ok("Comida eliminada correctamente");
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("No se encontró una comida con el código especificado");
        }
    }
    @PutMapping("/actualizarcomida/{codigo}")
    public ResponseEntity<String> actualizarComidaRapida(@PathVariable String codigo, @RequestBody ComidaRapida comida) {
        boolean actualizada = services.actualizarComidaRapida(codigo, comida);
        if (actualizada) {
            return ResponseEntity.ok("Comida actualizada correctamente");
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("No se puedo actualizar");
        }
    }

}

