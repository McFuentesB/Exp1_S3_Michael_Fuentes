package com.example.demo;

public class Compra {
    private int id;
    private int numCompra;
    private int codProducto;
    private String nombProducto;
    private String tipoEntrega;
    private String nombCliente;
    private String apellidoCliente;
    private String correoCliente;
    private int telefonoCliente;
    private String direccionCliente;
    private int totalCompra;
    private String statusCompra;



    public Compra(int id, int numCompra, int codProducto, String nombProducto, String tipoEntrega,
    String nombCliente,String apellidoCliente,String correoCliente, int telefonoCliente, String direccionCliente,
    int totalCompra, String statusCompra) {
        this.id = id;
        this.numCompra= numCompra;
        this.codProducto=codProducto;
        this.nombProducto=nombProducto;
        this.tipoEntrega=tipoEntrega;
        this.nombCliente=nombCliente;
        this.apellidoCliente=apellidoCliente;
        this.correoCliente=correoCliente;
        this.telefonoCliente=telefonoCliente;
        this.direccionCliente=direccionCliente;
        this.totalCompra=totalCompra;
        this.statusCompra=statusCompra;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNumCompra() {
        return numCompra;
    }

    public void setNumCompra(int numCompra) {
        this.numCompra = numCompra;
    }

    public int getCodProducto() {
        return codProducto;
    }

    public void setCodProducto(int codProducto) {
        this.codProducto = codProducto;
    }

    public String getNombProducto(){
        return nombProducto;
    }

    public void setNombProducto(String nombProducto){
        this.nombProducto=nombProducto;
    }

    public String getTipoEntrega(){
        return tipoEntrega;
    }

    public void setTipoEntrega(String tipoEntrega){
        this.tipoEntrega=tipoEntrega;
    }

    public String getNombCliente(){
        return nombCliente;
    }

    public void setNombCliente(String nombCliente){
        this.nombCliente=nombCliente;
    }

    public String getApellidoCliente(){
        return apellidoCliente;
    }

    public void setApellidoCliente(String apellidoCliente){
        this.apellidoCliente=apellidoCliente;
    }

    public String getCorreoCliente(){
        return correoCliente;
    }

    public void setCorreoCliente(String correoCliente){
        this.correoCliente=correoCliente;
    }

    public int getTelefonoCliente() {
        return telefonoCliente;
    }

    public void setTelefonoCliente(int telefonoCliente) {
        this.telefonoCliente = telefonoCliente;
    }

    public String getDireccionCliente(){
        return direccionCliente;
    }

    public void setDireccionCliente(String direccionCliente){
        this.direccionCliente=direccionCliente;
    }

    public int getTotalCompra() {
        return totalCompra;
    }

    public void setTotalCompra(int totalCompra) {
        this.totalCompra = totalCompra;
    }

    public String getStatusCompra(){
        return statusCompra;
    }

    public void setStatusCompra(String statusCompra){
        this.statusCompra=statusCompra;
    }
}
