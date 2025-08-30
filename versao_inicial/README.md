# 🧨 Sistema de Pedidos - Versão Mal Projetada

### 1. `SistemaPedidos`
Responsável por:
- Criar pedidos
- Calcular preços
- Simular persistência no banco
- Enviar e-mail de confirmação

> Esta classe centraliza múltiplas responsabilidades, violando o princípio da responsabilidade única.

### 2. `RelatorioPedidos`
Responsável por:
- Gerar relatórios simples de pedidos
- Reutiliza diretamente métodos da classe `SistemaPedidos`

> Forte acoplamento e dependência direta entre classes sem abstração.

## 🚨 Problemas Intencionais

- Nenhuma separação entre camadas (ex: controller, service, repository)
- Métodos com lógica embaralhada e responsabilidades múltiplas
- Instanciação direta de classes sem injeção de dependência
- Código difícil de testar, manter e escalar

## ▶️ Execução

Para executar o sistema:

```bash
javac SistemaPedidos.java RelatorioPedidos.java
java SistemaPedidos
java RelatorioPedidos