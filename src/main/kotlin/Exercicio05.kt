/*

Exercício 05
Faça um programa em kotlin que leia o salário de um funcionário, calcule e mostre o seu novo salário,
com 15% de aumento.

 */

fun calculationSalaryEmployee (salary : Float) : Float{
    return (salary * 15/100);
}

fun main(){

    println("Insira o cargo: ");
    val position : String = readln();

    println("Informe o salário: ")
    val salary : Float = readln().toFloat();

    val increase = calculationSalaryEmployee(salary);

    val newSalary = (increase + salary);

    println("Informações salvas: \nCargo: $position \nSalário atual: R$ ${"%.2f".format(salary)} \nAumento de 15%: R$ ${"%.2f".format(increase)} \n Salário atualizado: R$ ${"%.2f".format(newSalary)}");

}