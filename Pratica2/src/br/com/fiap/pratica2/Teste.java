package br.com.fiap.pratica2;

public class Teste {
    public static void main(String[] args) {
        Data data = new Data();
        data.setDia(9);
        data.setMes(5);
        data.setAno(2008);


        System.out.println(data.retornarData());

    }
}
