
package aula07_04;

import javax.swing.JOptionPane;


public class exe1 {
    
    
    public static void main(String args[]){
    
double L1,L2,L3,A1,A2,A3; 
int resp;


  
 resp = Integer.parseInt(JOptionPane.showInputDialog(null, "Quer continuar? Use 0 para sair"));  
   
while (resp!=0) {
 resp = Integer.parseInt(JOptionPane.showInputDialog(null, "Quer continuar? Use 0 para sair"));  
L1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o Lado1: ")); 
L2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o Lado2: ")); 
L3 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o Lado3: "));    
  
A1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o angulo1: ")); 
A2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o angulo2: ")); 
A3 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o angulo3: ")); 




//equilatero

if ((L1 == L2 && L1==L3)){ 
     
JOptionPane.showMessageDialog(null,"Equilatero e obtusangulo");
}



//isoceles 

else if ((L1 != L2 && L1 !=L3)){
   
     if (A1==90 || A2==90 || A3==90) {

         JOptionPane.showMessageDialog(null,"Escaleno e Retangulo"); 
    
    }else if (A1>90 || A2>90 || A3>90){
         JOptionPane.showMessageDialog(null,"Escaleno e Retangulo"); 
        
    }else{
      JOptionPane.showMessageDialog(null,"Escaleno e Obtusangulo"); 
    
    }

 
    
//escaleno     

}else{
    
   if (A1==90 || A2==90 || A3==90){
    
 JOptionPane.showMessageDialog(null,"Isoceles e retangulo");    
    
    }else if (A1>90 || A2>90 || A3>90){
    
   JOptionPane.showMessageDialog(null,"Isoceles e obtusangulo");     
    
    }else{ 
    
       JOptionPane.showMessageDialog(null,"Isoceles e Acutano"); 
    }
    


}

}

    } 
}
