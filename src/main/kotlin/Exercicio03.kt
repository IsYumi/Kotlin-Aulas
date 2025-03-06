/*

Exercício 03
Desenvolva um programa em kotlin que leia os valores de A, B e C de uma equação do segundo
grau e mostre o valor de Delta. (formula Δ = b² – 4ac)

 */

import kotlin.math.*

fun equationSecondDegree (A : Float, B : Float, C : Float) : Float{
    return B.pow(2) - (4 * A * C);
}

fun main(){

    println("Insira o valor de A: ");
    var valueA : Float = readln().toFloat();

    println("Insira o valor de B: ");
    var valueB : Float = readln().toFloat();

    println("Insira o valor de C: ");
    var valueC : Float = readln().toFloat();

    var result : Float = equationSecondDegree(A = valueA, B = valueB, C = valueC);
    println("Seus valores serão mostrados a seguir:\nValor A: $valueA \nValor B: $valueB \nValor C: $valueC \nO resultado da equação de segundo grau é: $result");

}