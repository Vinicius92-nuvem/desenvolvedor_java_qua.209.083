package com.models;

public class Pessoa {
  //  atributos
     private String nome;
     private String resultado;
     private double peso;
     private double altura;
     private double imc;


    public Pessoa() {
    }


    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getResultado() {
        return this.resultado;
    }

    public void setResultado(String resultado) {
        this.resultado = resultado;
    }

    public double getPeso() {
        return this.peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return this.altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getImc() {
        return this.imc;
    }

    public void setImc(double imc) {
        this.imc = imc;
}

}
