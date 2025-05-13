# 🎮 AluGames - Kotlin

Projeto desenvolvido durante os cursos da **Alura**, com o objetivo de praticar os fundamentos da linguagem **Kotlin**, o consumo de **APIs externas**, e o uso de recursos como leitura de entrada, controle de fluxo e tratamento de exceções.

Este projeto utiliza a API [CheapShark](https://www.cheapshark.com/api) para obter informações sobre jogos em promoção.

---

## 🚀 Funcionalidades

- ✅ Criação de projeto Kotlin com IntelliJ IDEA e Maven  
- ✅ Consumo da API CheapShark para buscar dados sobre jogos  
- ✅ Leitura de entrada do usuário com `Scanner`  
- ✅ Estruturas de decisão e repetição (`if`, `when`, `for`, `while`)  
- ✅ Tratamento de exceções com `try-catch`  
- ✅ Definição e uso de classes de dados (`data class`)  
- ✅ Orientação a objetos aplicada com boas práticas da linguagem Kotlin  

---

## 🧰 Tecnologias e ferramentas utilizadas

- **Kotlin**
- **IntelliJ IDEA**
- **Maven**
- **CheapShark API** ([Documentação](https://www.cheapshark.com/api))
- **Scanner** para entrada de dados no terminal
- **Bibliotecas de serialização JSON** (como `kotlinx.serialization`, se usada)

---

## 🛠️ Como executar o projeto

1. **Clone o repositório**
   ```bash
   git clone https://github.com/tomascubeiro/AluGames-Kotlin.git
   cd AluGames-Kotlin

2. **Abra o projeto no IntelliJ IDEA**

3. **Execute o projeto**

   * Certifique-se de que o Maven esteja configurado corretamente
   * Rode a aplicação pelo arquivo `Main.kt`

---

## 🔌 API Utilizada

A aplicação consome a [API CheapShark](https://www.cheapshark.com/api) para obter informações de jogos a partir de seus IDs.

### Exemplo de requisição:

```http
GET https://www.cheapshark.com/api/1.0/games?id=146
```

A resposta contém dados detalhados sobre o jogo, incluindo:

* Título do jogo
* Preço original
* Preço com desconto
* Porcentagem de desconto
* Loja onde o jogo está disponível

---

## 💡 Aprendizados

Durante o desenvolvimento do **AluGames**, os seguintes conceitos foram praticados:

* Estrutura básica de um projeto Kotlin com Maven
* Integração com APIs via requisições HTTP
* Serialização e deserialização de JSON
* Leitura de dados no terminal com `Scanner`
* Orientação a objetos com classes e `data class`
* Boas práticas com controle de fluxo e tratamento de erros

---

## 📁 Estrutura atual do projeto

```bash
AluGames-Kotlin/
└── src/
    └── main/
        └── kotlin/
            ├── Main.kt        # Classe principal da aplicação
            ├── Jogo.kt        # Classe que representa um jogo da API
            └── InfoJogo.kt    # Classe com informações detalhadas de um jogo
```

---

## 📷 Exemplo de execução

```text
Digite o ID do jogo que deseja buscar:
146

Título: Portal 2  
Preço original: $19.99  
Preço com desconto: $1.99  
Desconto: 90%  
Disponível na loja: Steam
```

---

## 📚 Créditos

Este projeto foi desenvolvido com base nos cursos da plataforma **Alura**, como parte da formação em Kotlin.

---

## 📝 Licença

Este projeto está licenciado sob os termos da licença **MIT**.
Consulte o arquivo [LICENSE](LICENSE) para mais informações.

```
