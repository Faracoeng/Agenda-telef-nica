package poo;

import java.time.LocalDate;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {


        Scanner teclado = new Scanner(System.in);
        Agenda agenda = new Agenda();
        int opcao = 0;

        do {

            System.out.println("\n         ==============================");
            System.out.println("        |     1 - Adicionar contato      |");
            System.out.println("        |     2 - Remover contato        |");
            System.out.println("        |     3 - Atualizar contato      |");
            System.out.println("        |     4 - Listar contatos        |");
            System.out.println("        |     0 - Sair                   |");
            System.out.println("         ===============================\n");
            System.out.print("\n");
            opcao = teclado.nextInt();
            String nome = "";
            String sobrenome = "";
            String rotTel = "";
            String numeroTelefone = "";
            String rotEmail = "";
            String email = "";
            switch (opcao) {

                case 1: // Adicionar contato
                    System.out.print("Nome: ");
                    nome = teclado.next();
                    System.out.print("Sobrenome: ");
                    sobrenome = teclado.next();
                    System.out.print("Número de telefone: ");
                    numeroTelefone = teclado.next();
                    System.out.print("Rótulo do telefone: ");
                    rotTel = teclado.next();
                    System.out.print("Endereço de e-mail: ");
                    email = teclado.next();
                    System.out.print("Rótulo do e-mail: ");
                    rotEmail = teclado.next();
                    agenda.addPessoa(nome, sobrenome, LocalDate.now(),numeroTelefone,rotTel,email,rotEmail);
                    break;

                case 2: // Remover contato
                    System.out.print("Nome: ");
                    nome = teclado.next();
                    System.out.print("Sobrenome: ");
                    sobrenome = teclado.next();
                    if (agenda.removePessoa(nome, sobrenome)) {
                        System.out.println(nome + " " + sobrenome + " foi removido da agenda!");
                    } else {
                        System.out.println(nome + " " + sobrenome + " não existe");
                    }
                    break;

                case 3: //Atualizar contato
                    //---------------------------------Atualização de dados-------------------------------------------------
                    int opcaoAtt;
                    do {
                        System.out.println("\n         ================================ ");
                        System.out.println("        |     1 - Adicionar telefone       |");
                        System.out.println("        |     2 - Adionar email            |");
                        System.out.println("        |     3 - Update telefone          |");
                        System.out.println("        |     4 - Update e-mail            |");
                        System.out.println("        |     5 - Remove telefone          |");
                        System.out.println("        |     6 - Remove e-mail            |");
                        System.out.println("        |     0 - Voltar                   |");
                        System.out.println("          ================================  ");
                        opcaoAtt = teclado.nextInt();
                        String rotulo = "";
                        String numero = "";
                        int index;
                        switch (opcaoAtt) {

                            case 1: //Adicionar telefone
                                System.out.print("Rótulo: ");
                                rotulo = teclado.next();
                                System.out.print("Número: ");
                                numero = teclado.next();
                                System.out.print("Index: ");
                                index = teclado.nextInt();
                                if (agenda.addTelefone(rotulo, numero, index)) {
                                    System.out.println(rotulo + ":" + numero + " adicionado com sucesso!");
                                } else {
                                    System.out.println("Não foi possível adcionar, verifique os dados informados");
                                }
                                break;

                            case 2: //Adicionar email
                                System.out.print("Rótulo: ");
                                rotulo = teclado.next();
                                System.out.print("E-mail: ");
                                email = teclado.next();
                                System.out.print("Index: ");
                                index = teclado.nextInt();
                                if (agenda.addEmail(rotulo, email, index)) {
                                    System.out.println(rotulo + ":" + email + " adicionado com sucesso!");
                                } else {
                                    System.out.println("Não foi possível adcionar, verifique os dados informados");
                                }
                                break;

                            case 3: //Update telefone
                                System.out.print("Rótulo: ");
                                rotulo = teclado.next();
                                System.out.print("Número: ");
                                numero = teclado.next();
                                System.out.print("Index: ");
                                index = teclado.nextInt();
                                if (agenda.updateTelefone(rotulo, numero, index)) {
                                    System.out.println(rotulo + ":" + numero + " atualizado com sucesso!");
                                } else {
                                    System.out.println("Não foi possível atualizar, verifique os dados informados");
                                }
                                break;

                            case 4: //Update email
                                System.out.print("Rótulo: ");
                                rotulo = teclado.next();
                                System.out.print("E-mail: ");
                                email = teclado.next();
                                System.out.print("Index: ");
                                index = teclado.nextInt();
                                if (agenda.updateEmail(rotulo, email, index)) {
                                    System.out.println(rotulo + ":" + email + " atualizado com sucesso!");
                                } else {
                                    System.out.println("Não foi possível atualizar, verifique os dados informados");
                                }
                                break;

                            case 5: //Remove telefone
                                System.out.print("Rótulo: ");
                                rotulo = teclado.next();
                                System.out.print("Index: ");
                                index = teclado.nextInt();
                                if (agenda.removeTelefone(rotulo, index)) {
                                    System.out.println(rotulo + " removido com sucesso!");
                                } else {
                                    System.out.println("Não foi possível remover, verifique os dados informados");
                                }
                                break;

                            case 6: //Remove email
                                System.out.print("Rótulo: ");
                                rotulo = teclado.next();
                                System.out.print("Index: ");
                                index = teclado.nextInt();
                                if (agenda.removeEmail(rotulo, index)) {
                                    System.out.println(rotulo + " removido com sucesso!");
                                } else {
                                    System.out.println("Não foi possível remover, verifique os dados informados");
                                }
                                break;

                            case 0:
                                break;

                            default:
                                System.out.println("Opção Inválida!");
                                break;
                        }
                    } while (opcaoAtt != 0);


                    //------------------------------------------------------------------------------------------------------
                case 4:
                    int opcaoListar;
                    do {
                        System.out.println("\n         ==================================== ");
                        System.out.println("        |     1 - Listar todos contatos        |");
                        System.out.println("        |     2 - Listar dados de um contato   |");
                        System.out.println("        |     0 - Voltar                       |");
                        System.out.println("          ==================================== ");
                        opcaoListar = teclado.nextInt();
                        int index;
                        switch (opcaoListar) {
                            case 1:
                                System.out.println(agenda.toString());
                                break;
                            case 2:
                                System.out.print("Index: ");
                                index = teclado.nextInt();
                                System.out.println(agenda.getContatos(index));
                                break;

                            case 0:
                                break;

                            default:
                                System.out.println("Opção Inválida!");
                                break;




                        }
                    }while(opcaoListar != 0);

                    break;

                case 0:
                    break;

                default:
                    System.out.println("Opção Inválida!");
                    break;
            }
        } while (opcao != 0);
    }
}