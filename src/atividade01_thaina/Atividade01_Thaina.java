package atividade01_thaina;
/**
 *
 * @author thaina
 */
public class Atividade01_Thaina {

    public static void main(String[] args) {

        Professor Prof01 = new Professor("Maria", "matematica");
        Professor Prof02 = new Professor("Joao", "geografia");
        System.out.println("Professores " + Escola.getListaProfessores());
        System.out.println("Disciplinas Cadastradas " + Escola.getListaDisciplinas());
        Aluno Alu01 = new Aluno("Mariazinha");
        Aluno Alu02 = new Aluno("Joaozinho");
        Aluno Alu03 = new Aluno("Juquinha");
        System.out.println("Alunos: " + Escola.getListaAlunos());
       
        
    }

}
