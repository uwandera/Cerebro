package edu.thomas.primeirasemana;
public class MinhaPrimeiraClasse {

    
public static void main(String [] args){
    int ano = 2025;

    ano = 2024;

    final String BR = "Brasil"; //variaveis constantes sempre são em letras maiusculas o final seta a  variavel para o valor fixo

    String meuNome = "TAKASHI"; //tem que ser input do usuario

    String sobrenome = "SOUZA"; //tem que ser input do usuario

    int anoFabricacao = 1969;  //camel case para nomes compostos

    boolean seraSeVira = true;

    String nomeCompleto = nomeCompleto(meuNome, sobrenome);
    System.out.println(nomeCompleto);



/*  
    int numero&um = 1; //Os únicos símbolos permitidos são _ e $
    int 1numero = 1;    //Uma variável não pode começar com númerico
    int numero um = 1; //Não pode ter espaço no nome da variável
    int long = 1; //long faz parte das palavras reservadas da linguagem
*/
 
}

public static String nomeCompleto(String meuNome, String sobrenome){
   
    return "Resultado do método " + meuNome.concat(" ").concat(sobrenome);
}
/*  
Não recomendado

double salMedio = 1500.23  //variável abreviada, o que dificulta a compreensão
String emails = "aluno@escola.com" //confuso se a variável seria um array ou único e-mail
String myName = "JOSEPH" //se idioma pt-BR, o valor poder ser de outro idioma mas o nome da variável não 

Recomendado

double salarioMedio=1500.23;
String email ="aluno@escola.com";
String [] emails = {"aluno@escola.com","professor@escola.com"}
String meuNome = "JOSEPH" 
*/

}