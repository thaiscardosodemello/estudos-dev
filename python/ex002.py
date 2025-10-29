#Exercício 2
#Faça um programa que leia o nome de uma pessoa e mostre uma mensagem de boas-vindas.

nome = input('Digite seu nome: ')
print('É um prazer te conhecer', nome,'!')

#no python3 tem a possibilidade da saída formatada
print('É um prazer te conhecer, {}!'.format(nome))