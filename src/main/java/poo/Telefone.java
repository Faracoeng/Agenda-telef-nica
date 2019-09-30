package poo;

import javax.swing.text.MaskFormatter;
import java.text.ParseException;
import java.util.HashMap;

public class Telefone {

    // Atributos

    private HashMap<String, String> dados;
    private final String telefoneExpressaoRegular = "^[1-9]{2}([9][1-9][0-9]{7}|[1-9][0-9]{7})$";

    // Metodos

    public Telefone(){
        dados = new HashMap<>();
    }

    public boolean add(String r, String n)  { //Recebe um rótulo de identificação e o número de telefone para ser adicionado na HashMap

        if(!n.matches(telefoneExpressaoRegular)) return false;
        if(dados.containsKey(r)) return false;
        MaskFormatter mf;
        try {
            mf = new MaskFormatter("(##)#####-####");
            mf.setValueContainsLiteralCharacters(false);
            n = mf.valueToString(n);
        } catch (ParseException ex) {
            return false;
        }
        // System.out.println("formatado --> " + n);
        dados.put(r, n);
        return true;
    }

    public boolean remover(String r){
        if(!dados.containsKey(r)) return false;
        dados.remove(r);
        return true;
    }

    public boolean update(String r, String n){
        if(!this.dados.containsKey(r)) return false;
        dados.put(r, n); //substitui dado "n" atraves da chave "r"
        return true;
    }

    @Override
    public String toString() {
        return " " + dados;
    }
}