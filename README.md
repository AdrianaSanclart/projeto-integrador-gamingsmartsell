# GamingSmartSell

Sistema desktop para apoiar a gestão de uma loja de produtos gamers, reunindo usuários, produtos, fornecedores, estoque, vendas e relatórios em uma aplicação Java com MySQL.

## Tecnologias

- Java
- Java Swing
- JDBC
- MySQL
- Maven
- MySQL Workbench

## Funcionalidades

- Autenticação de usuários
- Controle de acesso por cargo
- Cadastro e manutenção de usuários, produtos e fornecedores
- Controle de estoque
- Registro e estorno de vendas
- Relatórios operacionais
- Exportação de relatórios

## Estrutura

- `src/`: aplicação Java e telas Swing
- `database/`: schema e dados demonstrativos sanitizados
- `docs/`: diagrama UML
- `screenshots/`: telas selecionadas da aplicação

## Como executar

1. Crie o banco executando `database/gaming_smart_sell.sql`.
2. Configure a senha local em `src/com/mycompany/gamingsmartsell/Conexao.java`.
3. Abra o projeto Maven em uma IDE Java.
4. Execute `com.mycompany.gamingsmartsell.GamingSmartSell`.

O código e o banco publicados usam valores demonstrativos. Substitua `CHANGE_ME` localmente e não publique credenciais reais.

## Sobre o projeto

Este repositório consolida as etapas de análise, modelagem, interface, implementação e integração com banco de dados do Projeto Integrador. Relatórios acadêmicos e arquivos de entrega foram mantidos fora da publicação.
