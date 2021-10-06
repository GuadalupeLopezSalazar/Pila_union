
package ejercicio_pilaunion;
import java.util.Scanner;   /*Libreria de introduccion de datos*/
/**
 * @Guadalupe Lopez Salazar
 */
public class Ejercicio_pilaunion {
    public static void main(String[] args) {    
        Scanner sc = new Scanner(System.in);      /*Permite ingresar datos por teclado*/
        int tope = 0, opt = 0;                   /*Declaracion de variables enteras*/
        System.out.println("INGRESE EL TAMAÑO DE LAS PILAS A Y B: ");   /*Solicitud de dato para el usuario*/
        int tam = sc.nextInt();           /*Variable para almacenar el valor introducido*/
        int pilaA[] = new int[tam];
        int pilaB[] = new int[tam];   /*Se declaran las pilas y se igualan al tamaño introducido*/
        int pilaC[] = new int[tam];
        do {
            System.out.println("1 - LLENAR PILA A Y B\n"
                    + "2 - MOSTRAR PILA A Y B\n"
                    + "3 - VACIAR PILA A Y B\n"          /*Opciones a elegir por el usuario*/
                    + "4 - UNIR PILAS\n"
                    + "5 - MOSTRAR PILA C\n"
                    + "6 - SALIR\n");
            switch (opt = sc.nextInt()) {
                case 1: /*Se llena la pila A y B*/
                    System.out.println("PILAS A Y B LLENAS");
                    for (int i = 0; i < tam; i++) {
                        pilaA[i] = (int) (Math.random() * 100 + 1);   /*Muestra datos aleatorios*/
                        pilaB[i] = (int) (Math.random() * (99-200) + 200);   /*Muestra datos aleatorios*/
                    tope++;   /*Tope va a aumentar su valor en 1*/
                    }
                    break;   /*Se termina el primer caso*/
                case 2:   /*Se muestra la pila A y B*/
                    if (tope>0) {
                    System.out.println("PILA A");
                    for (int i = tope-1; i >= 0; i--) {
                        System.out.println(" " + pilaA[i]);
                    }
                    System.out.println("PILA B");
                    for (int i = tope-1; i >= 0; i--) {
                        System.out.println(" " + pilaB[i]);
                    }
                    }
                    break; /*Se termina el segundo caso*/
                case 3:  /*Se vacia la pila A y B*/
                    System.out.println("PILA A Y B VACIA");
                    tope = 0; /*Se iguala a cero ya que vuelve a inicializar las pilas*/
                    break;   /*Se termina el tercer caso*/
                case 4:
                    System.out.println("UNION DE PILAS");    /*Se unen las pilas A y B*/
                    int cont = 0;     /*Se declara un contador*/
                    for (int i = tope-1; i >= 0; i--) {
                        pilaC[cont] = pilaA[i]+pilaB[i];  /*En esta parte se unen las pilas A y B*/
                        System.out.println(" LA PILA C EN LA POSICION " + i + " TIENE LA CANTIDAD: "+pilaC[i]);
                        cont++;   /*cont va a aumentar su valor en 1*/
                    }                   
                    break;  /*Se termina el cuarto caso*/
                case 5:     /*Se muestra la pila C*/              
                    System.out.println("PILA C");
                    for (int i = tope-1; i >= 0; i--) {
                        System.out.println(" " + pilaC[i]);
                    }
                    break; /*Se termina el quinto caso*/
            }
        } while (opt != 6);   /*Salir*/
        }
        }
        




