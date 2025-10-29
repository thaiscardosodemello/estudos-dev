#Exercício 36
#Escreva um programa para aprovar um empréstmo bancário para a compra de uma casa.
#O programa vai perguntar: 'Valor da casa', 'Salário do comprador' e 'Quantos anos de financiamento?'
#Calcule o valor da pestação mensal, sabendo que ea não pode exceder 30% do salário ou entao o empréstimo será negado.


valorCasa = float(input('Valor da casa: R$'))
valorSalario = float(input('Salário do comprador: R$'))
periodoFinanciamento = int(input('Quantos anos de financiamento? '))
prestacao = valorCasa / (periodoFinanciamento * 12)
minimo = valorSalario * 30 / 100

print('Para pagar uma casa de R${:.2f} em {} anos a prestação será de R${:.2f}'.format(valorCasa, periodoFinanciamento, prestacao))
#print('COMPARANDO tem que paga {} e o minimo é de {}'.format(prestacao, minimo))
if prestacao <= minimo:
    print('Empréstimo pode ser CONCEDIDO!')
else:
    print('Empréstimo NEGADO!')