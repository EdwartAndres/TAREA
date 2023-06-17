package com.example.EjercicioArraylistSpring.controller;
import com.example.EjercicioArraylistSpring.entity.Estudiante;
import com.example.EjercicioArraylistSpring.services.EstudianteServicio;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;



import java.util.List;
@RequestMapping("/comidas")
@RestController
@CrossOrigin(origins = "*")

public class controlador {
    private EstudianteServicio services;

    public controlador(EstudianteServicio services) {
        this.services = services;
    }
    @GetMapping("/estudiantes/curso/{curso}")
    public ResponseEntity<List<Estudiante>> buscarEstudiantesPorCurso(@PathVariable String curso) {
        List<Estudiante> estudiantesPorCurso = EstudianteServicio.buscarPorCurso(curso);
        if (!estudiantesPorCurso.isEmpty()) {
            return ResponseEntity.ok(estudiantesPorCurso);
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
        }
    }
    @PutMapping("/actualizarcurso/{codigo}")
    public ResponseEntity<String> actualizarCurso(@PathVariable String codigo, @RequestBody Estudiante estudiante) {
        boolean actualizado = EstudianteServicio.actualizarCurso(codigo, estudiante.getCurso());
        if (actualizado) {
            return ResponseEntity.ok("Curso actualizado correctamente");
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("No se pudo actualizar el curso del estudiante");
        }
    }


}

