/*

Exercício 07
Crie um programa kotlin que leia o número de dias trabalhados em um mês e mostre o salário de um
funcionário, sabendo que ele trabalha 8 horas por dia e ganha R$25 por hora trabalhada.

 */

fun main(){

    println("Informe a quantidade de dias trabalhados: ")
    val dayWork : Int = readln().toInt();

    if (dayWork in 0..31){
        val finalWage : Int = (dayWork * 8 * 25);
        println("Quantidade de dias trabalhados: $dayWork \nCálculo do salário mensal: R$$finalWage.00");
    } else {
        println("O mês possui no máximo 31 dias. Tente novamente.");
    }

}
