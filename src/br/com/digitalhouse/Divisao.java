package br.com.digitalhouse;

public class Divisao implements OperacaoMatematica {
    @Override
    public Integer calcula(Integer a, Integer b) {
        return a / b;
    }
}
