package br.com.alura.alugames.modelo

import br.com.alura.alugames.utilitario.formatoComDuasCasasDecimais

class PlanoAvulso(
    tipo: String): Plano(tipo) {


    override fun obterValor(aluguel: Aluguel): Double {
        var valorOriginal = super.obterValor(aluguel)
        if (aluguel.gamer.media > 8) {
            valorOriginal -= valorOriginal * 0.1
        }
        return valorOriginal.formatoComDuasCasasDecimais()
    }
}
