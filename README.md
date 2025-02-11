# Desafio Back-end PicPay

Primeiramente, obrigado pelo seu interesse em trabalhar na melhor plataforma de pagamentos do mundo! Abaixo você encontrará todas as informações necessárias para iniciar o seu teste.

---

## 🚀 Avisos antes de começar

- Leia com atenção este documento todo e tente seguir ao máximo as instruções;
- Crie um repositório no seu GitHub **sem citar nada relacionado ao PicPay**;
- Faça seus commits no seu repositório;
- Envie o link do seu repositório para o e-mail do recrutador responsável;
- Você poderá consultar o Google, Stack Overflow ou algum projeto particular na sua máquina;
- Dê uma olhada nos **Materiais úteis**;
- Dê uma olhada em **como será a entrevista**;
- Fique à vontade para perguntar qualquer dúvida aos recrutadores;
- Fique tranquilo, respire. Assim como você, também já passamos por essa etapa. **Boa sorte!** 😊

---

## ✉️ Corpo do e-mail com o link do repositório do desafio

-Seu Nome
-Nome do recrutador
-Link do repositório 
-Link do LinkedIn

---

## ⚙️ Sobre o ambiente da aplicação

- Escolha qualquer framework que se sinta confortável em trabalhar.
- Esse teste **não faz nenhuma preferência**, portanto decida por aquele com o qual estará mais seguro em apresentar e conversar com a gente na entrevista. 😉
- Você pode optar por **não utilizar framework nenhum**. Neste caso, recomendamos a implementação do serviço via **script** para diminuir a sobrecarga de criar um servidor web.
- **Se optar por um framework**, tente evitar o uso excessivo de métodos mágicos ou atalhos já prontos.
- **Valorizamos uma boa estrutura de containers criada por você.**

---

## 📅 Para o dia da entrevista técnica

- Na data marcada pelo recrutador, tenha sua aplicação rodando **na sua máquina local** para execução dos testes.
- Durante a entrevista, faremos um **code review** com você.
- Explique sua arquitetura, suas escolhas e como o projeto pode evoluir.

---

## 🎯 Objetivo: PicPay Simplificado

O **PicPay Simplificado** é uma plataforma de pagamentos simplificada. Nela, é possível **depositar e realizar transferências de dinheiro entre usuários**. Temos **dois tipos de usuários**:

- **Comuns**: podem enviar e receber dinheiro.
- **Lojistas**: **somente recebem dinheiro** e não podem enviar transferências.

---

## ✅ Requisitos

- Para ambos tipos de usuário, precisamos do **Nome Completo, CPF, e-mail e Senha**.
- CPF/CNPJ e e-mails **devem ser únicos no sistema**.
- **Usuários comuns podem enviar dinheiro** para lojistas e entre si.
- **Lojistas só recebem transferências, não enviam dinheiro**.
- Antes da transferência, valide se o usuário **possui saldo suficiente**.
- Antes de finalizar a transferência, consulte um **serviço autorizador externo** usando este mock:
  - `GET https://util.devi.tools/api/v2/authorize`
- A operação de transferência deve ser **uma transação**, garantindo que o dinheiro volte ao usuário pagador em caso de falha.
- Após a transferência, o recebedor precisa receber **uma notificação externa** (e-mail ou SMS). Use este mock:
  - `POST https://util.devi.tools/api/v1/notify`
- **O serviço deve ser RESTful.**

> ⚠️ **Tente atender ao máximo dos requisitos, mas não se preocupe se não conseguir fazer tudo!** Durante a entrevista, vamos conversar sobre os pontos desenvolvidos. 😊

---

## 🔄 Endpoint de Transferência

A implementação deve seguir o contrato abaixo:

POST /transfer Content-Type: application/json

{ "value": 100.0, "payer": 4, "payee": 15 }

markdown
Copiar
Editar

Caso ache interessante, faça uma proposta de endpoint e **apresente para os entrevistadores** ❤️.

---

## 🧐 Avaliação

Apresente sua solução utilizando o framework que desejar, justificando a escolha. Atente-se a cumprir a maioria dos requisitos.

### O que será avaliado e valorizamos ❤️

#### 🛠️ Habilidades básicas:
- Conhecimentos sobre **REST**
- Uso do **Git**
- **Capacidade analítica**
- Código **limpo e organizado**

#### 🏗️ Construção de projetos manuteníveis:
- Aderência a **PSRs**
- Aplicação de **SOLID**
- Uso de **Design Patterns**
- Noções de **Cache**
- Uso de **Containers (Docker, Podman, etc.)**
- **Documentação**
- **Testes de unidade e integração**
- **Banco de dados relacionais**

#### 🚀 Aptidões para criar aplicações de alta qualidade:
- **Observabilidade**
- Uso de **CI para testes e análise estática**
- Conhecimento sobre **bancos NoSQL**
- Aplicação de **arquiteturas (CQRS, Event-sourcing, Microsserviços, etc.)**
- Uso de **mensageria**
- **Escalabilidade**
- **Segurança e boas práticas**

---

## ❌ O que NÃO será avaliado ⚠️

- **Fluxo de cadastro de usuários e lojistas**
- **Frontend (avaliamos apenas a API RESTful)**
- **Autenticação**

---

## 🎯 O que será um diferencial

- Uso de **Docker**
- **Cobertura de testes consistente**
- **Uso de Design Patterns**
- **Documentação**
- **Proposta de melhoria na arquitetura**
- **Capacidade de argumentação das suas escolhas**
- **Modelagem de Dados**
- **Tratamento de erros**
- **Manutenibilidade do Código**
- **Componentes desacoplados (Service, Repository, etc.)**

---

## 📚 Materiais úteis

- [Sobre o PicPay](https://picpay.com/site/sobre-nos)
- [Design Patterns](https://hub.packtpub.com/why-we-need-design-patterns/)
- [Refactoring Guru](https://refactoring.guru/)
- [PHP: The Right Way](http://br.phptherightway.com/)
- [PSR-12](https://www.php-fig.org/psr/psr-12/)
- [Tipos de Testes de Software](https://www.atlassian.com/continuous-delivery/software-testing/types-of-software-testing)
- [PHP Static Analysis Tools](https://github.com/exakat/php-static-analysis-tools)
- [Microservices Architecture](https://martinfowler.com/articles/microservices.html)
- [Guzzle PHP](https://docs.guzzlephp.org/en/stable/request-options.html)
- [REST API - DevMedia](https://www.devmedia.com.br/rest-tutorial/28912)

---

**Boa sorte no desafio!** 🚀🔥

