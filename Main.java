package Desafio4;

public class Main {
    public static void main(String[] args) {


        NinjaBasico ninjaBasico = new NinjaBasico("Naruto Uzumaki", 19, "clone das sombras");
        NinjaAvancado ninjaAvancado = new NinjaAvancado("Kakashi", 38, "Sharingan", "Olho da Percepção");


        ninjaBasico.mostrarInformacoes();
        ninjaBasico.executarHabilidade();


        ninjaAvancado.mostrarInformacoes();
        ninjaAvancado.executarHabilidade();
    }
}