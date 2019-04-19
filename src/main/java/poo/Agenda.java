package poo;

import java.util.ArrayList;

public class Agenda {
    //Atributos
    private ArrayList<Pessoa> contatos = new ArrayList<>();

    // Métodos

    public Agenda(){
        this.contatos = new ArrayList<>();  //Construtor instancia agenda como um ArrayList
    }

    public void addPessoa(Pessoa p){
        this.contatos.add(p);
    }

    public boolean removePessoa(String n, String s){
        for (Pessoa p : contatos) {
            if(p.toString() == n + s){
                contatos.remove(contatos.indexOf(p));
                return true;
            }
        }
        return false;
    }

    public boolean addTelefone(String r, String n, int pIndex){
        return true;
    }

    public boolean addEmail(String r, String e, int pIndex){
        return true;
    }

    public boolean updateTelefone(String r, String n, int pIndex){
        return true;
    }

    public boolean updateEmail(String r, String e, int pIndex){
        return true;
    }

    public boolean removeTelefone(String r, int pIndex){
        return true;
    }

    public boolean removeEmail(String r, int pIndex){
        return true;
    }

    @Override
    public String toString() {
        return "Agenda{" +
                "contatos=" + contatos +
                '}';
    }//teste
}
