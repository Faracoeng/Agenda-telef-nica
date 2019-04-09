package poo;

import org.junit.Assert;
import org.junit.Test;

public class TestaEmail {

    public void testaEmail(){
        @Test
        Email testarEmail = new Email();
        Assert.assertEquals("andre.@.gmail.br  Não é um email");


    }

}
