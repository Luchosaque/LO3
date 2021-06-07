/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lo3;

/**
 *
 * @author Luis
 */
public class Operaciones {

    public int sumarPar(int a, int b) { /*el metodo recibe dos enteros a y b*/
        int resultado = a + b;/*el entero resultado es igual a la suma de los enteros a y b*/
        if(resultado%2==0){ /*si el entero resulta es dividido entre 2 y es igual a 0*/
            return resultado+1;/*devuelve el entero resultado, ressultante de dividirlo entre dos más uno*/
        }else{/*si no es igual a cero*/
            return resultado;/*devuelve el entero resultado, ressultante de dividirlo entre dos*/
        }//end if
    }//end metodo

    public int mayor(int a, int b) {/*el metodo recibe dos enteros a y b*/
        if(a>b){/*si el entero a es mayor q el entero b*/
            return a;/*devuelve el entero a*/
        }else{/*si no es a mayor que b*/
            return a;/*devuelve el entero a*/
        }//end if
    }//end metodo
    
    
    public int sumarVector(int [] numeros) {/*el metodo recibe un array de numeros*/
        int sum=0;//el entero sum es igual a cero
        for (int i = 0; i < numeros.length; i++) {//para i igual a cero; i menor que la longitud del array numeros;i aumenta uno
            sum+=numeros[0];//el entero sum mas el array numeros en posicion cero
        }
        return sum;//devulve el entero sum
    }
    
}