programa {
  funcao inicio() {
    inteiro numeros[7] = {64, 34, 25, 12, 22, 11, 90}
    inteiro i, j, aux
        
    escreva("Lista original:\n")
    para(i = 0; i < 7; i++){
      escreva(numeros[i], " ")
    }

    // Bubble Sort
    para(i = 0; i < 6; i++)
    {
    para(j = 0; j < 6 - i; j++) {
    se(numeros[j] > numeros[j + 1]) {
      aux = numeros[j]
      numeros[j] = numeros[j + 1]
      numeros[j + 1] = aux
      }
      }
    }

    escreva("\n\nLista ordenada:\n")
    para(i = 0; i < 7; i++) {
      escreva(numeros[i], " ")
    }
  }
}
