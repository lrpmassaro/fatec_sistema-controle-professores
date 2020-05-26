/*
 * Classe que implementa um controlador de objetos de classe Aluno
 */
package controller;

import java.util.ArrayList;
import model.Professor;

public class ProfessoresController {
    
    // declaração de variáveis de instância
    private ArrayList<Professor> professores = new ArrayList();

    // método para salvar os dados de objetos Aluno
    public boolean salvar(Professor professor) {
        if (professor != null) {
            professores.add(professor);
            return true;
        } else {
            return false;
        }
    }
    
}
