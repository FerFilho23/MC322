# Lab 02

## Laboratório em Estruturas de Programação Java

## Desafio 1 - Empréstimo

Em um financiamento com juros compostos e número de parcelas fixas parte-se dos seguintes parâmetros:
* `S` - valor da primeira parcela
* `N` - número de parcelas
* `J` - percentual de juros mensal

A primeira parcela a ser paga do financiamento é sempre igual a `S`. A partir daí é feita uma atualização mensal da parcela, em que cada nova parcela é calculada a partir da parcela do mês anterior, conforme a fórmula:

> Parcela<sub>mês</sub> = Parcela<sub>mês-1</sub> * (1 + `J` / 100)

O financiamento encerra quando as `N` parcelas são pagas.

Exemplo:
* `S`: 200
* `N`: 5
* `J`: 1%

Parcelas do financiamento:
`200`; `202`; `204.02`; `206.06`; `208.12`

## Desafio 2

Escreva um programa que sorteie um número inteiro entre `0` e `9999` o número deve ser mostrado, em seguida convertido para binário e a versão binária deve ser apresentada no console. A conversão decimal/binário deve ser computada por um programa feito por você.

## Desafio 3

Uma molécula de DNA pode ser definida a partir de uma cadeia que representa a sequência de suas bases:
A - Adenina
C - Citisina
G - Guanina
T - Tinina

Desse modo, uma string pode ser usada para representar um segmento do DNA da seguinte maneira: `ATTACGCGCAAAC`.

Escreva uma função (método) que codifique a cadeia de RNA produzida a partir de uma cadeia de DNA. A função deve ser genérica o suficiente para ser aplicável a qualquer cadeia. A entrada é uma string (DNA) e o retorno é uma string (RNA).

Escreva um programa que teste esta função com uma cadeia de DNA de sua escolha.

## Desafio 4

Uma empresa precisa realizar uma estatística do salário de seus funcionários.

Para fins de teste, os salários devem ser gerados aleatoriamente com valores variando entre R\\$ 2.500 e R\\$ 15.000.

Escreva um programa que gere uma lista contendo os salários de 50 funcionários da empresa e mostre no console quantos funcionários ganham salário acima da média.

Arquivo do [Lab](https://github.com/FerFilho23/MC322/blob/main/lab02/notebook/lab02-java-estruturas-ra234471.ipynb)
