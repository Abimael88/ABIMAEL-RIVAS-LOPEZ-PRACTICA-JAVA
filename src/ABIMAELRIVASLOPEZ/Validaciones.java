package ABIMAELRIVASLOPEZ;
import javax.swing.JTextField;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;

public class Validaciones {
    public void SoloLetras(JTextField cam){
        cam.addKeyListener(new KeyAdapter(){
            public void keyTyped(KeyEvent e){
                char c=e.getKeyChar();
                if(Character.isDigit(c)){
                    e.consume();
                    JOptionPane.showMessageDialog(null,"Los numeros no son validos.");
                }
            }
        });
    }
    
    
    public void SoloNumeros(JTextField cam){
        cam.addKeyListener(new KeyAdapter(){
            public void keyTyped(KeyEvent e){
                int aux=-1;
                char c=e.getKeyChar();
                if(c=='.'){
                        aux++;
                    }
                if((!Character.isDigit(c) && c!='.')  ||(c=='.'&& cam.getText().contains("."))){
                    e.consume();
                    JOptionPane.showMessageDialog(null,"Las letras no son validas.");
                    
                }
            }
        });
    }
    
   public void longitud(JTextField cam,int lim){
        cam.addKeyListener(new KeyAdapter(){
            public void keyTyped(KeyEvent e){
                int can=cam.getText().length();
                if(can>lim){
                    e.consume();
                    JOptionPane.showMessageDialog(null,"Limite de la longitud.");
                }
            }
        });
    } 
    
}
