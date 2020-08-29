package Notas;

import java.util.Scanner;

import javax.xml.namespace.QName;

public class Disciplina
{
    public static void main( String[] args )
    {
        Scanner leitor = new Scanner(System.in);

        Aluno aluno[] = new Aluno[10];

        for(int a = 0; a < aluno.length; a++)
        {
            System.out.println("\nDIGITE O NOME DO ALUNO: ");
            String nome = leitor.next();
            aluno[a] = new Aluno(nome);

            System.out.println("\nDIGITE A NOTA DO GRAU A: ");
            double grauA = leitor.nextDouble();
            System.out.println("\nDIGITE A NOTA DO GRAU B: ");
            double grauB = leitor.nextDouble();

            aluno[a].adicionaNotas(grauA, grauB);
            aluno[a].calculaMedia();
        }



        //Laço para imprimir alunos e suas notas e médias.
        
        System.out.println( "\nEstudante      A          B        Média");
        for(int i = 0; i<aluno.length; i++)
        {
            System.out.println(aluno[i].getNome()+"        "+aluno[i].getGrauA()+"        "+aluno[i].getGrauB()+"        "+aluno[i].getMedia());
        }

        
        
        //Laço para fazer a média de todos os alunos.
        
        double somaDasMédias = 0;
        double médiaGeral = somaDasMédias/aluno.length;

        for(int i = 0; i<aluno.length; i++)
        {
            somaDasMédias = somaDasMédias + aluno[i].getMedia();
        }



        //Laço para encontrar a menor média

        double menorMédia = 100;
        for(int i = 0; i<aluno.length; i++)
        {
            if(aluno[i].getMedia() < menorMédia)
            {
                menorMédia = aluno[i].getMedia();
            }            
        }



        //Laço para encontrar a maior média

        double maiorMédia = 0;
        for(int i = 0; i<aluno.length; i++)
        {
            if(aluno[i].getMedia() > maiorMédia)
            {
                maiorMédia = aluno[i].getMedia();
            }            
        }
        


        //Laço para encontrar a menor nota

        double menorNota = 100;
        for(int i = 0; i<aluno.length; i++)
        {
            if(aluno[i].menorNota() < menorNota)
            {
                menorNota = aluno[i].menorNota();
            }            
        }



        //Laço para encontrar a MAIOR nota

        double maiorNota = 0;
        for(int i = 0; i<aluno.length; i++)
        {
            if(aluno[i].maiorNota() > maiorNota)
            {
                maiorNota = aluno[i].maiorNota();
            }            
        }


        System.out.println(
            "\n\nMEDIAS\n"+
        "Media geral: "+somaDasMédias/aluno.length+
        "\nMenor media: "+menorMédia+
        "\nMaior media: "+maiorMédia+
        "\n\nMenor nota: "+menorNota+
        "\nMaior nota: "+maiorNota);

        
        leitor.close();
    }
}
