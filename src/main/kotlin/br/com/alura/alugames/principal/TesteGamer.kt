package br.com.alura.alugames.principal

import br.com.alura.alugames.modelo.Gamer

fun main() {
    val gamer1 = Gamer("Alura", "alura@gmail.com")
    println(gamer1)

    val gamer2 = Gamer(
        "Tomas",
        "tomas@gmail.com",
        "26/10/2002",
        "harden"
    )

    println(gamer2)

    gamer1.let {
        it.dataNascimento = "18/09/2000"
        it.usuario = "aluraskywalker"

    }.also {
        println(gamer1.idInterno)
    }

    println(gamer1)
    gamer1.usuario = "Alura"
    println(gamer1)
}