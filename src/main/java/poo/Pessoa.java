package poo;

import java.time.LocalDate;

public class Pessoa {
    //Atributos
    private String nome;
    private String sobrenome;
    private LocalDate dataNasc;
    private Telefone telefones;
    private Email emails;

    //Métodos
    public Pessoa(String n,String s,LocalDate dn){
    }

    public boolean addTelefone(String r, String n){
        return true;
    }

    public boolean addEmail(String r, String e){
        return true;
    }

    public boolean removeTelefone(String r){
        return true;
    }

    public boolean removeEmail(String r){
        return true;
    }

    public boolean updateTelefone(String r, String n){
        return true;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", sobrenome='" + sobrenome + '\'' +
                ", dataNasc=" + dataNasc +
                ", telefones=" + telefones +
                ", emails=" + emails +
                '}';
    }

    public boolean updateEmail(String r, String e){
        return true;
    }





}
