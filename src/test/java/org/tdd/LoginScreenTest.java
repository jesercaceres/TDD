package org.tdd;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * A classe LoginScreenTest contém testes unitários para a classe LoginScreen.
 */
public class LoginScreenTest {

    private LoginScreen loginScreen;

    /**
     * Configura o ambiente de teste antes de cada teste.
     */
    @BeforeEach
    public void setUp() {
        System.out.println("Configurando o ambiente de teste...");
        loginScreen = new LoginScreen();
    }

    /**
     * Testa a autenticação com um nome de usuário e senha válidos.
     */
    @Test
    public void testValidLogin() {
        System.out.println("Executando testValidLogin...");
        boolean result = loginScreen.authenticate("usuario", "senha123");
        System.out.println("Resultado esperado: true, Resultado atual: " + result);
        assertTrue(result);
    }

    /**
     * Testa a autenticação com um nome de usuário e senha inválidos.
     */
    @Test
    public void testInvalidLogin() {
        System.out.println("Executando testInvalidLogin...");
        boolean result = loginScreen.authenticate("usuario", "senhaErrada");
        System.out.println("Resultado esperado: false, Resultado atual: " + result);
        assertFalse(result);
    }

    /**
     * Testa a autenticação com campos de nome de usuário e senha vazios.
     */
    @Test
    public void testEmptyFields() {
        System.out.println("Executando testEmptyFields...");
        boolean result = loginScreen.authenticate("", "");
        System.out.println("Resultado esperado: false, Resultado atual: " + result);
        assertFalse(result);
    }
}