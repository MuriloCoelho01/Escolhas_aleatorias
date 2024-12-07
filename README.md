
# Escolhas Aleatórias 🎥🎞️

Este é um aplicativo Android que sorteia um gênero de filme aleatório e exibe uma imagem correspondente ao gênero selecionado. O usuário pode clicar em um botão para gerar um novo sorteio.

## Funcionalidades

- **Sortear Gênero de Filme**: O aplicativo apresenta um gênero de filme aleatório entre Ação, Aventura, Comédia, Terror, Romance e Suspense.
- **Exibição de Imagem**: Para cada gênero sorteado, uma imagem correspondente ao gênero é exibida.
- **Botão de Sorteio**: Ao clicar no botão "Sortear", o aplicativo sorteia um novo gênero de filme e exibe o resultado.
---
<img src="escolha_mockup.png" alt="Mockup do projeto">

---
## Tecnologias Utilizadas

- **Kotlin**: Linguagem de programação utilizada para o desenvolvimento.
- **Jetpack Compose**: Framework de UI utilizado para criar a interface do usuário.
- **Material 3**: Componentes de UI da biblioteca Material Design 3 para garantir uma aparência moderna e consistente.
- **Android Studio**: Ambiente de desenvolvimento utilizado para a criação do aplicativo.

## Estrutura do Código

### MainActivity
A `MainActivity` é a tela principal do aplicativo e contém a lógica para exibir o gênero sorteado e a imagem correspondente.

- **Inicio Composable**: Função composable que exibe o título, o gênero sorteado, a imagem correspondente e o botão para gerar um novo sorteio.
- **Estado de Sorteio**: O estado `teste` armazena o número do sorteio (de 1 a 6) e define o gênero e a imagem a ser exibida com base nesse número.

### Layout
- **Column**: Layout de coluna para organizar os elementos verticalmente.
- **Card**: Um cartão com o nome do gênero sorteado.
- **Image**: Exibe a imagem correspondente ao gênero sorteado.
- **Button**: Um botão para gerar um novo sorteio de gênero.


