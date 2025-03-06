/*

Exercício 06
A locadora de carros precisa da sua ajuda para cobrar seus serviços. Escreva um programa em kotlin
que pergunte a quantidade de Km percorridos por um carro alugado e a quantidade de dias pelos
quais ele foi alugado.
Calcule o preço total a pagar, sabendo que o carro custa R$ 90,00 por dia e
R$ 0,20 por Km rodado.

 */

fun feeCar (day : Int, km : Float) : Double{
    return (90 * day + 0.20 * km);
}

fun main(){

    println("Deseja alugar por quantos dias? ");
    val days : Int = readln().toInt();

    println("Insira os km percorridos: ");
    val km : Float = readln().toFloat();

    val priceTotal = feeCar(days, km);

    println("Alugado por: $days dias \nKm percorridos: $km km\nPreço total a pagar: R$ ${"%.2f".format(priceTotal)}");

}


