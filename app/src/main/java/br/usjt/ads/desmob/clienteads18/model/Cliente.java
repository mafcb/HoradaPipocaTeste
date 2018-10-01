package br.usjt.ads.desmob.clienteads18.model;

import java.io.Serializable;

public class Cliente implements Serializable {

    private int id;
    private String nome, email, diretor, data, genero, sinopse, pop, bilheteria;


    public Cliente(int id, String nome, String email, String diretor, String data, String genero, String sinopse, String pop, String bilheteria) {

        this.id = id;
        this.nome = nome;
        this.email = email;
        this.diretor = diretor;
        this.data = data;
        this.genero = genero;
        this.sinopse = sinopse;
        this.pop = pop;
        this.bilheteria = bilheteria;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDiretor(){
        return diretor;}

    public void setDiretor(String diretor) {
        this.diretor = diretor;}

    public String getData(){
        return data;}

    public void setdata(String data) {
        this.data = data;}

    public String getGenero(){
        return genero;
    }

    private void setGenero(String genero){
        this.genero = genero;
    }

    public String getPop(){
        return pop;
    }

    private void setPop(String pop){
        this.pop = pop;
    }

    public String getSinopse() {
        return sinopse;
    }

    public void setSinopse(String sinopse) {
        this.sinopse = sinopse;
    }

    public String getBilheteria() {
        return bilheteria;
    }

    public void setBilheteria(String bilheteria) {
        this.bilheteria = bilheteria;
    }

    public String getFigura(){

        String figura = email.replace('@', '_');
        return figura.replace('.', '_');

    }


    @Override
    public String toString() {
        return "Cliente{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", diretor='" + diretor + '\'' +
                ", data='" + data + '\'' +
                ", genero='" + genero + '\'' +
                ", sinopse='" + sinopse + '\'' +
                ", pop='" + pop + '\'' +
                ", bilheteria='" + bilheteria + '\'' +
                '}';
    }
}