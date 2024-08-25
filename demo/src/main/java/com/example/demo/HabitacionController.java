package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class HabitacionController {
    private List<Habitacion> habitaciones = new ArrayList<>();

    public HabitacionController() {
        habitaciones.add(new Habitacion(1, 28, "6.78 m2", 2, 2, "disponible"));
        habitaciones.add(new Habitacion(2, 36, "5.78 m2", 2, 1, "reservada"));
        habitaciones.add(new Habitacion(3, 49, "11.56 m2", 4, 3, "disponible"));
        habitaciones.add(new Habitacion(4, 14, "5.25 m2", 1, 2, "disponible"));
        habitaciones.add(new Habitacion(5, 23, "4.68 m2", 1, 1, "reservada"));
    }

    @GetMapping("/habitaciones")
    public List<Habitacion> GetHabitacion() {
        return habitaciones;
    }

    @GetMapping("/habitaciones/{id}")
    public Habitacion GetHabitacionById(@PathVariable int id) {
        for (Habitacion habitacion : habitaciones) {
            if (habitacion.getId() == id) {
                return habitacion;
            }
        }
        return null;
    }

    @GetMapping("/habitaciones/piso/{piso}")
    public List<Habitacion> getHabitacionByPiso(@PathVariable int piso) {
        List<Habitacion> result = new ArrayList<>();
        for (Habitacion habitacion : habitaciones) {
            if (habitacion.getPiso() == piso) {
                result.add(habitacion);
            }
        }
        return result;
    }

    @GetMapping("/habitaciones/status/{status}")
    public List<Habitacion> getHabitacionByStatus(@PathVariable String status) {
        List<Habitacion> result = new ArrayList<>();
        for (Habitacion habitacion : habitaciones) {
            if (habitacion.getStatus().equals(status)) {
                result.add(habitacion);
            }
        }
        return result;
    }
    
}

