package com.company;

//Démontre le tri par insertion

public class Main {

    public static void main(String[] args) {
	// write your code here
        int[] array = new int[]{10, 90, 30, 20, 34, 56, 84, 50, 20};
        //int[] array2 = new int[]{10, 90, 30, 20, 34, 56, 84, 50, 20};
        //int[] array3 = new int[]{10, 90, 30, 20, 34, 56, 84, 50, 20};
        
        int[] retour;

        showArray(array);

        retour = tri_insertion(array);

        System.out.println("Après le tri :");
        showArray(array);

        System.out.println("Valeurs :");
        showArray(retour);
    }

    public static void showArray(int[] array){
        for (int item : array) {
            System.out.print(item + " ");
        }
    }

    public static int[] tri_insertion(int[] array) {

        int comparaison = 0;
        int copie = 0;

        int temp, iCtrB;

        for(int iCtrA = 1; iCtrA < array.length; iCtrA++){
            temp = array[iCtrA];
            iCtrB = iCtrA;
            while (iCtrB > 0 && array[iCtrB - 1] > temp){
                array[iCtrB] = array[iCtrB - 1];
                iCtrB = iCtrB - 1;
                comparaison++;
            }
            array[iCtrB] = temp;
            copie++;
        }

        return new int[]{comparaison, copie};
    }
}
