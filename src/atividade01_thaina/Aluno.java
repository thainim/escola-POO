package atividade01_thaina;

public class Aluno {

    private String nomeAluno;
    private int numeroMatriculaAluno;

    Aluno(String nomeAluno) {
        this.nomeAluno = nomeAluno;
        this.numeroMatriculaAluno = Escola.setNumeroMatriculaAluno();
        Escola.setTotalDeAlunos();
        Escola.setListaAlunos(this);
        for (int i = 0; i < Escola.getListaDisciplinas().size(); i++) {
            Disciplina nomedisciplina = Escola.getListaDisciplinas().get(i);
            nomedisciplina.setListaAlunos(this);
            System.out.println("Aluno " + this + ", está cursando: " + nomedisciplina );
        }
    }

    @Override
    public String toString() {
        return this.nomeAluno + ", com nº matricula " + this.numeroMatriculaAluno ;
    }

}
