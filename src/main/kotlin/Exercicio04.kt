/*

Exercício 04
Crie um programa em Kotlin que leia o preço de um produto, calcule e mostre o seu PREÇO
PROMOCIONAL, com 5% de desconto.

 */

fun promotionalPrice (price : Float) : Float{
    return (price * 5/100);
}

fun main(){

    println("Insira o nome do produto: ")
    val nameProduct : String = readln();

    println("Insira o preço do produto: ");
    val price : Float = readln().toFloat();

    val promotionalProduct = promotionalPrice(price);

    val finalPrice = (price - promotionalProduct);

    println("Produto escolhido: $nameProduct \nPreço original: R$${"%.2f".format(price)} \nDesconto obtido: R$${"%.2f".format(promotionalProduct)} \nPreço final com desconto incluso: R$${"%.2f".format(finalPrice)}");

}