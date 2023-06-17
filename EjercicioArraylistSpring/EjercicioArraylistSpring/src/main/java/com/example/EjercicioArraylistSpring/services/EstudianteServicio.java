package com.example.EjercicioArraylistSpring.services;
import com.example.EjercicioArraylistSpring.entity.Estudiante;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;
@Service
public class EstudianteServicio {
    private static List<Estudiante> estudiantes = new ArrayList<>();

    public EstudianteServicio() {
        estudiantes.add(new Estudiante("John", "Doe", "001", "sexto", 8.5f, 7.8f, 9.2f));
        estudiantes.add(new Estudiante("Jane", "Smith", "002", "septimo", 7.2f, 8.0f, 6.5f));
        estudiantes.add(new Estudiante("David", "Johnson", "003", "noveno", 9.0f, 8.7f, 9.5f));
        estudiantes.add(new Estudiante("Emily", "Williams", "004", "septimo", 8.2f, 7.5f, 8.9f));
        estudiantes.add(new Estudiante("Michael", "Brown", "005", "once", 9.7f, 9.8f, 9.5f));
        estudiantes.add(new Estudiante("Maria", "Garcia", "006", "sexto", 7.8f, 8.0f, 7.5f));
        estudiantes.add(new Estudiante("Carlos", "Martinez", "007", "septimo", 8.5f, 7.2f, 8.8f));
        estudiantes.add(new Estudiante("Laura", "Lopez", "008", "noveno", 9.2f, 8.9f, 9.7f));
        estudiantes.add(new Estudiante("Pedro", "Rodriguez", "009", "septimo", 7.5f, 8.2f, 7.9f));
        estudiantes.add(new Estudiante("Sofia", "Hernandez", "010", "once", 9.8f, 9.5f, 9.1f));
        estudiantes.add(new Estudiante("Juan", "Gomez", "011", "sexto", 8.0f, 7.5f, 8.7f));
        estudiantes.add(new Estudiante("Ana", "Perez", "012", "septimo", 7.2f, 7.9f, 7.5f));
        estudiantes.add(new Estudiante("Luis", "Torres", "013", "noveno", 9.4f, 9.0f, 9.6f));
        estudiantes.add(new Estudiante("Marta", "Flores", "014", "septimo", 8.8f, 8.5f, 7.2f));
        estudiantes.add(new Estudiante("Roberto", "Sanchez", "015", "once", 9.6f, 9.7f, 9.4f));
        estudiantes.add(new Estudiante("Isabella", "Ramirez", "016", "sexto", 7.9f, 7.8f, 8.1f));
        estudiantes.add(new Estudiante("Daniel", "Ortega", "017", "septimo", 8.2f, 8.6f, 7.5f));
        estudiantes.add(new Estudiante("Valeria", "Castillo", "018", "noveno", 9.3f, 9.1f, 9.8f));
        estudiantes.add(new Estudiante("Alejandro", "Gutierrez", "019", "septimo", 7.5f, 7.2f, 7.9f));
        estudiantes.add(new Estudiante("Camila", "Vargas", "020", "once", 9.9f, 9.8f, 9.7f));
        estudiantes.add(new Estudiante("Hector", "Luna", "021", "sexto", 8.4f, 8.2f, 8.9f));
        estudiantes.add(new Estudiante("Paula", "Mendoza", "022", "septimo", 7.6f, 8.1f, 7.4f));
        estudiantes.add(new Estudiante("Oscar", "Guerrero", "023", "noveno", 9.7f, 9.4f, 9.2f));
        estudiantes.add(new Estudiante("Catalina", "Rojas", "024", "septimo", 8.1f, 7.5f, 8.3f));
    }
    public static boolean actualizarCurso(String codigo, String nuevoCurso) {
        for (Estudiante estudiante : estudiantes) {
            if (estudiante.getCodigo().equals(codigo)) {
                estudiante.setCurso(nuevoCurso);
                return true;
            }
        }
        return false;
    }
    public static List<Estudiante> buscarPorCurso(String curso) {
        List<Estudiante> estudiantesPorCurso = new ArrayList<>();
        for (Estudiante estudiante : estudiantes) {
            if (estudiante.getCurso().equalsIgnoreCase(curso)) {
                estudiantesPorCurso.add(estudiante);
            }
        }
        return estudiantesPorCurso;
    }


}
