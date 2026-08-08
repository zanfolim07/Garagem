package br.com.fiap.pratica2;

public class Data {
    private int dia;
    private int mes;
    private int ano;

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        validarDia(dia);
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        validarMes(mes);
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        validarAno(ano);
    }

    public String retornarData() {
        return String.format("%02d/%02d/%04d", dia, mes, ano);
    }

    private void validarDia(int d) {
        if (d >= 1 && d <= 31) {
            this.dia = d;
        } else {
            this.dia = 1;
        }
    }

    private void validarMes(int m) {
        if (m >= 1 && m <= 12) {
            this.mes = m;
        } else {
            this.mes = 1;
        }
    }

    private void validarAno(int a) {
        if (a >= 0) {
            this.ano = a;
        } else {
            this.ano = 2023;
        }
    }
}