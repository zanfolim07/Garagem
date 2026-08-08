package br.com.fiap.garagem.view;

import br.com.fiap.garagem.model.Carro;

public class Terminal {
    public static void main(String[] args) {
        //criar um objeto carro
        Carro onix = new Carro();
        onix.setPlaca("ABC1234");
        onix.setNumeroVaga(20);
        onix.setSetor('A');
        onix.setPreferencial(false);
        onix.setHoraEntrada("20:15");
        onix.setHoraSaida("21:30");
        onix.setValor(50.00);

        System.out.println("Placa: " + onix.getPlaca());
        System.out.println("Numero da Vaga: " + onix.getNumeroVaga());
        System.out.println("Setor: " + onix.getSetor());
        System.out.println("É preferencial? " + onix.isPreferencial());
        System.out.println("Horario de entrada: " + onix.getHoraEntrada());
        System.out.println("Horario de saida: " + onix.getHoraSaida());
        System.out.println("Valor de pagamento: " + onix.getValor());


    }
}
