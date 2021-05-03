programa
{
	
	funcao inicio()	
    	{
        
        
        inteiro codigo=0
        inteiro matricula=0
        cadeia cpf
        real pontos[3]
        inteiro status=0
        caracter movimento
        real totalAtual= 0.00

        escreva("ESCOLINHA ENSINO BASICO ALEGRIA\n")
        escreva("A JORNADA COMEÇA AQUI!!")
        escreva("\n")
        escreva("1- BASICO\n")
        escreva("2- MEDIO\n")
        escreva("3- GRADUAÇÃO\n")
        escreva("4- POS\n")
        escreva("5- MESTRADO\n")
        escreva("6- SAIR\n")

        escreva("DIGITE O CODIGO DA OPERAÇÃO: ")
        leia(codigo)


		// GRADUACAO
		se(codigo==3){
			limpa()
			escreva("ESCOLINHA ENSINO BASICO ALEGRIA\n")
			escreva("A JORNADA COMECA AQUI!!\n")
			escreva("\n")
			escreva("GRADUAÇÃO\n")
			escreva("\n")
            
			escreva("Matricula: ")
			leia(matricula)
			escreva("\nCPF: ")
			leia(cpf)
			escreva("\nStatus(1-Ativo 0-Inativo): ")
			leia(status)
			escreva("\n")
            
                
			para (inteiro n=0; n<3; n++){
			
			escreva ("\nDigite o valor da  nota: " )
			leia (pontos[n])
			totalAtual= totalAtual+pontos[n]
          	}
            
			se (totalAtual<0){
			totalAtual+=2
         		}
                    
			escreva ("O valor total é: " , totalAtual)
				
		}

			
    	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 804; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */