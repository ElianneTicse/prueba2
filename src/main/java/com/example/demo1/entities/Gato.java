package com.example.demo1.entities;

public class Gato {

    private String nGato;
    private String nDuenio;
    private int edadGato;
    private String razaGato;

    public String getnGato() {
        return nGato;
    }

    public void setnGato(String nGato) {
        this.nGato = nGato;
    }

    public String getnDuenio() {
        return nDuenio;
    }

    public void setnDuenio(String nDuenio) {
        this.nDuenio = nDuenio;
    }

    public int getEdadGato() {
        return edadGato;
    }

    public void setEdadGato(int edadGato) {
        this.edadGato = edadGato;
    }

    public String getRazaGato() {
        return razaGato;
    }

    public void setRazaGato(String razaGato) {
        this.razaGato = razaGato;
    }

    public Gato(){
    }

    public Gato(String nGato, String nDuenio, int edadGato, String razaGato) {
        this.nGato = nGato;
        this.nDuenio = nDuenio;
        this.edadGato = edadGato;
        this.razaGato = razaGato;
    }

}
