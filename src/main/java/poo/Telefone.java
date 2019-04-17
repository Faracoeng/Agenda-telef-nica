package poo;
/**
 *
 */

import java.util.HashMap;

public class Telefone {
    // Atributos
    private HashMap <String, String> tabelaDeTelefones;
    String telefoneExpressaoRegular = "^[1-9]{2}([9][1-9][0-9]{7}|[1-9][0-9]{7})$"; //Expressão regular do formato de telefone

    //Métodos
    public Telefone(){
        tabelaDeTelefones = new HashMap<>();    // Definindo Telefone como uma HashMap
    }

//    private boolean validacaoTelefone(String numero){   //Esee método recebe um numero de telefone para verificar
//                                                        // se é valido comparando-d com a Expressão regular
//
//        return numero.matches(telefoneExpressaoRegular);//O método matches especifica uma expressão regular e localiza
//        // o conteúdo do objeto String em que está sendo aplicada essa expressão. Para saber se essa correspondência
//        // foi atendida ou não, é retornado um valor booleano (true ou false).
//    }

    public boolean add(String r, String n){ //Recebe um rótulo de identificação e o número de telefone para ser adicionado na HashMap

        if(!n.matches(telefoneExpressaoRegular)) return false;//Verifica se número adicionado condiz com Expressão regular
        //O método matches especifica uma expressão regular e localiza
        // o conteúdo do objeto String em que está sendo aplicada essa expressão. Para saber se essa correspondência
        // foi atendida ou não, é retornado um valor booleano (true ou false).
        if(tabelaDeTelefones.containsKey(r)) return false;//Verifica se "r", tendo o papel de chave da HashMap
                                                          // nessa lógica, esta presente na tabela
        tabelaDeTelefones.put(r, n);        //Case nao exista um "r" correspondente na HashMap, define
                                            // "n" como conteúdo da chave "r" atual
        return true;
    }

    public boolean remover(String r){    //Remove dado associado a chave "r"
        if(!tabelaDeTelefones.containsKey(r)) return false; //Verifica se existe chave "r" na HashMap
        tabelaDeTelefones.remove(r);        //Método remove (r,n)
        return true;
    }

    public boolean update(String r, String n){  // Atualiza algum dado existente
        //if(!n.matches(telefoneExpressaoRegular)) return false;  // talvez não necessário
        if(!this.tabelaDeTelefones.containsKey(r)) return false; //  Verifica se essa chave existe na HashMap
        tabelaDeTelefones.put(r, n); //substitui dado "n" atraves da chave "r"
        return true;
    }

    @Override
    public String toString() {
        return "Telefone{" +
                "tabelaDeTelefones=" + tabelaDeTelefones +
                ", tel='" + telefoneExpressaoRegular + '\'' +
                '}';
    }
}
