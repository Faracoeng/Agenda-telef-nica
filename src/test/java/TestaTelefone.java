import org.junit.Assert;
import org.junit.Test;
import poo.Telefone;

public class TestaTelefone {
    @Test
    public void add() {
        Telefone t = new Telefone();

        Assert.assertTrue("Número válido", t.add("casa", "4833465044"));
        Assert.assertTrue("Número válido", t.add("celular", "48998577663"));
        Assert.assertFalse("Rótulo duplicado", t.add("celular", "45998577663"));
        Assert.assertFalse("Telefone sem DDD", t.add("casa", "998577663"));
        Assert.assertFalse("Telefone sem DDD", t.add("casa", "33577663"));
        Assert.assertFalse("DDD inválido", t.add("casa", "00998577663"));
        Assert.assertFalse("DDD inválido", t.add("casa", "048998577663"));
        Assert.assertFalse("DDD inválido", t.add("casa", "40900336688745"));
        Assert.assertFalse("DDD inválido", t.add("casa", "0033577663"));
        Assert.assertFalse("DDD inválido", t.add("casa", "048998577663"));
        Assert.assertFalse("DDD inválido", t.add("casa", "4033577663"));
        //    Assert.assertFalse("8º digito inválido", t.add("casa", "48998577663"));
    }
        @Test
        public void remove(){
            Telefone t = new Telefone();
            t.add("trabalho", "4833465044");
            Assert.assertFalse("Rótulo inexistente", t.remover("casa"));
            Assert.assertTrue("Remoção válida", t.remover("trabalho"));
        }
    @Test

    public void update(){
        Telefone t = new Telefone();
        t.add("casa", "4833465044");
        Assert.assertFalse("Rótulo inexistente", t.update("trabalho", "4833465044"));
        Assert.assertTrue("Update válido", t.update("casa", "4533465044"));
    }



}
