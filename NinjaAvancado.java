package Desafio4;

public class NinjaAvancado implements Ninja {
    public String nome;
    public int idade;
    public String habilidades;
    public String especialidade;


    public NinjaAvancado(String nome, int idade, String habilidades, String especialidade) {
        this.nome = nome;
        this.idade = idade;
        this.habilidades = habilidades;
        this.especialidade = especialidade;
    }


    @Override
    public void mostrarInformacoes() {
        System.out.printf("Ninja: %s, idade: %d, habilidade: %s, especialidade: %s\n",
                nome,
                idade,
                habilidades,
                especialidade);
    }


    @Override
    public void executarHabilidade() {
        System.out.printf("O ninja %s executou a habilidade %s e sua especialidade %s\n",
                nome,
                habilidades,
                especialidade);
    }
}