package br.com.alura.alugames.modelo

data class Aluguel(
    val gamer: Gamer,
    val jogo: Jogo,
    val periodo: Periodo) {
    val valorDoAluguel = gamer.plano.obterValor(this)


    override fun toString(): String {
        return "O preço do aluguel do jogo ${jogo.titulo}, alugado por ${gamer.nome} é de: R$$valorDoAluguel \n"
    }
}


