package com.team1.mensagem.utils;

public class Utils {
    public static boolean verificarTelefoneValido(String telefone) {
        return (verificarTamanhoTelefoneValido(telefone));
    }

    public static boolean verificarTamanhoTelefoneValido(String telefone) {
        return (telefone.length() == 11);
    }

    public static boolean verificarEmailValido(String email) {
        return (email.matches("^[\\w.-]+@[\\w.-]+\\.[a-zA-Z]{2,}$"));
    }

    public static boolean verificarSenhaValida(String senha) {
        return senha.length() >= 8;
    }
}