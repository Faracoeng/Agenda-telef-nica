package poo;

import java.util.HashMap;

public class Telefone {
    // Atributos
    private HashMap <String, String> tabelaDeTelefones;

    //Métodos
    public Telefone(){
        tabelaDeTelefones = new HashMap<>();
    }

    public boolean add(String r, String n){
        String tel = "^[1-9]{2}([9][1-9][0-9]{7}|[1-9][0-9]{7})$";

        if(!n.matches(tel)) return false;
        if(tabelaDeTelefones.containsKey(r)) return false;
        tabelaDeTelefones.put(r, n);
        return true;
    }

    public boolean remover(String r){
        return true;
    }

    public boolean update(String r, String n){
        return true;
    }

    @Override
    public String toString() {
        return "Telefone{}";
    }
}
