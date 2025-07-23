package seletiva;

import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
    public static void main(String[] args) {
        System.out.println("------ Processo Seletivo ------");

    }
    static void selecionarCandidato (){
        // lista de candidatos
        String[] candidatos = {"João", "Julia", "Joana", "Tiago", "Maria", "Laura" , "Pedro", "Ana"};

        int candidatosSelecionados = 0;
        int candidatoAtual = 0;
        double salarioBase = 2000.0;
        while (candidatosSelecionados < 5){
            String candidato = candidatos[candidatoAtual];
            double salarioPretendido = valorPretendido();

            System.out.println("O candidato " + candidato + " solicitou este valor de salário R$" + salarioPretendido);

            if (salarioBase >= salarioPretendido){
                System.out.println("O candidato " + candidato + " foi selecionado para a vaga!");
                candidatosSelecionados++;
            }
            candidatoAtual++;
        }
    }

    static double valorPretendido(){
        return ThreadLocalRandom.current().nextDouble(1800,2200);
    }
    static void analisarCandidato (double salarioPretendido){
        double salarioBase = 2000.0;

        // verifica se o salário base é maior, igual ou menor que o salário pretendido
        if (salarioBase > salarioPretendido){
            System.out.println("O candidato passou para a próxima fase!");
        } else if (salarioBase == salarioPretendido) {
            System.out.println("Fazer contra prosposta para o candidato.");
        } else {
            System.out.println("Aguardando o resultado dos demais candidatos.");
        }
    }
}
