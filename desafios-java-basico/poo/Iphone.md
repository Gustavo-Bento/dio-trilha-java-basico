# Diagrama UML do iPhone

O diagrama a seguir representa as funcionalidades do iPhone como Reprodutor Musical, Aparelho Telefônico e Navegador na Internet.

```mermaid
classDiagram
    class ReprodutorMusical {
        <<interface>>
        + tocar(): void
        + pausar(): void
        + selecionarMusica(musica: String): void
    }
    
    class AparelhoTelefonico {
        <<interface>>
        + ligar(numero: String): void
        + atender(): void
        + iniciarCorreioVoz(): void
    }
    
    class NavegadorInternet {
        <<interface>>
        + exibirPagina(url: String): void
        + adicionarNovaAba(): void
        + atualizarPagina(): void
    }
    
    class iPhone {
        + tocar(): void
        + pausar(): void
        + selecionarMusica(musica: String): void
        + ligar(numero: String): void
        + atender(): void
        + iniciarCorreioVoz(): void
        + exibirPagina(url: String): void
        + adicionarNovaAba(): void
        + atualizarPagina(): void
    }
    
    ReprodutorMusical <|.. iPhone
    AparelhoTelefonico <|.. iPhone
    NavegadorInternet <|.. iPhone
```