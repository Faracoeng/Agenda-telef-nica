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
        this.nome = n;
        this.sobrenome = s;
        this.dataNasc = dn;
        this.telefones = new Telefone();
        this.emails = new Email();
    }

    public boolean addTelefone(String r, String n){
        return this.telefones.add(r, n);
    }

    public boolean addEmail(String r, String e){
        return this.emails.add(r, e);
    }

    public boolean removeTelefone(String r){
        return this.telefones.remover(r);
    }

    public boolean removeEmail(String r){
        return this.emails.remove(r);
    }

    public boolean updateTelefone(String r, String n){
        return this.telefones.update(r, n);
    }

    public boolean updateEmail(String r, String e){

        return this.emails.update(r, e);
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
}
