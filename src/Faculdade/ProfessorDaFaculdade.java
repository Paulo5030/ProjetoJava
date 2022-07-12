package Faculdade;

public class ProfessorDaFaculdade extends EmpregadoDaFaculdade {
    private int horasDeAula;

    public double getGastos() {
        return this.getSalario() + horasDeAula * 10;
    }

    public String getInfo() {
        String informacaoBasica = super.getInfo();
        String informacao = informacaoBasica + "horas aula: " + this.horasDeAula;
        return informacao;
    }

}
