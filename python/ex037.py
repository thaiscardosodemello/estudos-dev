#Exercício 37
#Escreva um programa que leia um númrero inteiro qualquer e peça para o usuário escolher qual será a base conversão:
#- 1 para binário
#- 2 para octal
#- 3 para hexadecimal

num = int(input('Digite um número inteiro: '))

#3 aspas pula linha 
print('''\n Ecolha uma das bases para conversão: 
      [ 1 ] converter para BINÁRIO
      [ 2 ] converter para OCTAL
      [ 3 ] converter para HEXADECIMAL''')

opcao = int(input('\n Sua opção: '))

if opcao == 1:
    print('\n {} convertido para BINÁRIO é igual a {}' .format(num, bin(num)[2:]))
elif opcao == 2:
    print('\n {} convertido para OCTAL é igual a {}' .format(num, oct(num)[2:]))
elif opcao == 3:
    print('n {} convertido para HEXADECIMAL é igual a {}' .format(num, hex(num)[2:]))
else:
    print('\n Opção inválida. Tente novamente.')
