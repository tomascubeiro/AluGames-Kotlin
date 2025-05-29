package br.com.alura.alugames.modelo

class PlanoAssinatura(
    tipo: String,
    val mensalidade: Double,
    val jogosIncluidos: Int): Plano(tipo) {

    override fun obterValor(aluguel: Aluguel): Double {
        val totalJogosNoMes = aluguel.gamer.jogosDoMes(aluguel.periodo.dataInicial.monthValue).size

        if(totalJogosNoMes <= jogosIncluidos){
            return 0.0
        } else {
            val valorOriginal = super.obterValor(aluguel)
            return valorOriginal
        }
    }

    }
