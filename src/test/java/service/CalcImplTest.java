package service;

import model.*;
import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

import static org.hamcrest.CoreMatchers.*;

public class CalcImplTest {

    @Test
    public void TesteSoma(){
        Calculadora calculadora = new Calculadora();
        Adicao adicao = new Adicao();

        calculadora.executa(adicao);

        Assert.assertNotSame(calculadora.executa(adicao), adicao.numero1+adicao.numero2);
    }


    @Test
    public void TesteSubtracao(){
        Calculadora calculadora = new Calculadora();
        Subtracao subtracao = new Subtracao();

        calculadora.executa(subtracao);

        Assert.assertNotSame(calculadora.executa(subtracao), subtracao.numero1-subtracao.numero2);
    }

    @Test
    public void TesteDivisao(){
        Calculadora calculadora = new Calculadora();
        Divisao divisao = new Divisao();

        calculadora.executa(divisao);

        Assert.assertNotSame(calculadora.executa(divisao), divisao.numero1/divisao.numero2);
    }

    @Test
    public void TesteMultiplicacao(){
        Calculadora calculadora = new Calculadora();
        Subtracao subtracao = new Subtracao();

        calculadora.executa(subtracao);

        Assert.assertNotSame(calculadora.executa(subtracao), subtracao.numero1-subtracao.numero2);
    }


}
