package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Mentoria extends Conteudo {
    // Atributos
    private LocalDate data;


    public LocalDate getData() {
        return data;
    }
    public void setData(LocalDate data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Mentoria{" +
                "titulo = '" + super.getTitulo() + '\'' +
                ", descricao = '" + super.getDescricao() + '\'' +
                ", data=" + data +
                '}';
    }

    @Override
    public double calcularXP() {
        return XP_PADRAO * 20d;
    }
}
