
package live1506noite;

import javax.swing.JOptionPane;

/**
 *
 * @author Jeferson Leon
 */
public class Live1506Noite {
   /*
    Em um laboratório usam-se dois tipos de cobaias: ratos e coelhos. O código
    para ratos é 1 e para coelhos, 2. Foram feitas 15 experiências, nas quais 
    foram utilizados um dos tipos de cobaias. Faça um algoritmo que leia, para 
    cada uma das experiências, o código da cobaia utilizada e a quantidade de 
    cobaias. Deseja-se saber: o total de cobaias utilizadas, o total de ratos, 
    o total de coelhos e o percentual de cada cobaia.
    */
    public static void main(String[] args) {
        int cont, cod, quant, acRatos, acCoelhos;
        acRatos = 0; acCoelhos=0;
        //cont=cont+1; cont++;
        for(cont=1; cont<=15;cont++){
         cod = Integer.parseInt(JOptionPane.showInputDialog("Qual a cobaia "
                 + "você quer?\n1 - Rato\n2 - Coelho\nEscolha:"));
         if(cod == 1){
             quant = Integer.parseInt(JOptionPane.showInputDialog("Quantos ratos "
                 + "você quer?"));
             acRatos+=quant; //acRatos = acRatos + quant;
         }else if(cod == 2){
           quant = Integer.parseInt(JOptionPane.showInputDialog("Quantos coelhos "
                 + "você quer?"));
             acCoelhos += quant; //acCoelhos = acCoelhos + quant;
         }else{
             JOptionPane.showMessageDialog(null, "Código inválido apenas 1 ou 2");
             cont--;
         }//fim do if 
        }//fim do loop - fim das experiencias
         JOptionPane.showMessageDialog(null, "Foram utilizados "+(acCoelhos+acRatos)
                 +" cobaias no total\n"
                 + "Total de Ratos: "+acRatos 
                 +" - "+(acRatos/(double)(acRatos+acCoelhos)*100)+"%"
                 + "\nTotal de Coelhos: "+acCoelhos 
                 +" - "+(acCoelhos/(double)(acRatos+acCoelhos)*100)+"%"
                    );
    }
    
}
