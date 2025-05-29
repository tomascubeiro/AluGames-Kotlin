package br.com.alura.alugames.principal

import br.com.alura.alugames.modelo.Periodo
import br.com.alura.alugames.modelo.PlanoAssinatura
import br.com.alura.alugames.servicos.ConsumoApi
import java.time.LocalDate

fun main() {
    val consumo = ConsumoApi()
    val listaGamers = consumo.buscaGamers()
    val listaJogosJson = consumo.buscaJogosJson()

//    println(listaGamers)
//    print(listaJogosJson)

    val gamerCamila = listaGamers.get(5)
    val jogoREVillage = listaJogosJson.get(10)
    val jogoSpider = listaJogosJson.get(13)
    val jogoTLOU = listaJogosJson.get(2)

//    println(gamerCamila)
//    println(jogoREVillage)

    val periodo1 = Periodo(LocalDate.now(), LocalDate.now().plusDays(7))
    val periodo2 = Periodo(LocalDate.now(), LocalDate.now().plusDays(3))
    val periodo3 = Periodo(LocalDate.now(), LocalDate.now().plusDays(10))
    val periodo4 = Periodo(LocalDate.of(2023, 8, 2), LocalDate.of(2023, 8, 15))

    gamerCamila.alugaJogo(jogoREVillage, periodo1)
    gamerCamila.alugaJogo(jogoSpider, periodo2)
    gamerCamila.alugaJogo(jogoTLOU, periodo3)
    gamerCamila.alugaJogo(jogoSpider, periodo4)

    println(gamerCamila.jogosDoMes(5))

    val gamerGuilherme = listaGamers.get(2)
    gamerGuilherme.plano = PlanoAssinatura("PRATA", 9.90, 3)

    gamerGuilherme.alugaJogo(jogoREVillage, periodo1)
    gamerGuilherme.alugaJogo(jogoSpider, periodo2)
    gamerGuilherme.alugaJogo(jogoTLOU, periodo3)
    println(gamerGuilherme.jogosAlugados)
}