package atividade01_thaina;
import java.util.ArrayList;

public class Escola {

    private static int totalDeAlunos = 0;
    private static int totalDeAProfessores = 0;
    private static int numeroMatriculaAluno = 100;
    private static int numeroMatriculaProfessor = 500;
    private static ArrayList<Disciplina> listaDisciplinas = new ArrayList<Disciplina>();
    private static ArrayList<Professor> listaProfessores = new ArrayList<Professor>();
    private static ArrayList<Aluno> listaAlunos = new ArrayList<Aluno>();

    public static ArrayList<Disciplina> getListaDisciplinas() {
        return listaDisciplinas;
    }
      
    public static ArrayList<Disciplina> setListaDisciplinas(Disciplina disciplina) {
        listaDisciplinas.add(disciplina);
        return listaDisciplinas;
    }

    public static ArrayList<Aluno> setListaAlunos(Aluno dadosAlunos) {
        listaAlunos.add(dadosAlunos);
        return listaAlunos;
    }
    public static ArrayList<Aluno> seatListaAlunos(int i,Aluno dadosAlunos) {
        listaAlunos.set(i,dadosAlunos);
        return listaAlunos;
    }

    public static ArrayList<Aluno> getListaAlunos() {
        return listaAlunos;
    }

    public static int setTotalDeAlunos() {
        totalDeAlunos++;
        return Escola.totalDeAlunos;
    }

    public static int getTotalDeAlunos() {
        return totalDeAlunos;
    }

    public static int setNumeroMatriculaAluno() {
        numeroMatriculaAluno++;
        return numeroMatriculaAluno;
    }

    public static ArrayList<Professor> setListaProfessores(Professor dadosProfessores) {
        listaProfessores.add(dadosProfessores);
        return listaProfessores;
    }

    public static ArrayList<Professor> getListaProfessores() {
        return listaProfessores;
    }

    public static int setTotalDeProfessores() {
        totalDeAlunos++;
        return Escola.totalDeAlunos;
    }

    public static int getTotalDeProfessores() {
        return totalDeAlunos;
    }

    public static int setNumeroMatriculaProfessor() {
        numeroMatriculaProfessor++;
        return numeroMatriculaProfessor;
    }

    
}
