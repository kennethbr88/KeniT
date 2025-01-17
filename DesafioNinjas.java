package Desafio1;

public class DesafioNinjas {
    public static void main(String[] args) {

        String s = " - Vila da Folha, ";

        //Ninja 1
        String nameNinja1 = "Hinata Hyuuga";
            int age1 = 14;
            char missionNinja1 =  'C';
            String detailsNinja1 = " missão: Captura da espada perdida!";
            boolean missionComplete1 = false;

        //Ninja 2
        String nameNinja2 = "Sasuke Itachi";
            int age2 = 14;
            char missionNinja2 = 'D';
            String detailsNinja2 = " missão: O mascote da vila de Gau!";
            boolean missionComplete2 = false;

        //Ninja 3
        String nameNinja3 = "Naruto Uzumaki";
            int age3 = 14;
            char missionNinja3 = 'C';
            String detailsNinja3 = " missão: invocação do sapo gennin!";
            boolean missionComplete3 = false;

        //Condições para o Ninja 1
        if (age1 < 15 && missionNinja1 == 'C' || missionNinja1 =='D' && missionComplete1 == true) {
            System.out.println(nameNinja1 + s + detailsNinja1 + " Missão adquirida e completada.");
        } else if (age1 < 15 && missionNinja1 == 'C' || missionNinja1 == 'D' && missionComplete1 == false) {
            System.out.println(nameNinja1 + s + detailsNinja1 + " Misssão não concluida ainda!");
        } else if(age1 >= 15){
            System.out.println(nameNinja1 + s + " pode concluir qualquer missão");
        }

        //Condições para o Ninja 2
        if (age2 < 15 && missionNinja2 == 'D' || missionNinja2 == 'C' && missionComplete2 == true){
            System.out.println(nameNinja2 + s + detailsNinja2 + " Missão adquirida e completada.");
        }
            else if(age2 < 15 && missionNinja2 == 'D' || missionNinja2 == 'C' && missionComplete2 == false) {
            System.out.println(nameNinja2 + s + detailsNinja2 + " Missão não concluida ainda!");
        }   else if(age2 >= 15 && missionComplete2 == false){
            System.out.println(nameNinja2 + s + " pode concluir qualquer missão.");
        }

        //Condições para o Ninja 3
        if (age3 < 15 && missionNinja3 == 'C' || missionNinja3 == 'D' && missionComplete3 == true){
            System.out.println("--------------------------------");
            System.out.println("Nome do ninja: " + nameNinja3);
            System.out.println("Nome da vila: " + s);
            System.out.println("Detalhes da missão: " + detailsNinja3);
            System.out.println("Missão adquirida e completada.");
            System.out.println("--------------------------------");
        } else if (age3 < 15 && missionNinja3 == 'C' || missionNinja3 == 'D' && missionComplete3 == false){
            System.out.println(nameNinja3 + s + detailsNinja3 + " Missão não concluida ainda!");
        } else if (age3 >= 15){
            System.out.println(nameNinja3 + s + " pode concluir qualquer missão.");
        }




    }
}
