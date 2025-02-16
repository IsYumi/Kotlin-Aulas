import java.text.DecimalFormat

/* Exercício 01
    Crie variáveis para salvar os seguintes dados de uma pessoa:
    1.Nome
    2.Sobrenome
    3.Peso
    4.Altura
    5.Possui avião?
    Em seguida imprima esses valores na tela do computador.
* */

fun main(){
    println("Informe o seu nome: ");
    var name : String = readln(); //Poderia ser imutável, pois o valor não é substituido

    println("Digite seu sobrenome: ");
    var lastName : String = readln();

    println("Seu peso: ");
    var weight : Float = readln().toFloat();

    println("Sua altura: ");
    var height : Float = readln().toFloat();

    println("Você possui um avião? ");
    var question : String = readln();

    var answer : Boolean = question.equals("Sim", ignoreCase = true) || question.equals("s", ignoreCase = true);

    var output = "Seu nome é $name $lastName, seu peso é ${"%.2f".format(weight)} e sua altura ${"%.2f".format(height)}. Você possui um avião? ";
    if (answer == true) {
        output += "Sim";
    } else {
        output += "Não";
    }

    println(output);
}