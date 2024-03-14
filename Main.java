import java.util.Scanner;
public class Main {
    
    public static void main(String[] args){
        exercicio11();
    }
    //01: Verificar se um número é positivo, negativo ou zero ------- ARRUMAR
    public static void exercicio01(){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite um número para saber se positivo, negativo ou zero");
        int num = entrada.nextInt();
        entrada.close();
        
        if(num > 0 ){
            System.out.println("O número é positivo");
        } else if (num <0) {
            System.out.println("O numero é negativo");
        } else {
            System.out.println("O número é zero");
        }
    }
    //02: Imprimir os números pares de 1 a 10
    public static void exercicio02(){
        for (int i=1; i<10; i++){
            if((i%2==0)){
                System.out.println("Número "+i+" é par");
            }
        }
        
    }
    //03: Calcular o fatorial de um número
    public static void exercicio03(){
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        s.close();

        int fatorial = 1;
        for (int i = 1; i <= num; i++){
            fatorial *=i;
        }
        System.out.println("O fatorial do número "+num+" é "+fatorial);
    }
    //04: Verificar se um número é primo
    public static void exercicio04(){
        Scanner n = new Scanner(System.in);
        System.out.println("Digite um número");
        int num = n.nextInt();
        n.close();
        
        if(num==1){
            System.out.println("Não é primo");
        } else {
            for (int i=2 ; i<=Math.sqrt(num); i++){
                if(num % i == 0){
                    System.out.println("O número não é primo");
                } else {
                    System.out.println("O número é primo");
                    break;
                }
            }
        }
        
    }
    //05: Calcular o somatório dos números de 1 a 100
    public static void exercicio05(){
        int resultado = 0;
        for(int i=1; i<=100; i++){
            resultado +=i;
        }
        System.out.println(resultado);
    }
    //06: Verificar se um número é par ou ímpar utilizando switch-case
    public static void exercicio06(){
        Scanner n = new Scanner(System.in);
        System.out.println("Digite um número");
        int num = n.nextInt();
        int resultado = (num%2);
        n.close();

        switch (resultado) {
            case 0:System.out.println("O número é par");
                break;
                default: System.out.println("O número é ímpar");
                break;
        }
    }
    //07 -  Imprimir os números de 1 a 10 utilizando while
    public static void exercicio07(){
        int num = 0;
        while (num<10){
            num++;
            System.out.println(num);
        }
    }
    //08 - Calcular a média de 5 números usando for para solicitar cada um
    public static void exercicio08(){
        Scanner n = new Scanner(System.in);
        int num;
        int soma=0;
        double media=0;

        for(int i=1; i<=5; i++){
            System.out.println("Digite o "+i+"º numero");
            num=n.nextInt();
            soma+=num;
            media= (soma/5);
            n.close();
        }
        System.out.println("O resultado é da média é "+media);
    }
    //09 - Contar de 10 a 1 utilizando for
    public static void exercicio09(){
        int resultado;
        for(int i=10; i>0 ; i--){
            resultado=i;
            System.out.println(i);
        }
    }
    //10 - Verificar se um ano é bissexto ou não
    public static void exercicio10(){
        Scanner n = new Scanner(System.in);
        System.out.println("Digite um ano para verificarmos se é bissexto");
        int ano = n.nextInt();

        if(ano%4==0){
            System.out.println("O ano é bissexto!");
        } else{
            System.out.println("O ano não é bissexto!");
        }
    }
    /*11 - Escreva um programa que, com base em uma temperatura em graus celsius, a converta e exiba em Kelvin (K), Réaumur (Re), Rankine (Ra) e Fahrenheit (F), seguindo as fórmulas:
F = C * 1.8 + 32;
K = C + 273.15;
Re = C * 0.8;
Ra = C * 1.8 + 32 + 459.67

Utilizando SWITCH, ou seja, o usuario precisa selecionar qual a conversao desejada.*/
    public static void exercicio11(){
        Scanner entrada = new Scanner (System.in);
        System.out.println("Quantos graus está fazendo hoje?");
        double graus = entrada.nextDouble();

        System.out.println("Em qual escala você quer saber quantos graus está fazendo? Digite:\n1 - Kelvin\n2 - Fahrenheit\n3 - Réaumur\n4 - Rankine");
        int escala = entrada.nextInt();

        switch (escala){
            case 1: System.out.println("Em Kelvin hoje fazem "+(graus+273.15)+"º");
            break;
            case 2: System.out.println("Em Fahrenheit hoje fazem "+((graus*1.8)+32)+"º");
            break;
            case 3: System.out.println("Em Réaumur hoje fazem "+(graus*0.8)+"º");
            break;
            case 4: System.out.println("Em Rankine hoje fazem "+(((graus*1.8)+32)+459.67)+"º");
        }
    }
}

