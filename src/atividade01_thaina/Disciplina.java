package atividade01_thaina;
import java.util.ArrayList;

public class Disciplina {
    private String nomeDisciplina;
    private static ArrayList<Aluno> listaAlunos = new ArrayList<Aluno>();

    Disciplina(String nomeDisciplina){
        this.nomeDisciplina = nomeDisciplina;
        
    }
     public static ArrayList<Aluno> getListaAlunos() {
        return listaAlunos;
    }
      
    public static ArrayList<Aluno> setListaAlunos(Aluno aluno) {
        listaAlunos.add(aluno);
        return listaAlunos;
    }

    public String getDisciplina() {
        return nomeDisciplina;
    }
   

    @Override
    public String toString() {
        return this.getDisciplina();
    }
}
