
package n1.psp;

import java.util.logging.Level;
import java.util.logging.Logger;



/**
 *
 * @author julian
 */
public class Fio extends Thread{
 
    public Fio(String str){
     super(str);
 }
   
    public void run(){
        for (int i = 0; i <=10; i++) {
            System.out.println(getName()+i);
            
            try {
                Thread.sleep(200);
            } catch (InterruptedException ex) {
                Logger.getLogger(Fio.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
     
    }
        
    }

