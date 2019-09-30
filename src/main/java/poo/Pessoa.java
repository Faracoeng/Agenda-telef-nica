package poo;

import java.time.LocalDate;

public class Pessoa {
    // Atributos

    private String nome;
    private String sobrenome;
    private LocalDate dataNascimento;
    private Telefone telefones;
    private Email emails;

// Metodos

    public Pessoa(String n,String s,LocalDate dN, String num, String rotuloNum, String email, String rotuloEmail){  //Construtor instancia os objetos e atrubui respectivos dados de nome,sobrenome e data de nascimento
        this.nome = n;
        this.sobrenome = s;
        this.dataNascimento = dN;
        this.telefones = new Telefone();
        this.emails = new Email();
        if (addTelefone(rotuloNum,num)){
            System.out.println("Telefone adicionado com sucesso");
        }else System.out.println("Não foi possível adicionar o telefone, verifique os dados informados: Formato --> (\"(##)#####-####\")");

        if (addEmail(rotuloEmail,email)){
            System.out.println("E-mail adicionado com sucesso");
        }else System.out.println("Não foi possível adicionar o e-mail, verifique os dados informados");
    }
    public boolean addTelefone(String r, String n){
        return this.telefones.add(r, n);
    }
    //
    public boolean addEmail(String r, String e){
        return this.emails.add(r, e);
    }
    //
    public boolean removeTelefone(String r){
        return this.telefones.remover(r);
    }
    //
    public boolean removeEmail(String r){
        return this.emails.remove(r);
    }
    //
    public boolean updateTelefone(String r, String n){
        return this.telefones.update(r, n);
    }
    //
    public boolean updateEmail(String r, String e){
        return this.emails.update(r, e);
    }

    public String getNome() {
        return nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    @Override
    public String toString() {
        return  '\n'+"Nome = " + nome + " " + sobrenome + '\n' +
                "Data de nascimento = " + dataNascimento + '\n' +
                "Telefone = " + telefones + '\n'+
                "Email = " + emails + '\n';
    }
}