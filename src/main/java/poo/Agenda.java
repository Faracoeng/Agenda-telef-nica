package poo;

import java.time.LocalDate;
import java.util.ArrayList;

public class Agenda {

    // Atributos

    private ArrayList<Pessoa> contatos = new ArrayList();

    // Metodos

    public Agenda(){
        this.contatos = new ArrayList<>();
    }

    public void addPessoa(String nome, String sobrenome, LocalDate data,  String num, String rotuloNumero, String email, String rotuloEmail){
        this.contatos.add(new Pessoa(nome,sobrenome,data,num,rotuloNumero,email,rotuloEmail) );
    }

    public boolean removePessoa(String n, String s){
        for (Pessoa e : contatos) {
            if((e.getNome()+e.getSobrenome()).matches(n + s)){                  // COMPARA RETORno dos Getters (concatenaçao do nome e sobrenome)
                contatos.remove(contatos.indexOf(e));   // Se forem iguais, remove pessoa associada ao indice atual
                return true;
            }
        }
        return false;
    }

    //    private boolean verificaPosicao(int pos){
//        if(contatos.size() == 0) return false;
//        return pos<contatos.size();
//    }
    public boolean addTelefone(String r, String n, int pIndex){
        if(contatos.size() == 0) return false;      //Tratamento de erro
        if(pIndex < contatos.size()) return false;
        return contatos.get(pIndex).addTelefone(r, n);
    }

    public boolean addEmail(String r, String e, int pIndex){
        if(contatos.size() == 0) return false;
        if(pIndex < contatos.size()) return false;
        return contatos.get(pIndex).addEmail(r, e);
    }

    public boolean updateTelefone(String r, String n, int pIndex){
        if(contatos.size() == 0) return false;      //Tratamento de erro , da para criar uma função privata para fazer isso
        if(pIndex < contatos.size()) return false;
        return contatos.get(pIndex).updateTelefone(r, n);
    }

    public boolean updateEmail(String r, String e, int pIndex){
        if(contatos.size() == 0) return false;
        if(pIndex < contatos.size()) return false;
        return contatos.get(pIndex).updateEmail(r, e);
    }

    public boolean removeTelefone(String r, int pIndex){
        if(contatos.size() == 0) return false;
        if(pIndex < contatos.size()) return false;
        return contatos.get(pIndex).removeTelefone(r);

    }

    public boolean removeEmail(String r, int pIndex){
        if(contatos.size() == 0) return false;
        if(pIndex < contatos.size()) return false;
        return contatos.get(pIndex).removeEmail(r);
    }

    public String getContatos(int pIndex) {
        return contatos.get(pIndex).toString();
    } //A busca poderia ser realizada pelo nome e sobrenome como no metodo removePessoa()

    @Override
    public String toString() {
        return "Agenda:" +'\n'+ contatos;
    }
}