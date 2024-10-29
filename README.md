# 🖥️ SikuliX Automation - Java Commands

Projeto utilizando **SikuliX** que podem ser utilizados em scripts java para automação de tarefas com base em imagens.

## ⚙️ Instalação

### Requisitos:
- Java Development Kit (JDK)
- SikuliX IDE ou Bibliotecas SikuliX
- Editor de código compatível com ```java``` (Ex: IntelliJ IDEA, Eclipse)

### 📦 Importação de Bibliotecas

Para usar o **SikuliX** em ```java```, é necessário importar as bibliotecas relevantes. Adicione as seguintes dependências ao seu projeto:

```java
import org.sikuli.script.*;
```
## 🛠️ Comandos Básicos
### 🔍 1. Localizar Imagens
find(String imagePath): Localiza uma imagem na tela.

```java
Screen screen = new Screen();
screen.find("path/to/image.png");
```

exists(String imagePath): Verifica se uma imagem existe na tela. Retorna true se a imagem for encontrada.

```java
if (screen.exists("path/to/icon.png") != null) {
    System.out.println("Ícone encontrado.");
}
```

## 🖱️ 2. Clique e Ações do Mouse
click(String imagePath): Clica na imagem localizada.

```java
screen.click("path/to/button.png");
```
doubleClick(String imagePath): Realiza um clique duplo na imagem.
```java
screen.doubleClick("path/to/icon.png");
```

rightClick(String imagePath): Realiza um clique com o botão direito na imagem.

```java
screen.rightClick("path/to/file.png");
```

## 🖲️ 3. Movimento do Mouse
hover(String imagePath): Move o ponteiro do mouse para a imagem sem clicar.

```java
screen.hover("path/to/menu.png");
```

dragDrop(String sourceImage, String targetImage): Arrasta um elemento de uma imagem para outra.

```java
screen.dragDrop("path/to/file.png", "path/to/folder.png");
```

## ⌨️ 4. Entrada de Texto
type(String text): Digita texto no campo focado.

```java
screen.type("Texto para digitar.");
```

type(String imagePath, String text): Clica em uma imagem e digita o texto.

```java
screen.type("path/to/textfield.png", "Texto a ser inserido.");
```

paste(String text): Cola o texto diretamente no campo focado.
```java
screen.paste("Texto colado diretamente.");
```
## ⌨️ 5. Teclas Especiais
type(Key key): Simula pressionamento de teclas especiais (como Enter, Tab, etc).

```java
screen.type(Key.ENTER);
screen.type(Key.TAB);
```
type(String text, KeyModifier modifier): Digita com modificadores como Ctrl, Alt ou Shift.

```java
screen.type("a", KeyModifier.CTRL); // Simula Ctrl + A
```

## 🚀 6. Controle de Aplicações
App.open(String path): Abre um aplicativo a partir do caminho completo.

```java
App.open("C:\\Program Files\\Mozilla Firefox\\firefox.exe");
```

App.focus(String appName): Traz o aplicativo especificado para o foco.

```java
App.focus("Firefox");
```

App.close(String appName): Fecha um aplicativo.

```java
App.close("Firefox");
```
## ⏳ 7. Tempo e Espera
wait(String imagePath, int seconds): Espera até que uma imagem apareça na tela por um tempo determinado.

```java
screen.wait("path/to/image.png", 10); // Espera até 10 segundos
```

waitVanish(String imagePath, int seconds): Espera até que uma imagem desapareça da tela.

```java
screen.waitVanish("path/to/loading.png", 15); // Espera até 15 segundos para a imagem sumir
```

sleep(int seconds): Pausa a execução por um tempo definido.

```java
Thread.sleep(2000); // Pausa por 2 segundos
```

## 🖼️ 8. Gerenciamento de Regiões
Region: Define uma área específica da tela para focar as operações de clique e busca de imagens.

```java
Region region = new Region(0, 0, 300, 200); // Define uma região
region.click("path/to/button.png");         // Clica dentro da região
```

## 📸 9. Captura de Tela
screen.capture(): Captura uma imagem da tela inteira.

```java
screen.capture();
```
screen.capture(Region region): Captura uma imagem de uma região específica da tela.

```java
screen.capture(new Region(0, 0, 500, 500)); // Captura uma região de 500x500 pixels
```
## 💬 10. Mensagens e Logs
popup(String message): Exibe uma janela pop-up com uma mensagem.

```java
popup("Operação completa!");
```

System.out.println(): Exibe uma mensagem no console.
```java
System.out.println("Processo iniciado");
```

🎯 Exemplo Completo
Aqui está um exemplo completo que demonstra alguns dos principais comandos do SikuliX em um script:

```java
import org.sikuli.script.*;

public class SikuliAutomation {
    public static void main(String[] args) {
        try {
            Screen screen = new Screen();
            
            // Abrir um aplicativo
            App.open("C:\\Program Files\\Mozilla Firefox\\firefox.exe");
            
            // Esperar até que o navegador abra e clique no campo de URL
            screen.wait("path/to/url_bar.png", 10);
            screen.click("path/to/url_bar.png");
            
            // Digitar uma URL
            screen.type("www.example.com" + Key.ENTER);
            
            // Esperar o site carregar e fazer algo
            screen.wait("path/to/element.png", 10);
            screen.click("path/to/element.png");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
```

## 💡 Dicas de Uso
* Precisão de Imagem: Use imagens de alta qualidade para garantir que o SikuliX localize os elementos corretamente.

* Espera de Tempo: Ajuste os tempos de espera (wait(), sleep()) conforme a performance de seu sistema.

* Tolerância de Similaridade: Se as imagens mudarem levemente, você pode ajustar a precisão usando similar().