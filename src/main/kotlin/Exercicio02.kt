/*

Exercício 02
Faça um programa em kotlin que leia a largura e altura de uma parede, calcule e mostre a área a ser
pintada e a quantidade de tinta necessária para o serviço, sabendo que cada litro de tinta pinta uma
área de 2 metros quadrados.

 */

fun wallPaint (area : Double) : Double {
    return (area / 2);
}

fun main(){

    println("Informe a largura da parede: ");
    var width : Double = readln().toDouble();

    println("Informe a altura da parede: ");
    var height : Double = readln().toDouble();

    var totalArea : Double = (width * height);
    println("O tamanho a ser pintado é $totalArea m²");

    var paintCan : Double = wallPaint(totalArea);
    println("Informações sobre a parede: \nLargura: $width m \nAltura: $height m \nÁrea total: $totalArea m² \nSerá usado $paintCan litros de tinta para ser pintada.");

}