package atividade01_thaina;

public class Professor {

    private String nomeProfessor;
    private Disciplina disciplina;
    private int numeroMatriculaProfessor;

    Professor(String nomeProfessor, String disciplina) {
        this.disciplina = new Disciplina(disciplina);
        this.nomeProfessor = nomeProfessor;
        this.numeroMatriculaProfessor = Escola.setNumeroMatriculaProfessor();
        Escola.setTotalDeProfessores();
        Escola.setListaDisciplinas(this.disciplina);
        Escola.setListaProfessores(this);
    }
    

    @Override
    public String toString() {
        return this.nomeProfessor + ", com nº matricula " + this.numeroMatriculaProfessor + ", Ministra disciplina: " + this.disciplina.getDisciplina();
    }
}
