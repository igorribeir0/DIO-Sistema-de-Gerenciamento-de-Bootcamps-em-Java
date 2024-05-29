package br.com.dio.desafio.dominio;

public class Curso extends Conteudo{
    // Atributos

    private int cargaHoraria;

    // Métodos Getters and Setters

    public int getCargaHoraria() {
        return cargaHoraria;
    }
    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    @Override
    public String toString() {

        return "Curso{" +
                "titulo='" + super.getTitulo() + '\'' +
                ", descricao='" + super.getDescricao() + '\'' +
                ", cargaHoraria=" + cargaHoraria +
                '}';
    }

    @Override
    public double calcularXP() {
        return XP_PADRAO * cargaHoraria;
    }
}
