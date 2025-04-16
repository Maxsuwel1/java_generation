programa
{
    funcao inicio()
    {
        inteiro lista[10] = {2, 5, 1, 3, 4, 9, 7, 8, 10, 6}
        inteiro muda

        para (inteiro l = 0; l < 10; l++)
        {
            para (inteiro c = l + 1; c < 10; c++)
            {
                se (lista[l] < lista[c])
                {
                    muda = lista[l]
                    lista[l] = lista[c]
                    lista[c] = muda
                }
            }
        }

        // Exibindo o vetor ordenado
        escreva("Vetor ordenado em ordem decrescente: ")
        para (inteiro i = 0; i < 10; i++)
        {
            escreva(lista[i], " ")
        }
    }
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 648; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */