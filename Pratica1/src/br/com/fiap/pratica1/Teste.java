package br.com.fiap.pratica1;

public class Teste {
    public  static void main(String[]args) {
        Cor cor = new Cor();
        cor.setNome("Vermelho");
        cor.setR(2);
        cor.setG(5);
        cor.setB(5);

        Carro carro = new Carro();
        carro.setModelo("Porshe gt3 RS");
        carro.setQuantidadeLugares(2);
        carro.setQuantidadePortas(2);
        carro.setComprimento(4.57);
        carro.setAnoFabricacao(2003);
        carro.setCor(cor);
        carro.setPlaca("zan1234");
        carro.setMotor(4.0f);

        Aviao aviao = new Aviao();
        aviao.setModelo("Boeing 737");
        aviao.setQuantidadeLugares(180);
        aviao.setPrefixo("PR-ABC");
        aviao.setComprimento(33.6);
        aviao.setAnoFabricacao(2005);
        aviao.setCor(cor);
        aviao.setQuantidadeTurbinas(2);

        Lancha lancha = new Lancha();
        lancha.setModelo("Phantom");
        lancha.setQuantidadeLugares(8);
        lancha.setComprimento(7.5);
        lancha.setAnoFabricacao(2015);
        lancha.setCor(cor);
        lancha.setQuantidadeMotores(2);

        System.out.println("------Carro------");
        System.out.println("Modelo: " + carro.getModelo());
        System.out.println("Lugares: " + carro.getQuantidadeLugares());
        System.out.println("Portas: " + carro.getQuantidadePortas());
        System.out.println("Comprimento: " + carro.getComprimento());
        System.out.println("Ano: " + carro.getAnoFabricacao());
        System.out.println("Cor: " + carro.getCor().getNome());
        System.out.println("Placa: " + carro.getPlaca());
        System.out.println("Motor: " + carro.getMotor());

        System.out.println("------Aviao------");
        System.out.println("Modelo: " + aviao.getModelo());
        System.out.println("Prefixo: " + aviao.getPrefixo());
        System.out.println("Turbinas: " + aviao.getQuantidadeTurbinas());

        System.out.println("------Lancha------");
        System.out.println("Modelo: " + lancha.getModelo());
        System.out.println("Motores: " + lancha.getQuantidadeMotores());
    }
}




