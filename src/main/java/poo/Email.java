package poo;

import java.util.HashMap;

public class Email {
    //Atributos
    private HashMap <String, String> tabelaDeEmails;
    private String emailER = "^[\\w-\\+]+(\\.[\\w]+)*@[\\w-]+(\\.[\\w]+)*(\\.[a-z]{2,})$";  //Expressão regular do formato 

    //Métodos
    private boolean validacaoEmail(String email){

        return email.matches(emailER);      //  Verifica se email é valido
    }

    public Email(){
        tabelaDeEmails = new HashMap<>();   //  Construtor define Email como uma HashMap
    }

    public boolean add(String r, String e){ // Esse método adiciona um e-mail

        if(!this.validacaoEmail(e)) return false;   //se e-mail nao for válido
        if(tabelaDeEmails.containsKey(r)) return false; //  Se conter a chave "r"
        tabelaDeEmails.put(r, e); // então e-mail é adicionado
        return true;
    }

    public boolean remove(String r){        // Remove um e-mail especifico da HashMap
        if(!tabelaDeEmails.containsKey(r)) return false;    //Se e-mail existir na HashMap
        tabelaDeEmails.remove(r);   //remove ele
        return true;
    }

    public boolean update(String r, String e){          //Igual anteriores
        if(!this.validacaoEmail(e)) return false;
        if(!this.tabelaDeEmails.containsKey(r)) return false;
        this.tabelaDeEmails.put(r, e);
        return true;
    }

    @Override
    public String toString() {
        return "Email{" +
                "tabelaDeEmails=" + tabelaDeEmails +
                ", emailER='" + emailER + '\'' +
                '}';
    }
}
