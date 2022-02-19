
package Exercise6;

/**
 * 
 * @author jhojan hoyos
 */
public class Vector {
  
    private int array[] = {};
    
    /**
     *Metodos set y get
     */
    public int[] getArray() {
        return array;
    }

    public void setArray(int[] array) {
        this.array = array;
    }
    
    /**
     * metodo para agregar elementos al vector
     * @param newInt 
     */
    public void addElement(int newInt){     
        
       int copyArray[] = new int[array.length + 1];
       for(int i=0; i<array.length; i++) {
           copyArray[i] = array[i];
       }
       copyArray[array.length] = newInt;
       array = copyArray;
    }
    
    /**
     * metodo para filtrar los numeros 
     * @param num
     * @return 
     */
    public boolean fingElement(int num) {
        for(int i=0; i<array.length; i++) {
            if(array[i] == num) {
                return true;
            }
        }
        return false;
    }
    
    /**
     * metodo retorna la posicion del vector
     * @param posicion 
     * @return  
     */
    public int getElemento(int posicion) {
        return array[posicion];
    }
    
    /**
     * metodo que retorna el tamaño del vector
     * @return 
     */
    public int size() {
        return array.length;
    }

   
}
    

	
   

