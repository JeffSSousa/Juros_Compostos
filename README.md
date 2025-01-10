# Projeto: Cálculo de Juros Compostos

```Projeto em desenvolvimento```

Este é um projeto desenvolvido em Java utilizando o Maven para gerenciamento de dependências. O objetivo é realizar simulações de cálculo de juros compostos, ideal para estudantes e profissionais de finanças. Além disso, o projeto permite a manipulação de arquivos Excel, tornando-o mais versátil para aplicações financeiras e relatórios personalizados.

# Autor

**Jefferson Silva de Sousa**


# Tecnologias Utilizadas

+ **Linguagem**: Java SE 17 ou superior
+ **Gerenciamento de dependências**: Maven
+ **Bibliotecas externas**:
     + **Apache POI**: Manipulação de arquivos Excel (leitura e escrita).
        + `org.apache.poi:poi`
        + `org.apache.poi:poi-ooxml`
     + XmlBeans: Manipulação de arquivos XML.
        + `org.apache.xmlbeans:xmlbeans`

# Funcionalidades

+ Cálculo de juros compostos com aportes mensais.
+ Manipulação de relatórios financeiros em formato Excel.

# Pré-requisitos

1. Ter o Java 17 ou superior instalado.
2. Ter o Maven instalado e configurado no ambiente.

# Como executar o projeto

1. Clone o repositório no git bash:

```bash
git clone git@github.com:JeffSSousa/Juros_Compostos.git
cd projeto-juros-compostos
```
2. Compile e execute o projeto com Maven:

```bash
mvn clean install
mvn exec:java -Dexec.mainClass="Application.Program"
```

# Bibliotecas (dependências Maven)

```xml
<dependencies>
    <!-- Apache POI para manipulação de Excel -->
    <dependency>
        <groupId>org.apache.poi</groupId>
        <artifactId>poi</artifactId>
        <version>5.2.3</version>
    </dependency>
    <dependency>
        <groupId>org.apache.poi</groupId>
        <artifactId>poi-ooxml</artifactId>
        <version>5.2.3</version>
    </dependency>
    
    <!-- XmlBeans para manipulação de XML -->
    <dependency>
        <groupId>org.apache.xmlbeans</groupId>
        <artifactId>xmlbeans</artifactId>
        <version>5.1.1</version>
    </dependency>
</dependencies>
```

# Contribuições
Contribuições são bem-vindas! Sinta-se à vontade para abrir issues ou enviar pull requests.