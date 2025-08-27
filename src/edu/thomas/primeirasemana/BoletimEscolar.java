package edu.thomas.primeirasemana;
public class BoletimEscolar{ //classe principal

    public static void main(String [] args){//metodo principal
    //declaração de variaveis
        String nome = "TAKASHI"; //tem que ser input do usuario
        String sobrenome = "SOUZA"; //tem que ser input do usuario
        String nomeCompleto = nomeAluno(nome, sobrenome);

        int nota1 = 7;
        int nota2 = 4;  
        int nota3 = 8;
    //fluxo   
        if ((nota1 + nota2 + nota3) / 3 >= 7)
            System.out.println("\nO aluno: "+nomeCompleto+" Aprovado");
        
        else if ((nota1 + nota2 + nota3) / 3 < 7 && (nota1 + nota2 + nota3) / 3 >= 5)
            System.out.println("\nO aluno: "+nomeCompleto+" em Recuperação");
        else 
            System.out.println("\nO aluno: "+nomeCompleto+" Reprovado");
        
    }

    public static String nomeAluno(String nome, String sobrenome){//metodo secundario 
   
        return nome.concat(" ").concat(sobrenome);
    }
















}
