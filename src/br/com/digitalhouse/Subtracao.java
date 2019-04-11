package br.com.digitalhouse;

public class Subtracao implements OperacaoMatematica {
    @Override
    public Integer calcula(Integer a, Integer b) {
        return a - b;
    }
}
