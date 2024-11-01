# Escolhas Aleatórias

Este é um aplicativo Android desenvolvido em Kotlin utilizando Jetpack Compose. Ele sorteia aleatoriamente um gênero de filme e exibe uma imagem correspondente ao gênero selecionado, proporcionando uma experiência divertida para os usuários que desejam escolher um filme para assistir.

## Funcionalidades

- **Sorteio Aleatório de Gênero:** Ao clicar no botão "Sortear", o aplicativo escolhe aleatoriamente um dos gêneros: Ação, Aventura, Comédia, Terror, Romance ou Suspense.
- **Imagem do Gênero Selecionado:** Cada gênero possui uma imagem associada, exibida na interface ao ser sorteado.
- **Interface Personalizada:** O aplicativo utiliza um background personalizado e um layout centralizado para uma experiência de usuário agradável.

## Tecnologias Utilizadas

- **Kotlin**
- **Jetpack Compose:** Framework de UI declarativa para criar interfaces de usuário responsivas e interativas.
- **Android Studio:** IDE usada para desenvolvimento.

## Estrutura do Código

### Arquivo Principal: `MainActivity.kt`

O arquivo `MainActivity.kt` define a estrutura principal do aplicativo e utiliza o tema `EscolhasAleatóriasTheme`. A função `Inicio` é o ponto central da interface de usuário, contendo:

- **Variáveis:**
  - `teste`: Mantém o estado do gênero sorteado.
  - `escolha`: Texto que exibe o gênero atual sorteado.
  - `fotos`: Armazena o recurso da imagem correspondente ao gênero sorteado.

- **Elementos de UI:**
  - `Text`: Exibe o título e o gênero sorteado.
  - `Image`: Mostra a imagem correspondente ao gênero atual.
  - `Button`: Botão "Sortear" que altera o estado do gênero ao ser pressionado.

## Como Executar o Projeto

1. Clone ou faça o download do repositório.
2. Abra o projeto no Android Studio.
3. Conecte um dispositivo Android ou inicie um emulador.
4. Compile e execute o aplicativo para testar as funcionalidades.

## Pré-visualização

O aplicativo apresenta uma interface onde o usuário pode ver o gênero sorteado e a imagem correspondente ao gênero. Abaixo está uma pré-visualização básica:

> **"O filme de hoje é: [Gênero]"**

A imagem do gênero sorteado é exibida abaixo da mensagem.

## Licença

Este projeto é de código aberto e pode ser modificado e distribuído conforme necessário. Consulte o arquivo de licença (se disponível) para mais informações.
