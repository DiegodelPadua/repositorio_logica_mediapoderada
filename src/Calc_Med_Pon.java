import java.util.Scanner;
public class Calc_Med_Pon {
    public double nota1;
    public double nota2;
    public double nota3;
    public double pesoNota1; //nome de função é com letra minúscula.
    public double pesoNota2;
    public double pesoNota3;
    public double mediaFinal;
    public String nomeAluno;

    public void obterDadosDoAluno (){
        Scanner leitor = new Scanner(System.in);
        System.out.println("Dados do Aluno");
        System.out.println("---------------");
        System.out.println("Qual o seu Nome?");
        nomeAluno = leitor.nextLine();

        System.out.println("Qual o valor da Nota 1?");
        nota1 = leitor.nextDouble();
        System.out.println("Qual o valor do Peso 1?");
        pesoNota1 = leitor.nextDouble();

        System.out.println("Qual o valor da Nota 2?");
        nota2 = leitor.nextDouble();
        System.out.println("Qual o valor do Peso 2?");
        pesoNota2 = leitor.nextDouble();

        System.out.println("Qual o valor da Nota 3?");
        nota3 = leitor.nextDouble();
        System.out.println("Qual o valor do Peso 3?");
        pesoNota3 = leitor.nextDouble();





    }

    public class MediaEscolar() {


    }
    public void calcularMediaPonderadaDoAluno(){

        System.out.println("Calculando a média do aluno...");
        double somaNotasVersusPeso =
                (nota1*pesoNota1) + (nota2 * pesoNota2) + (nota3 * pesoNota3);
        double somaPesoDasNotas = pesoNota1 + pesoNota2 + pesoNota3;
        mediaFinal = somaNotasVersusPeso / somaPesoDasNotas;






    }
    public void ExibirMediaFinalDoAluno() {

        System.out.println();
        System.out.println("MEDIA FINAL DO ALUNO");
        System.out.println("A média ponderada do(a) aluno(a)" + nomeAluno + " é:" + mediaFinal);



    }
}
