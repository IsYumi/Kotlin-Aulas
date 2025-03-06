/*

Exercício 01
Faça um programa em Kotlin que leia quanto dinheiro uma pessoa tem na carteira (em R$) e mostre
quantos dólares ela pode comprar. Considere US$1,00 = R$5,75.

*/


fun conversion (brl : Double):Double{
    return (brl * 5.75);
}

fun main (){

    println("Valor atual na carteira: ");
    var wallet : Double = readln().toDouble();

    var resultDollar : Double = conversion(wallet);

    println("Você possui R$ ${"%.2f".format(wallet)} em sua carteira. Convertendo para dólar US$ ${"%.2f".format(resultDollar)}");

}