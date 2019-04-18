package poo;

import java.time.LocalDate;

public class Pessoa {
    //Atributos
    private String nome;
    private String sobrenome;
    private LocalDate dataNasc; // é do java
    private Telefone telefones;//Objeto da classe Telefone
    private Email emails;////Objeto da classe Email

    //Métodos
    public Pessoa(String n,String s,LocalDate dn){  //Construtor instancia os objetos e atrubui respectivos dados de nome,sobrenome e data de nascimento
        this.nome = n;
        this.sobrenome = s;
        this.dataNasc = dn;
        this.telefones = new Telefone();
        this.emails = new Email();
    }

    public boolean addTelefone(String r, String n){ //utiliza o método add() da classe Telefone
        return this.telefones.add(r, n);    //Como o tratamento de erros ja foi feito la na classe, aqui basta apenas chamar o método
    }

    public boolean addEmail(String r, String e){        //utiliza o método add() da classe Email
        return this.emails.add(r, e);                //Como o tratamento de erros ja foi feito la na classe, aqui basta apenas chamar o método
    }

    public boolean removeTelefone(String r){        //Chama o método remover() da classe Telefone
        return this.telefones.remover(r);           //Sem tratamento de erro, remove o dado da HashMap
    }

    public boolean removeEmail(String r){           //Igual anterior
        return this.emails.remove(r);
    }

    public boolean updateTelefone(String r, String n){ //Igual anteriores
        return this.telefones.update(r, n);
    }

    public boolean updateEmail(String r, String e){ //Igual anteriores

        return this.emails.update(r, e);
    }
        // Comentado
    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", sobrenome='" + sobrenome + '\'' +
                ", dataNasc=" + dataNasc +
                ", telefones=" + telefones +
                ", emails=" + emails +
                '}';
    }
}
