package poo;

import java.util.HashMap;

public class Email {
    private HashMap <String, String> tabelaDeEmails;

    private boolean validacaoEmail(String email){
        String emailER = "^[\\w-\\+]+(\\.[\\w]+)*@[\\w-]+(\\.[\\w]+)*(\\.[a-z]{2,})$";
        return email.matches(emailER);
    }

    public Email(){
        tabelaDeEmails = new HashMap<>();
    }

    public boolean add(String r, String e){
        if(!this.validacaoEmail(e)) return false;
        if(tabelaDeEmails.containsKey(r)) return false;
        tabelaDeEmails.put(r, e);
        return true;
    }

    public boolean remove(String r){
        if(!tabelaDeEmails.containsKey(r)) return false;
        tabelaDeEmails.remove(r);
        return true;
    }

    public boolean update(String r, String e){
        if(!this.validacaoEmail(e)) return false;
        if(!this.tabelaDeEmails.containsKey(r)) return false;
        this.tabelaDeEmails.put(r, e);
        return true;
    }

    @Override
    public String toString() {
        return "Email{" +
                "tabelaDeEmails=" + tabelaDeEmails +
                '}';
    }
}
