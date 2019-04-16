package poo;

import org.junit.Assert;
import org.junit.Test;

public class TestaEmail {

    @Test
    public void add(){

        Email testarEmail = new Email();
        Assert.assertFalse("Email inválido", testarEmail.add("pessoal", "erdina@gmail"));
        Assert.assertTrue("Email válido", testarEmail.add("pessoal", "ANDRÉ@gmail.com"));
        Assert.assertFalse("Rótulo duplicado", testarEmail.add("pessoal", "andre@gmail.com"));
        Assert.assertFalse("Email inválido", testarEmail.add("pessoal", "@gmail.com"));
        Assert.assertFalse("Email inválido", testarEmail.add("pessoal", "andregmail.com"));
    }

    @Test
    public void remove(){
        Email e = new Email();
        e.add("pessoal", "andre@gmail.com");
        Assert.assertFalse("Rótulo inexistente", e.remove("trabalho"));
        Assert.assertTrue("Remoção válida", e.remove("pessoal"));
    }

    @Test
    public void update(){
        Email e = new Email();
        e.add("pessoal", "andre@gmail.com");
        Assert.assertFalse("Rótulo inexistente", e.update("trabalho", "new@gmail.com"));
        Assert.assertTrue("Update válido", e.update("pessoal", "new@gmail.com"));
    }

}
