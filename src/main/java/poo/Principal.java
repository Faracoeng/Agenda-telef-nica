package poo;

import java.time.LocalDate;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        Agenda agenda = new Agenda();
        int opção = 0;
        while(opção != 9){
            System.out.println(">>> AGENDA TELEFÔNICA <<<\n" +
                    "Menu:\n" +
                    "(0) Listar contatos\n" +
                    "(1) Adicionar contato\n" +
                    "(2) Remover contato\n" +
                    "(3) Adicionar telefone\n" +
                    "(4) Adionar e-mail\n" +
                    "(5) Update telefone\n" +
                    "(6) Update e-mail\n" +
                    "(7) Remove telefone\n" +
                    "(8) Remove e-mail\n" +
                    "(9) Sair");
            System.out.println("Digite sua opção");
            opção = teclado.nextInt();
            switch (opção){
                case 0: {
                    System.out.println(agenda.toString());
                    break;
                }
                case 1: {
                    System.out.print("Nome: ");
                    String nome = teclado.next();
                    System.out.print("Sobrenome: ");
                    String sobrenome = teclado.next();
                    Pessoa p = new Pessoa(nome, sobrenome, LocalDate.now());
                }
                case 2:
                    System.out.print("Nome: ");
                    String nome = teclado.next();
                    System.out.print("Sobrenome: ");
                    String sobrenome = teclado.next();
                    if(agenda.removePessoa(nome, sobrenome)){
                        System.out.println(nome + " " + sobrenome + " foi removido com sucesso!");
                    }else{
                        System.out.println(nome + " " + sobrenome + " não existe");
                    }
                    break;
                case 3: {
                    System.out.print("Rótulo: ");
                    String rotulo = teclado.next();
                    System.out.print("Número: ");
                    String numero = teclado.next();
                    System.out.print("Index: ");
                    int index = teclado.nextInt();
                    if(agenda.addTelefone(rotulo, numero, index)){
                        System.out.println(rotulo + ":" + numero + " adicionado com sucesso!");
                    }else{
                        System.out.println("Não foi possível adcionar, verifique os dados informados");
                    }
                    break;
                }
                case 4: {
                    System.out.print("Rótulo: ");
                    String rotulo = teclado.next();
                    System.out.print("E-mail: ");
                    String email = teclado.next();
                    System.out.print("Index: ");
                    int index = teclado.nextInt();
                    if(agenda.addEmail(rotulo, email, index)){
                        System.out.println(rotulo + ":" + email + " adicionado com sucesso!");
                    }else{
                        System.out.println("Não foi possível adcionar, verifique os dados informados");
                    }
                    break;
                }
                case 5: {
                    System.out.print("Rótulo: ");
                    String rotulo = teclado.next();
                    System.out.print("Número: ");
                    String numero = teclado.next();
                    System.out.print("Index: ");
                    int index = teclado.nextInt();
                    if(agenda.updateTelefone(rotulo, numero, index)){
                        System.out.println(rotulo + ":" + numero + " atualizado com sucesso!");
                    }else{
                        System.out.println("Não foi possível atualizar, verifique os dados informados");
                    }
                    break;
                }
                case 6: {
                    System.out.print("Rótulo: ");
                    String rotulo = teclado.next();
                    System.out.print("E-mail: ");
                    String email = teclado.next();
                    System.out.print("Index: ");
                    int index = teclado.nextInt();
                    if(agenda.updateEmail(rotulo, email, index)){
                        System.out.println(rotulo + ":" + email + " atualizado com sucesso!");
                    }else{
                        System.out.println("Não foi possível atualizar, verifique os dados informados");
                    }
                    break;
                }
                case 7: {
                    System.out.print("Rótulo: ");
                    String rotulo = teclado.next();
                    System.out.print("Index: ");
                    int index = teclado.nextInt();
                    if(agenda.removeTelefone(rotulo, index)){
                        System.out.println(rotulo + " removido com sucesso!");
                    }else{
                        System.out.println("Não foi possível remover, verifique os dados informados");
                    }
                    break;
                }
                case 8: {
                    System.out.print("Rótulo: ");
                    String rotulo = teclado.next();
                    System.out.print("Index: ");
                    int index = teclado.nextInt();
                    if(agenda.removeEmail(rotulo, index)){
                        System.out.println(rotulo + " removido com sucesso!");
                    }else{
                        System.out.println("Não foi possível remover, verifique os dados informados");
                    }
                    break;
                }
                case 9:
                    System.out.println("Saindo... Até a próxima!");
            }
        }
    }
}
