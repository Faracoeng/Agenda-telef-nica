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

    public boolean add(String rotulo, String email){
        if(!this.validacaoEmail(email)) return false;
        if(tabelaDeEmails.containsKey(rotulo)) return false;
        tabelaDeEmails.put(rotulo, email);
        return true;
    }

    public boolean remove(String rotulo){
        if(!tabelaDeEmails.containsKey(rotulo)) return false;
        tabelaDeEmails.remove(rotulo);
        return true;
    }

    public boolean update(String rotulo, String email){
        if(!this.validacaoEmail(email)) return false;
        if(!this.tabelaDeEmails.containsKey(rotulo)) return false;
        this.tabelaDeEmails.put(rotulo, email);
        return true;
    }

    @Override
    public String toString() {
        return "Email{" +
                "tabelaDeEmails=" + tabelaDeEmails +
                '}';
    }
}
