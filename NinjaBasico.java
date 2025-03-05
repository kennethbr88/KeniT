package Desafio4;

public class NinjaBasico implements Ninja {
    public String nome;
    public int idade;
    public String habilidades;

    public NinjaBasico() {
    }

    public NinjaBasico(String nome, int idade, String habilidades) {
        this.nome = nome;
        this.idade = idade;
        this.habilidades = habilidades;
    }


    public void mostrarInformacoes() {
        System.out.printf("Ninja: %s, idade: %d, habilidade: %s\n", nome, idade, habilidades);
    }


    public void executarHabilidade() {
        System.out.printf("O ninja %s executou a habilidade %s\n", nome, habilidades);
    }


}