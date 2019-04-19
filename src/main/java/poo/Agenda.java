package poo;

import java.util.ArrayList;

public class Agenda {
    //Atributos
    private ArrayList<Pessoa> contatos = new ArrayList<>();

    // Métodos

    public Agenda(){
        this.contatos = new ArrayList<>();  //Construtor instancia agenda como um ArrayList
    }

    public void addPessoa(Pessoa p){    //recebe parametro (objeto de Pessoa())
        this.contatos.add(p);           //ADICIONA A PESSOA NA LISTA
    }

    public boolean removePessoa(String n, String s){
        for (Pessoa p : contatos) { //PERCORRE A LISTA USANDO [FOR EACH]
            if(p.toString() == n + s){                  // COMPARA RETORNO DO METODO toString(), qué uma concatenaçao
                                                        // do nome e sobrenome, com parametos concatenados
                contatos.remove(contatos.indexOf(p));   // Se forem iguais, remove pessoa associada ao indice atual
                return true;
            }
        }
        return false;
    }

    public boolean addTelefone(String r, String n, int pIndex){
        if(contatos.size() == 0) return false;      //Tratamento de erro
        if(pIndex < contatos.size()) return false;  // kimita indice ser dentro do tamanho da lista(tratamento d erro)
        // As verificações acima serão necessários em vário métodos, é uma boa prática criar um método para fazer o processo
        return contatos.get(pIndex).addTelefone(r, n); //adiciona rótulo e nove na posição desejada
    }

    private boolean verificaPosicao(int pos){       //esse método é utilizado pela classe Agenda() para
                                                    // validar entrada de parametros de vários métodos
        if(contatos.size() == 0) return false;
        return pos<contatos.size();
    }


    public boolean addEmail(String r, String e, int pIndex){    // igual método addTelefone()
        if(!verificaPosicao(pIndex)) return false;
        return contatos.get(pIndex).addEmail(r, e);
    }

    public boolean updateTelefone(String r, String n, int pIndex){  // Mesma ideia dos métodos de adicionar
                                                                    // porem utiliza o método update tatnto
                                                                    //para email quanto para telefone
        if(!verificaPosicao(pIndex)) return false;
        return contatos.get(pIndex).updateTelefone(r, n);
    }

    public boolean updateEmail(String r, String e, int pIndex){
        if(!verificaPosicao(pIndex)) return false;
        return contatos.get(pIndex).updateEmail(r, e);
    }

    public boolean removeTelefone(String r, int pIndex){
        if(!verificaPosicao(pIndex)) return false;
        return contatos.get(pIndex).removeTelefone(r);

    }

    public boolean removeEmail(String r, int pIndex){
        if(!verificaPosicao(pIndex)) return false;
        return contatos.get(pIndex).removeEmail(r);
    }

    @Override
    public String toString() {
        return "Agenda{" +
                "contatos=" + contatos +
                '}';
    }
}//teste

