# Lab 01

## Memória, Variáveis, Comunicação e Estado de um Programa
Há várias possíveis estratégias para usar a memória de um computador para se realizar a comunicação entre partes dele -- por exemplo, entre duas funções -- e para se manter o estado atual de execução de um programa. Dentre elas, podemos destacar o uso de variáveis locais, globais e parâmetros entre funções.

Vamos fazer aqui um exercício nesse contexto e você será conduzido a experimentar cada uma dessas estratégias, mesmo que em algumas ocasiões não seja a forma recomendada de se desenvolver um programa.

## Exercício do Empréstimo
Em um financiamento com juros compostos e número de parcelas fixas parte-se dos seguintes parâmetros:

S - valor da primeira parcela
N - número de parcelas
J - percentual de juros mensal
A primeira parcela a ser paga do financiamento é sempre igual a S. A partir daí é feita uma atualização mensal da parcela, em que cada nova parcela é calculada a partir da parcela do mês anterior, conforme a fórmula:

Parcelamês = Parcelamês-1 * (1 + J / 100)

Exercício Parte 1 - Escrevendo um Programa

Exercício Parte 2 - Escrevendo um Módulo

Exercício Parte 3 - Mantendo o Estado

Exercício Parte 4 - Minimizando os Parâmetros

Exercício Parte 5 - Múltiplos Empréstimos

Arquivo do [Lab](MC322/lab01/notebook/emprestimo01-ra234471.ipynb)
