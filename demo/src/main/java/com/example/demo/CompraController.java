package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class CompraController {
    private List<Compra>compras=new ArrayList<>();
    
    public CompraController() {
        compras.add(new Compra(1, 123, 789546, "Collar anti-pulgas", "retiro", 
        "Juan", "Perez", "jperez12@gmail.com", 789456213, "calle 12, santiago", 23590, "listo"));
        compras.add(new Compra(2, 456, 789456, "Collar anti-pulgas", "despacho", 
        "Martin", "Diaz", "mdiaz34@gmail.com", 456123789, "pasaje falso 1234, la florida", 15990, "despachado"));
        compras.add(new Compra(3, 789, 456123, "Comida perros 5KG", "retiro", 
        "Maria", "Gonzalez", "mgonzalez45@gmail.com", 123789456, "depto 134, maipu", 30990, "retirado"));
        compras.add(new Compra(4, 456, 123456, "Shampoo Perro Generico", "despacho", 
        "Martin", "Diaz", "mdiaz34@gmail.com", 456123789, "pasaje falso 1234, la florida", 15990, "despachado"));
        compras.add(new Compra(5, 123, 123456, "Shampoo Perro Generico", "retiro", 
        "Juan", "Perez", "jperez12@gmail.com", 789456123, "calle 12, santiago", 23590, "listo"));
        
    }
    @GetMapping("/compras")
    public List<Compra> GetCompra() {
        return compras;
    }
    
    @GetMapping("/compras/id/{id}")
    public Compra GetComprasById(@PathVariable int id) {
        for (Compra compra : compras) {
            if (compra.getId() == id) {
                return compra;
            }
        }
        return null;
    }

    @GetMapping("/compras/numcompra/{numCompra}")
    public List<Compra> GetComprasByNumCompra(@PathVariable int numCompra) {
        List<Compra> result = new ArrayList<>();
        for (Compra compra : compras) {
            if (compra.getNumCompra() == numCompra) {
                result.add(compra);
            }
        }
        return result;
    
    }

    @GetMapping("/compras/status/{status}")
    public List<Compra> getComprasByStatus(@PathVariable String status) {
        List<Compra> result = new ArrayList<>();
        for (Compra compra : compras) {
            if (compra.getStatusCompra().equals(status)) {
                result.add(compra);
            }
        }
        return result;
    }
}
