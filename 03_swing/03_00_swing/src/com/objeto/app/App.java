package com.objeto.app;

import javax.swing.JOptionPane;

import com.objeto.models.Pessoa;

public class App {
    public static void main(String[] args) throws Exception {
        Pessoa usuario = new Pessoa();

        //entrada de dados
        usuario.setNome(JOptionPane.showInputDialog("Informe seu nome:"));
        usuario.setIdade(Integer.parseInt(JOptionPane.showInputDialog("Informe sua idade:")));
        usuario.setCpf(JOptionPane.showInputDialog("Informe o CPF:"));
        usuario.setEmail(JOptionPane.showInputDialog("Informe seu e-mail:"));
        usuario.setTelefone(JOptionPane.showInputDialog("Informe seu telefone:"));

        // saída de dados
        JOptionPane.showMessageDialog(
            null,
            "DADOS DO USUÁRIO\nNome: " + usuario.getNome() +
            "\n Idade: " + usuario.getIdade() +
            "\n CPF: " + usuario.getCpf() +
            "\n E-mail: " + usuario.getEmail()  +
            "\n Telefone: " + usuario.getTelefone() 



        );
          


    }
}
