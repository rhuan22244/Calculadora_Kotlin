// Definindo a interface Operacao
interface Operacao {
    fun executar(numeros: List<Double>): Double
}

// Implementação da operação de Soma
class Soma : Operacao {
    override fun executar(numeros: List<Double>): Double {
        return numeros.sum()
    }
}

// Implementação da operação de Subtração
class Subtracao : Operacao {
    override fun executar(numeros: List<Double>): Double {
        return numeros.reduce { acumulador, numero -> acumulador - numero }
    }
}

// Implementação da operação de Multiplicação
class Multiplicacao : Operacao {
    override fun executar(numeros: List<Double>): Double {
        return numeros.reduce { acumulador, numero -> acumulador * numero }
    }
}

// Implementação da operação de Divisão
class Divisao : Operacao {
    override fun executar(numeros: List<Double>): Double {
        return numeros.reduce { acumulador, numero -> acumulador / numero }
    }
}

// Classe Calculadora que encapsula o uso das operações
class Calculadora {
    fun calcular(operacao: Operacao, numeros: List<Double>): Double {
        return operacao.executar(numeros)
    }
}

// Função principal que utiliza a Calculadora
fun main() {
    val calculadora = Calculadora()

    // Criando listas de números
    val numeros = listOf(10.0, 2.0, 3.0)

    // Somando
    val resultadoSoma = calculadora.calcular(Soma(), numeros)
    println("Soma: $resultadoSoma")

    // Subtraindo
    val resultadoSubtracao = calculadora.calcular(Subtracao(), numeros)
    println("Subtração: $resultadoSubtracao")

    // Multiplicando
    val resultadoMultiplicacao = calculadora.calcular(Multiplicacao(), numeros)
    println("Multiplicação: $resultadoMultiplicacao")

    // Dividindo
    val resultadoDivisao = calculadora.calcular(Divisao(), numeros)
    println("Divisão: $resultadoDivisao")
}
