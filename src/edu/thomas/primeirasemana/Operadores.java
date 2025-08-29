package edu.thomas.primeirasemana;

public class Operadores {
    public static void main(String [] args){
        int a = 10;
        int b = 10;
        System.out.println("\nSoma: " + somama(a, b));
        System.out.println("Subtração: " + subtracaocao(a, b));
        System.out.println("Multiplicação: " + multiplicacaocao(a, b));
        System.out.println("divisão: " + divisaosao(a, b));
        System.out.println("Módulo: " + modulo(a, b));
        System.out.println("Incremento: " + incremento(a));
        System.out.println("Decremento: " + decremento(b));
        System.out.println("Incremento2: " + incremento2(a));
        System.out.println("Decremento2: " + decremento2(b));
        System.out.println("Maior que: " + maiorQue(a, b));
        System.out.println("Menor que: " + menorQue(a, b));
        System.out.println("Maior igual que: " + maiorIgualQue(a, b));
        System.out.println("Menor igual que: " + menorIgualQue(a, b));
        System.out.println("Igual: " + igual(a, b));
        System.out.println("Diferente: " + diferente(a, b));
        System.out.println("E booleano: " + eboleano(a, b));
        System.out.println("OU booleano: " + oubooleano(a, b));
        System.out.println("Nega: " + nega(true));
        System.out.println("Atribuição: " + atribuicao(a, b));
        System.out.println("Atribuição2: " + atribuicao2(a, b));
        System.out.println("Atribuição3: " + atribuicao3(a, b));
        System.out.println("Atribuição4: " + atribuicao4(a, b));
        System.out.println("Atribuição5: " + atribuicao5(a, b));
        System.out.println("Precedência: " + precedencia(a, b, 2));
        

    }
    
    public static int somama(int a, int b){
        return a + b;
    }

    public static double subtracaocao(double a, double b){
        return a - b;
    }

    public static double multiplicacaocao(double a, double b){
        return a * b;
    }

    public static double divisaosao(double a, double b){
        return a / b;
    }

    public static int modulo(int a, int b){
        return a % b;
    }

    public static int incremento(int a){
        return ++a;
    }
    public static int decremento(int a){
        return --a;
    }
    public static int incremento2(int a){
        return a++;
    }
    public static int decremento2(int a){
        return a--;
    }
    public static boolean maiorQue(int a, int b){
        return a > b;
    }
    public static boolean menorQue(int a, int b){
        return a < b;
    }  
    public static boolean maiorIgualQue(int a, int b){
        return a >= b;
    }
    public static boolean menorIgualQue(int a, int b){
        return a <= b;
    }
    public static boolean igual(int a, int b){
        return a == b;
    }
    public static boolean diferente(int a, int b){
        return a != b;
    }
    public static boolean eboleano(int a, int b){
        return (a > 0) && (b > 0);
    }
    public static boolean oubooleano(int a, int b){
        return (a > 0) || (b > 0);
    }
    public static boolean nega(boolean a){
        return !a;
    }
    public static int atribuicao(int a, int b){
        return a += b;
    }
    public static int atribuicao2(int a, int b){
        return a -= b;
    }
    public static int atribuicao3(int a, int b){
        return a *= b;
    }
    public static int atribuicao4(int a, int b){
        return a /= b;
    }
    public static int atribuicao5(int a, int b){
        return a %= b;
    }
    public static int precedencia(int a, int b, int c){
        return a + b * c;
    }
  

}
