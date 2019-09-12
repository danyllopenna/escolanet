/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.danyllopenna.dominio;

/**
 *
 * @author danyl
 */
public class Aluno {
    private String nome,sobrenome;
    private int matricula, id_aluno;

    public Aluno() {
    }

    public Aluno(String nome, String sobrenome, int matricula, int id_aluno) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.matricula = matricula;
        this.id_aluno = id_aluno;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public int getId_aluno() {
        return id_aluno;
    }

    public void setId_aluno(int id_aluno) {
        this.id_aluno = id_aluno;
    }
    
    
}
