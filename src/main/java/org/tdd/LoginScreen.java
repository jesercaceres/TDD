package org.tdd;

/**
 * A classe LoginScreen representa a tela de login e contém a lógica de autenticação de usuário.
 */
public class LoginScreen {

    private static final String VALID_USERNAME = "usuario";
    private static final String VALID_PASSWORD = "senha123";

    /**
     * Autentica o usuário com base no nome de usuário e senha fornecidos.
     *
     * @param username o nome de usuário fornecido
     * @param password a senha fornecida
     * @return true se o nome de usuário e a senha forem válidos, caso contrário false
     */
    public boolean authenticate(String username, String password) {
        if (username == null || password == null) {
            return false;
        }
        return username.equals(VALID_USERNAME) && password.equals(VALID_PASSWORD);
    }
}