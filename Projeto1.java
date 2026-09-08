
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author julia_l_dick
 */
public class Projeto1 {
    public static void main(String[] args) { // começo do código
        JOptionPane.showMessageDialog(null,  // primeira escrita do código
                "Ola tudobeim?") ;
        String nome = JOptionPane.showInputDialog(null, "Digite seu nome") ; //informar seu nome
        int idade = Integer.parseInt ( // pede a idade
         JOptionPane.showInputDialog(null, "Digite sua idade")) ; //aqui coloca a sua idade
        if (idade >= 18) { // se idade maior que 18
            JOptionPane.showMessageDialog(null, //declara variavel
                    "aluno maior de idade" // maior de idade
                      
            );
            
        } else { // se nao
            JOptionPane.showMessageDialog(null,
                    "aluno menor de idade"  // menor de idade
           ) ;
        }
        String rua = JOptionPane.showInputDialog(null,"qual é o nome da sua rua?") ; // pede a rua
          int salarioMes = Integer.parseInt( // pede seu salario
         JOptionPane.showInputDialog(null,"quanto voce ganha por mes?")); // aqui voce coloca seu salario
         if (salarioMes >= 1000) { // se salario maior que mil reais
            JOptionPane.showMessageDialog(null,
                    "voce ta ganhando bem!!" // ganha bem
                      
            + "\n Até Mais" + nome); // despedida
       
    }else { // se nao
             JOptionPane.showMessageDialog(null,
                    "como voce sobrevive?kkk"  // mensagem 
           + "\n Até mais" + nome) ; // despedida
         }
         int resposta = JOptionPane.showConfirmDialog(
         null,
             "voce deseja continuar?",
             "confirmação", 
              JOptionPane.YES_NO_CANCEL_OPTION
         );
         if (resposta == JOptionPane.YES_OPTION){
             JOptionPane.showMessageDialog(null, "voce escolheu sim!"
             );
         }else {
             JOptionPane.showMessageDialog(null, "voce escolheu nao!");
             
         }
            
         }
}
