package poo;

import java.util.HashMap;

public class Email {
    //Atributos
    private HashMap<String, String> dados = new HashMap<>();

    //Métodos

    public Email(){}

    public boolean add(String r, String e){
        return true;
    }

    public boolean remove(String r){
        return true;
    }

    public boolean update(String r, String e){
        return true;
    }

    @Override
    public String toString() {
        return "Email{" +
                "dados=" + dados +
                '}';
    }
}
