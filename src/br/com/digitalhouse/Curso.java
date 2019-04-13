package br.com.digitalhouse;

public class Curso {
    private String conjuntodeaulas;
    private String listadealunos;
    private String professorresponsavel;

    public void setConjuntodeAulas(String novoConjuntoAulas){
        novoConjuntoAulas = conjuntodeaulas;

    }

    public String getConjuntodeAulas() {
        return conjuntodeaulas;
    }

    public void setListaDeAlunos(String novaListaDeAlunos){
        novaListaDeAlunos = listadealunos;

    }

    public String getListaDeAlunos() {
        return listadealunos;
    }
    public void setProfessorReponsavel(String novoProfessorResponsavel){
        novoProfessorResponsavel = professorresponsavel;

    }

    public String getProfessorResponsavel() {
        return professorresponsavel;

    }

}
