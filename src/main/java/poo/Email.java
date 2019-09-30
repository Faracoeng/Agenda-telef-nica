package poo;

import java.util.HashMap;

public class Email {

    // Atributos
    private HashMap<String, String> dados;
    private final String emailER = "^[\\w-\\+]+(\\.[\\w]+)*@[\\w-]+(\\.[\\w]+)*(\\.[a-z]{2,})$";
    // Métodos

    public Email(){
        dados = new HashMap<>();
    }

    public boolean add(String r, String e){ // Esse método adiciona um e-mail

        if(!e.matches(emailER)) return false;   //se for diferente da Expressao Regular
        if(dados.containsKey(r)) return false; //se ja existir
        dados.put(r, e);
        return true;
    }

    public boolean remove(String r){
        if(!dados.containsKey(r)) return false;    //Se e-mail não existir na HashMap
        dados.remove(r);   //remove ele
        return true;
    }

    public boolean update(String r, String e){
        if(!this.dados.containsKey(r)) return false;
        this.dados.put(r, e);
        return true;
    }

    @Override
    public String toString() {
        return " " + dados;
    }
}