package br.com.digitalhouse;

public class Aula extends Materia{
    private String horarioinicio;
    private String horariofinal;

    public void setHorarioIncio(String novoHorarioInicio){
        novoHorarioInicio = horarioinicio;

    }

    public String getHorarioInicio() {
        return horarioinicio;
    }

    public void setHorarioFinal(String novoHorarioFinal){
        novoHorarioFinal = horariofinal;

    }

    public String getHorariofinal() {
        return horariofinal;
    }
}
