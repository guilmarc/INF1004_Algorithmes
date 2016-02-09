/**
 * Created by guilmarc on 2016-02-02.
 */
public class NoDups {

    int tabElements[] = {6, 6, 18, 15 ,3 ,2, 3, 14, 8, 11, 5, 20, 5, 3, 16, 7, 2, 18, 20, 9};
    int iNbElements;    //Contient le nombre d'élément du tableau tabElements
    int iExemplaire;    //Contient la valeur à comparer
    int iNbRetraits;    //Contient le nombre d'élément que l'on a du retirer


    public void AfficheElements(){
        System.out.print("tabElements contient { ");
        for (int element : tabElements) {
            System.out.print(element + " ");
        }
        System.out.print(" }");
    }

    public void Nettoyage(){
        for (int iCtrA = 0; iCtrA < tabElements.length - 1; iCtrA++) {
            iExemplaire = tabElements[iCtrA];
            if (iExemplaire != 0) {
                for(int iCtrB = iCtrA + 1; iCtrB < iNbElements; iCtrB++) {
                    if (tabElements[iCtrB] == iExemplaire) {
                        tabElements[iCtrB] = 0;
                        iNbRetraits++;
                    }
                }
            }
        }

        System.out.print("Après le nettoyage, ");
        this.AfficheElements();
        iNbElements = iNbElements - iNbRetraits;
    }

    public void NouveauTableau (){
        int[] tabNouveau = new int[iNbElements];
        int iIndex = 0;
        for (int iCtrA = 0; iCtrA > tabElements.length; iCtrA++) {
            if (tabElements[iCtrA] !=0 ){
                tabNouveau[iIndex]=tabElements[iCtrA];
                iIndex++;
            }
        }
        tabElements = tabNouveau;
        System.out.print("Le nouveau tableau");
        this.AfficheElements();
    }


}
