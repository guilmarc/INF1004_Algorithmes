/**
 * Created by guilmarc on 2016-01-25.
 */
public class Homework1 {

    //Creating the company
    Company company = new Company("AutoSupérieur", 2010);

    public static void main(String[] args) {
        Homework1 homework1 = new Homework1();
        homework1.generateData();

    }

    private void generateData() {

        //Generate all limousine
        company.addLimousine("Mercedes Classe S W220 500", "LIM 983", 88, 5, "Noire");
        company.addLimousine("Mercedes Classe S W220 430", "823 MIL", 88, 5, "Noire");
        company.addLimousine("Mercedes Classe S 600 Limousine 2012", "L89 SSX", 90, 5, "Rouge");
        company.addLimousine("Audi A8 D3 6.0 W12 Limousine", "AUP 933", 90, 5, "Orange");
        company.addLimousine("Rolls-Royce Touring Limousine", "HAL 011", 107, 4, "Beige");
        company.addLimousine("Peugeot 201 T - Limousine commerciale", "C00 UPC", 40, 6, "Noire");
        company.addLimousine("Mercedes Classe S W220 55 AMG Limousine", "GHT 144", 88, 5, "Rouge");
        company.addLimousine("Opel Omega A Limousine", "OOA 833", 75, 3, "Bleu acier");
        company.addLimousine("Citroën CX 25 Limousine Turbo 2", "CCX 935", 68, 3, "Jaune");
        company.addLimousine("Rolls-Royce Silver Spur II Limousine", "370 RRS", 107, 3, "Argent");

        try {
            company.addDriver("Munoz", "Armando", 2015, "4698 rue Fournier (St-Jerôme)  J7Z 4V1");
            company.addDriver("Summers", "Gabriel", 2015, "3589 avenue Port-Royal (Bonaventure)  G0C 1E1");
            company.addDriver("Nathan", "Christopher", 2011, "4457 rue des Églises Est (St Paul D)  J0E 1A0");
            company.addDriver("Beaubier", "Jean-Paul", 2012, "797 Rue De La Gare (Mistassini)  G8M 2Z2");
            company.addDriver("Marko", "Cain", 2012, "3525 90th Avenue (Brooks)  T0J 0J0");
            company.addDriver("Haller", "David", 2015, "2536 Pape Ave (Toronto)  M4E 2V5");
            company.addDriver("Ferguson", "Clarice", 2015, "4888 Pine Street (Castor)  T0C 0X0");
            company.addDriver("Hunter", "Stephanie", 2013, "3746 Adelaide St (Toronto)  M5H 1P6");
            company.addDriver("Hark", "Paul", 2012, "2515 102nd Avenue (Fort St John)  V1J 3Y7");
            company.addDriver("Dane", "Lorna", 2010, "1211 Carling Avenue (Ottawa)  K1Z 7B5");
        } catch(TooManyDriversException exception){
            //Can't have more than 12 drivers
            exception.printStackTrace();
        }
        company.addPath("Montreal", "Quebec", 2122, 2358, 1);
        company.addPath("Laval", "Gatineau", 11895, 12051, 4);
        company.addPath("Longueuil", "Sherbrooke", 12744, 12871, 9);
        company.addPath("Saguenay", "Levis", 7714, 7893, 7);
        company.addPath("Trois-Rivieres", "Terrebonne", 14403, 14514, 2);
        company.addPath("Saint-Jean-sur-Richelieu", "Saint-Laurent", 13402, 13439, 8);
        company.addPath("Repentigny", "Brossard", 7701, 7733, 3);
        company.addPath("Drummondville", "Saint-Jerome", 6964, 7082, 3);
        company.addPath("Shawinigan", "Saint-Hyacinthe", 1972, 2078, 7);
        company.addPath("Granby", "Blainville", 13072, 13166, 7);
        company.addPath("Chateauguay", "Rimouski", 14155, 14677, 7);
        company.addPath("Saint-Eustache", "Victoriaville", 3121, 3280, 1);
        company.addPath("Rouyn-Noranda", "Salaberry-de-Valleyfield", 10102, 10601, 6);
        company.addPath("Boucherville", "Joliette", 17702, 17749, 3);
        company.addPath("Mirabel", "Sorel-Tracy", 7737, 7823, 5);
        company.addPath("Mascouche", "Val-d'Or", 11375, 11786, 9);
        company.addPath("Alma", "Sainte-Julie", 5620, 5973, 4);
        company.addPath("Boisbriand", "Vaudreuil-Dorion", 15974, 16002, 7);
        company.addPath("Sept-Iles", "Sainte-Therese", 13910, 14660, 4);
        company.addPath("Saint-Constant", "Magog", 4555, 4666, 5);
        company.addPath("Chambly", "La Prairie", 18870, 18887, 6);
        company.addPath("Varennes", "Beloeil", 11480, 11502, 7);
        company.addPath("Riviere-du-Loup", "Deux-Montagnes", 17263, 17682, 4);
        company.addPath("Saint-Lazare", "L'Assomption", 12270, 12342, 6);
        company.addPath("Sainte-Catherine", "Candiac", 2732, 2737, 6);
        company.addPath("Mont-Saint-Hilaire", "Saint-Basile-le-Grand", 11141, 11148, 9);
        company.addPath("Dolbeau-Mistassini", "Rosemere", 4194, 4574, 0);
        company.addPath("Mont-Laurier", "Les Coteaux", 9588, 9759, 8);
        company.addPath("Sainte-Anne-des-Plaines", "Amos", 7568, 8018, 4);
        company.addPath("Cowansville", "Lavaltrie", 4371, 4457, 8);
        company.addPath("Beauharnois", "Lachute", 15301, 15352, 2);
        company.addPath("La Tuque", "Montmagny", 12802, 12977, 1);
        company.addPath("Sainte-Marthe-sur-le-Lac", "Pincourt", 15437, 15454, 2);
        company.addPath("Becancour", "Roberval", 15613, 15856, 0);
        company.addPath("Saint-Felicien", "Baie-Comeau", 14953, 15273, 1);
        company.addPath("Prevost", "Mercier", 5848, 5914, 3);
        company.addPath("L'Ile-Perrot", "Notre-Dame-de-l'Ile-Perrot", 14713, 14715, 7);
        company.addPath("Lorraine", "Coaticook", 14228, 14394, 2);
        company.addPath("Saint-Sauveur", "Mont-Tremblant", 14344, 14385, 7);
        company.addPath("Otterburn Park", "Bois-des-Filion", 15090, 15134, 6);
        company.addPath("Notre-Dame-des-Prairies", "Marieville", 3635, 3706, 1);
        company.addPath("Nicolet", "Farnham", 6517, 6624, 5);
        company.addPath("Acton Vale", "Chibougamau", 9703, 10196, 6);
        company.addPath("Louiseville", "Carignan", 7251, 7344, 7);
        company.addPath("La Sarre", "Delson", 17609, 18182, 6);
        company.addPath("Asbestos", "Sainte-Anne-des-Monts", 3320, 3873, 7);
        company.addPath("Port-Cartier", "Saint-Remi", 7661, 8392, 2);
        company.addPath("Lac-Megantic", "Sainte-Agathe-des-Monts", 8000, 8268, 1);
        company.addPath("Contrecoeur", "Lac-Brome", 16130, 16219, 2);
        company.addPath("Charlemagne", "Sainte-Adele", 6382, 6438, 1);

        //Trajets associés aux chauffeurs
        company.linkDriverToPath("MUNA15", new int[]{3, 4, 7, 19, 25, 34, 44});
        company.linkDriverToPath("SUMG15", new int[]{31, 39, 42, 49});
        company.linkDriverToPath("BEAJ12", new int[]{9, 17, 28, 32, 41});
        company.linkDriverToPath("BEAJ12", new int[]{15, 16, 21, 38, 40, 43});
        company.linkDriverToPath("MARC12", new int[]{14, 18, 24, 26, 30, 33, 37});
        company.linkDriverToPath("HALD15", new int[]{0, 11, 23, 48});
        company.linkDriverToPath("FERC15", new int[]{8, 10, 13, 27});
        company.linkDriverToPath("HUNS13", new int[]{1, 2, 22, 29});
        company.linkDriverToPath("HARP12", new int[]{5, 12, 20, 36});
        company.linkDriverToPath("DANL10", new int[]{6, 35, 45, 46, 47});

    }
}
