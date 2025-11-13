package com.atividade05.app;

import javax.swing.JOptionPane;

import com.models.Pessoa;

public class App {
    public static void main(String[] args) throws Exception {
        
    Pessoa pessoa = new Pessoa();

         // array
        String[] opcoes = {"Calcular IMC", "Sair do programa"};
        Object opcao;

        // variáveis
        double imc;
        String resultado;

       
        // entrada de dados

          do {
            // entrada de dados
            opcao = JOptionPane.showInputDialog(
                null, 
                "Selecione uma opção:", 
                "Calcular IMC", 
                0, 
                null, 
                opcoes, 
                opcoes[0]
            );

            if (opcao != "Sair do programa") {
                pessoa.setNome(JOptionPane.showInputDialog("Informe o seu nome:"));
                   
                pessoa.setAltura(Double.parseDouble(JOptionPane.showInputDialog("Informe sua Altura:").replace(",", ".")));

                pessoa.setPeso(Double.parseDouble(JOptionPane.showInputDialog("Informe seu peso:").replace(",", ".")));

     


        //  calcular o IMC
        imc = pessoa.getPeso()/(pessoa.getAltura()*pessoa.getAltura());

        // exibe  o diagnóstico
        resultado = (imc < 18.5) ? " está abaixo do peso" :
        (imc < 25) ? " está no peso ideal" :
        (imc < 30) ? " está acima do peso" :
        (imc < 35) ? " está obeso":
        (imc < 40) ? " está com obesidade nível 2" :
        " está com obesidade mórbida";

           // saída de dados
                JOptionPane.showMessageDialog(
                    null, 
                    pessoa.getNome() +", o seu IMC é " + String.format("%.2f", imc) + ".\n Segundo a OMS você " + resultado + "." 
                );
            }
        } while (opcao != "Sair do programa");
    }
}

    




    

    // TODO: atividade 05
    /* 
     * Recrie o programa do IMC, desta vez usando os conceitos de Orientação
     * a Objetos, encapsulamento e Interface Gráfica com JOptionPane.
     * O programa deverá ter a opção de saída
     * Ao terminar, gere o executável.
     */

