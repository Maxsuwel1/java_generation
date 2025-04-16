programa
{
	
	
	funcao inicio() {
// Declaração de variaveis
	
	inteiro lista[] = {2,5,1,3,4,9,7,8,10,6}
	inteiro tamanhoLista = 10
	inteiro i
	inteiro soma = 0
	real media = 0.0
	
// Receber número inteiros
	/*
	para (i = 0; i < tamanhoLista; i++) {
		escreva("Digite numero: ")
		leia(lista[i])
		limpa()

// Fim do para
		}
	*/

// Mostrar indice impar
	escreva("\n\nElementos nos índices ímpares: \n")
	para (i = 1; i < tamanhoLista; i += 2){
		escreva(lista[i])
		escreva(" ")
	
// Fim do para
		}
//  Mostrar indice par
	escreva("\n\nElementos nos índices pares: \n")
	para (i = 0; i < tamanhoLista; i ++){
		se (lista[i] % 2 == 0){
			escreva(lista[i], " ")
// Fim do se			
			}
	
// Fim do para i
		}

// Somar todos elementos do vetor 1/2
	para (i = 0; i < tamanhoLista; i++){
		soma += lista[i]
		
// Fim do para i		
		}
// Somar todos elementos do vetor 2/2
	escreva("\n\nSoma: \n ",soma)

// Media do vetor 
	media = (soma/tamanhoLista)
	escreva("\n\nMedia: \n ",media)


// Fim da funcao inicio		
	}

}



/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 950; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */