package edu.thomas.primeirasemana;

public class TiposDeVariaveis {
    public static void main(String [] args){
       byte numeroChamada = 127;
        short idade = 45;
        int cep = 12345678;
        long cpf = 123456789012L ;
       double ano = 2024;
       float salario = 12345.67F;   
        char sexo = 'M';
        boolean verdadeiro = true;
        String nome = "Thomas é um fanfarrão";

        short numeroCurto = 1;
        int numeroNormal = numeroCurto;
        /*short numeroCurto2 = numeroNormal;*/ // isso não é possível, pois o int é maior que o short
        short numeroCurto2 = (short) numeroNormal; // fazendo um cast, ou seja, forçando a conversão mas com a variavel ainda dentro dos parametros
        
    }
}
