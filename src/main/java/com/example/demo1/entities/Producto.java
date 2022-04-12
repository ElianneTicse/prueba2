package com.example.demo1.entities;

public class Producto {

    private int idProd;
    private String nombreP;

    public int getIdProd() {
        return idProd;
    }

    public void setIdProd(int idProd) {
        this.idProd = idProd;
    }

    public String getNombreP() {
        return nombreP;
    }

    public void setNombreP(String nombreP) {
        this.nombreP = nombreP;
    }

    public Producto(int idProd, String nombreP) {
        this.idProd = idProd;
        this.nombreP = nombreP;
    }

}
