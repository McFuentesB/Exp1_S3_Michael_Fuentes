package com.example.demo;

public class Habitacion {
    private int id;
    private int numHabitacion;
    private String m2;
    private int piso;
    private int camas;
    private String status;

    public Habitacion(int id, int numHabitacion, String m2, int piso, int camas, String status) {
        this.id = id;
        this.numHabitacion = numHabitacion;
        this.m2 = m2;
        this.piso = piso;
        this.camas = camas;
        this.status = status;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNumHabitacion() {
        return numHabitacion;
    }

    public void setNumHabitacion(int numHabitacion) {
        this.numHabitacion = numHabitacion;
    }

    public String getM2() {
        return m2;
    }

    public void setM2(String m2) {
        this.m2 = m2;
    }

    public int getPiso() {
        return piso;
    }

    public void setPiso(int piso) {
        this.piso = piso;
    }

    public int getCamas() {
        return camas;
    }

    public void setCamas(int camas) {
        this.camas = camas;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
