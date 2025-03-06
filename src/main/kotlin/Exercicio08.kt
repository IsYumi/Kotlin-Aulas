/*

Exercicío 08 - [DESAFIO]
Escreva um programa em kotlin para calcular a redução do tempo de vida de um
fumante. Pergunte a quantidade de cigarros fumados por dias e quantos anos ele já fumou.
Considere que um fumante perde 10 min de vida a cada cigarro. Calcule quantos dias de vida um
fumante perderá e exiba o total em dias.

 */

fun smokingCalculator (smokingDays : Int, years : Int) : Int{
    return (years * 365 * smokingDays * 10 / 60 / 24);
}

fun main(){

    println("Quantos cigarros você fuma por dia: ");
    val smokingDays : Int = readln().toInt();

    println("Quantos anos faz que você fuma: ");
    val years : Int = readln().toInt();

    val cigarette : Int = smokingCalculator(smokingDays, years);

    println("Quantidade de cigarros fumados por dia: $smokingDays \nAnos que fumou: $years\nEstimativa de vida com base no fumo: $cigarette");
}