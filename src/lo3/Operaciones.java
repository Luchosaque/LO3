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

    /**
     * 
     * el metodo "sumarPar" recibe 2 parametros, "a" y "b", tipo int y retorna un int
     * al ser ejecutado suma los dos parametros y comprueba si el resultado
     * es un numero par, de ser asi retorna un int, cuyo valor
     * es igual a la suma de los parametros recibidos, en caso contrario,
     * si es un numero impar, retornara un int cuyo valor será la suma
     * de los parametros recibidos +1.
     * 
     * @param a
     * @param b
     * @return 
     */
    public int sumarPar(int a, int b) { /*el metodo recibe dos enteros a y b*/
        int resultado = a + b;/*el entero resultado es igual a la suma de los enteros a y b*/
        if(resultado%2==0){ /*si el entero resultado es dividido entre 2 y es igual a 0*/
            return resultado+1;/*devuelve el entero resultado, ressultante de dividirlo entre dos más uno*/
        }else{/*si no es igual a cero*/
            return resultado;/*devuelve el entero resultado, resultante de dividirlo entre dos*/
        }//end if
    }//end metodo

    /**
     * 
     * el metodo "mayor" recibe 2 parametros, "a" y "b", de tipo int y retorna un entero
     * al ser ejecutado comprueba que parametro es mayor, "a" o "b", y devuelve
     * el mayor de ellos pero, de ser iguales, devuelve cualquiera de los dos parametros
     * 
     * @param a
     * @param b
     * @return 
     */
    public int mayor(int a, int b) {/*el metodo recibe dos enteros a y b*/
        if(a>b){/*si el entero a es mayor q el entero b*/
            return a;/*devuelve el entero a*/
        }else{/*si no es a mayor que b*/
            return a;/*devuelve el entero a*/
        }//end if
    }//end metodo
    
    
    /**
     * 
     * el metodo "sumarVector" recibe un parametro tipo array de int y devuelve un int
     * al ejecutarse suma el valor de los numeros que componen el array y el resultado
     * lo retorna en un int
     * 
     * @param numeros
     * @return 
     */
    public int sumarVector(int [] numeros) {/*el metodo recibe un array de numeros*/
        int sum=0;//el entero sum es igual a cero
        for (int i = 0; i < numeros.length; i++) {//para i igual a cero; i menor que la longitud del array numeros;i aumenta uno
            sum+=numeros[0];//el entero sum mas el array numeros en posicion cero
        }
        return sum;//devulve el entero sum
    }
    
}