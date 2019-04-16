package poo;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;

public class TestaPessoa {
    @Test
    public void addTelefone(){
        Pessoa p = new Pessoa("André", "Luiz", LocalDate.now());
        Assert.assertFalse("DDD inválido", p.addTelefone("casa", "4033465044"));
        Assert.assertFalse("8º dígito inválido", p.addTelefone("casa", "48038245569"));
        Assert.assertFalse("9º dígito inválido", p.addTelefone("casa", "48833335555"));
        Assert.assertFalse("8º dígito inválido", p.addTelefone("casa", "489033465044"));
        Assert.assertTrue("Adição válida", p.addTelefone("casa", "4833465044"));
        Assert.assertFalse("Rótulo já existe", p.addTelefone("casa", "4533465044"));
    }
    @Test
    public void addEmail(){
        Pessoa p = new Pessoa("André", "Luiz", LocalDate.now());
        Assert.assertFalse("Email inválido", p.addEmail("pessoal", "@gmail.com"));
        Assert.assertFalse("Email inválido", p.addEmail("pessoal", "anregmail.com"));
        Assert.assertFalse("Email inválido", p.addEmail("pessoal", "andre@gmail"));
        Assert.assertFalse("Email inválido", p.addEmail("pessoal", "andre@.com"));
        Assert.assertTrue("Email válido", p.addEmail("pessoal", "andre@gmail.com"));
        Assert.assertFalse("Rótulo duplicado", p.addEmail("pessoal", "andre@gmail.com"));
    }
    @Test
    public void removeTelefone(){
        Pessoa p = new Pessoa("André", "Luiz", LocalDate.now());
        p.addTelefone("casa", "4833465044");
        Assert.assertFalse("Remoção inválida", p.removeTelefone("trabalho"));
        Assert.assertTrue("Remoção válida", p.removeTelefone("casa"));
    }
    @Test
    public void removeEmail(){
        Pessoa p = new Pessoa("André", "Luiz", LocalDate.now());
        p.addEmail("pessoal", "andre@gmail.com");
        Assert.assertFalse("Remoção inválida", p.removeEmail("trabalho"));
        Assert.assertTrue("Remoção válida", p.removeEmail("pessoal"));
    }
    @Test
    public void updateTelefone(){
        Pessoa p = new Pessoa("André", "Luiz", LocalDate.now());
        p.addTelefone("casa", "4833465044");
        Assert.assertFalse("Rótulo inexistente", p.updateTelefone("trabalho", "4433386355"));
        Assert.assertFalse("DDD inválido", p.updateTelefone("casa", "4033335555"));
        Assert.assertFalse("8º dígito inválido", p.updateTelefone("casa", "4803863555"));
        Assert.assertFalse("9º dígito inválido", p.updateTelefone("casa", "48838635555"));
        Assert.assertFalse("8º dígito inválido", p.updateTelefone("casa", "48903318855"));
        Assert.assertTrue("Update válido", p.updateTelefone("casa", "4533388555"));
    }
    @Test
    public void updateEmail(){
        Pessoa p = new Pessoa("André", "Luiz", LocalDate.now());
        p.addEmail("pessoal", "andre@gmail.com");
        Assert.assertFalse("Rótulo inexistente", p.updateEmail("trabalho", "nome@gmail.com"));
        Assert.assertFalse("Email inválido", p.addEmail("pessoal", "@gmail.com"));
        Assert.assertFalse("Email inválido", p.addEmail("pessoal", "andregmail.com"));
        Assert.assertFalse("Email inválido", p.addEmail("pessoal", "andre@gmail"));
        Assert.assertFalse("Email inválido", p.addEmail("pessoal", "andre@.com"));
        Assert.assertTrue("Update válido", p.updateEmail("pessoal", "nome@gmail.com"));
    }
}
