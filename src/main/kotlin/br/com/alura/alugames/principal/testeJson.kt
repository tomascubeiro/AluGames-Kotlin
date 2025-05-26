package br.com.alura.alugames.principal

import br.com.alura.alugames.servicos.ConsumoApi

fun main() {
    val consumo = ConsumoApi()
    val listaGamers = consumo.buscaGamers()
    val listaJogosJson = consumo.buscaJogosJson()

//    println(listaGamers)
//    print(listaJogosJson)

    val gamer1 = listaGamers.get(5)
    val jogo1 = listaJogosJson.get(10)

    println(gamer1)
    println(jogo1)
}