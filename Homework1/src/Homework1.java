import java.util.Scanner;

/**
 * Created by guilmarc on 2016-01-25.
 */
public class Homework1 {

    //Creating the company
    Company company = new Company("AutoSupérieur", 2010);


    public static int readInt(){
       return (new Scanner(System.in)).nextInt();
    }

    public static char readChar(){
        return (new Scanner(System.in)).next().toUpperCase().charAt(0);
    }

    public static void main(String[] args) {
        Homework1 homework1 = new Homework1();
        homework1.generateData();

        char menuInput;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("******************************************************");
            System.out.println("* [R] = Faire une réservation de limousine           *");
            System.out.println("* [L] = Afficher les limousine d'un conducteur       *");
            System.out.println("* [T] = Afficher les trajets et limousines associées *");
            System.out.println("******************************************************");
            System.out.println("* [D] = Ajouter / Supprimer des données              *");
            System.out.println("* [Q] = Quitter le programme                         *");
            System.out.println("******************************************************");

            menuInput = Homework1.readChar(); //scanner.next().toUpperCase().charAt(0);
            //String emptybuffer = scanner.nextLine();

            switch (menuInput) {
                case 'R': homework1.addReservation(scanner);
                    break;
                case 'L': homework1.showLimousineFromDriverID(scanner);
                    break;
                case 'T': homework1.showRoutes();
                    break;
                case 'D': homework1.manageModel(scanner);
                    break;
                case 'Q': //Do nothing, program will close...
                    break;
            }
        }
        while(menuInput != 'Q') ;

        //Closing the scanner
        scanner.close();
    }

    private void showRoutes(){
        System.out.println("\nVoici la liste de tous les trajets de l'entreprise ainsi que les limousines associées :");
        System.out.println("---------------------------------------------------------------------------------------");
        for (Route route : company.getRoutes()) {
            System.out.println(route);
        }
        System.out.println("---------------------------------------------------------------------------------------\n\n");
    }

    private void showLimousineFromDriverID(Scanner scanner){
        //Scanner scanner = new Scanner(System.in);
        System.out.print("Veuillez entrer le numéro du conducteur (exp. FERC15)");
        String driverID = scanner.nextLine().toUpperCase();

        Driver driver = company.getDriverByID(driverID);
        if ( driver != null) {
            System.out.println("\nCe conducteur a déjà utilisé les limousines suivantes :");
            System.out.println("-------------------------------------------------------");

            for (Limousine limousine : driver.getLimousines()) {
                System.out.println(limousine);
            }
            System.out.println("-------------------------------------------------------\n\n");
        } else {
            System.out.println("Conducteur introuvable " + driverID);
        }

        //scanner.close();
    }

    private void manageModel(Scanner scanner){

        char menuInput;
        do {
            System.out.println("******************************************************");
            System.out.println("* [C] = Ajouter un conducteur                        *");
            System.out.println("* [L] = Ajouter une limousine                        *");
            System.out.println("* [T] = Ajouter un trajet                            *");
            System.out.println("******************************************************");
            System.out.println("* [Q] = Quitter le menu                              *");
            System.out.println("******************************************************");

            menuInput = scanner.next().toUpperCase().charAt(0);

            switch (menuInput) {
                case 'C': //String firstName, String lastName, int hiredIn, String address


                    System.out.println("Entrez le prénom du conducteur:");
                    String firstName = scanner.next();

                    System.out.println("Entrez le nom du conducteur:");
                    String lastName = scanner.next();

                    System.out.println("Entrez l'année d'embauche:");
                    int hiredIn = scanner.nextInt();

                    System.out.println("Entrez l'adresse du conducteur:");
                    String address = scanner.next();

                    try {
                        Driver driver = company.addDriver(firstName, lastName, hiredIn, address);
                        System.out.println("Un nouveau conducteur a été ajouté avec le ID = " + driver.getDriverID());
                    } catch (TooManyDriversException exception){
                        exception.printStackTrace();
                    }

                    break;

                case 'L': //String model, String immatriculation, int tankCapacity, int passengerCapacity, String color

                    System.out.println("Entrez le modèle du véhicule:");
                    String model = scanner.next();

                    System.out.println("Entrez le numéro d'immatriculation:");
                    String immatriculation = scanner.next();

                    System.out.println("Entrez la capacité du réservoir (l):");
                    int tankCapacity = scanner.nextInt();

                    System.out.println("Entrez la capacité de passagers:");
                    int passengerCapacity = scanner.nextInt();

                    System.out.println("Entrez la couleur:");
                    String color = scanner.next();

                    Limousine limousine = company.addLimousine(model, immatriculation, tankCapacity, passengerCapacity, color);
                    System.out.println("Une nouvelle limousine a été ajoutée = " + limousine);

                    break;
                case 'T': //String startingCity, String endingCity, float startingOdometer, float endingOdometer, Limousine limousine

                    int limousineIndex = 0;
                    boolean validInput = false;

                    System.out.println("Entrez la ville de départ:");
                    String startingCity = scanner.next();

                    System.out.println("Entrez la ville de destination:");
                    String endingCity = scanner.next();

                    System.out.println("Entrez l'odomètre initial:");
                    float startingOdometer = scanner.nextFloat();

                    System.out.println("Entrez l'odomètre final:");
                    float endingOdometer = scanner.nextFloat();

                    do {
                        for (Limousine thisLimousine : company.getLimousines()){
                            System.out.println("[" + company.getLimousines().indexOf(thisLimousine) + "] " + thisLimousine);
                        }
                        System.out.println("Veuilez choisir une limousine [0 à " + (company.getLimousines().size() - 1) + "]");

                        int limousineInput = scanner.nextInt();
                        if ((0 <= limousineInput) && (limousineInput < company.getLimousines().size())) {

                            limousineIndex = scanner.nextInt();
                            validInput = true;
                        } else {
                            System.out.println("ERROR: Invalid input [" + limousineInput + "]");
                            validInput = false;
                        }
                    } while (! validInput);

                    Route route = company.addRoute(startingCity, endingCity, startingOdometer, endingOdometer, limousineIndex);
                    System.out.println("Une nouvelle route a été ajoutée = " + route);

                    break;
                case 'Q': //Do nothing, program will close...
                    break;
            }
        }
        while(menuInput != 'Q') ;
    }



    private void addReservation(Scanner scanner) {
        boolean validInput = false;
        Limousine selectedlimousine = null;
        Route selectedRoute = null;
        Driver selectedDriver = null;


        do {
            for (Route route : company.getRoutes()){
                System.out.println("[" + company.getRoutes().indexOf(route) + "] " + route);
            }
            System.out.println("Veuilez choisir une route [0 à " + (company.getRoutes().size() - 1) + "]");

            int routeInput = scanner.nextInt();
            if ((0 <= routeInput) && (routeInput < company.getRoutes().size())) {
                selectedRoute = company.getRoutes().get(scanner.nextInt());
                if ( selectedRoute != null ) {


                    do {
                        System.out.println("Il y a présentemente une limousine d'associée à ce trajet.\n Appuyez sur [M] pour modifier la limousine associée ou [C] pour conserver la limousine actuelle:");

                        char choiceInput = scanner.next().toUpperCase().charAt(0);
                        switch (choiceInput) {
                            case 'C':
                                //Nothing to do, we keep the actual limousine
                                validInput = true;
                                break;
                            case 'M':


                                //TODO: CODE HERE
                                do {
                                    for (Limousine limousine : company.getLimousines()){
                                        System.out.println("[" + company.getLimousines().indexOf(limousine) + "] " + limousine);
                                    }
                                    System.out.println("Veuilez choisir une limousine [0 à " + (company.getLimousines().size() - 1) + "]");

                                    int limousineInput = scanner.nextInt();
                                    if ((0 <= limousineInput) && (limousineInput < company.getLimousines().size())) {
                                        selectedlimousine = company.getLimousines().get(scanner.nextInt());
                                        if ( selectedlimousine != null ) {
                                            selectedRoute.setLimousine(selectedlimousine);
                                            validInput = true;
                                        } else {
                                            System.out.println("ERREUR : Limousine non trouvée");
                                            validInput = false;
                                        }
                                    } else {
                                        System.out.println("ERROR: Invalid input [" + limousineInput + "]");
                                        validInput = false;
                                    }
                                } while (! validInput);



                                validInput = true;
                                break;
                            default:
                                validInput = false;
                                System.out.println("ERROR: Invalid input");
                                break;
                        }
                    } while (validInput != true);

                    validInput = true;
                } else {
                    System.out.println("ERREUR : Route non trouvée");
                    validInput = false;
                }
            } else {
                System.out.println("ERROR: Invalid input [" + routeInput + "]");
                validInput = false;
            }
        } while (! validInput);



        //Selecting a driver
        for (Driver driver : company.getDrivers()){
            System.out.println("[" + company.getDrivers().indexOf(driver) + "] " + driver);
        }
        System.out.println("Veuilez choisir un conducteur [0 à " + (company.getDrivers().size() - 1) + "]");

        int driverInput = scanner.nextInt();
        if ((0 <= driverInput) && (driverInput < company.getDrivers().size())) {
            selectedDriver = company.getDrivers().get(scanner.nextInt());
            if ( selectedDriver != null ) {
                validInput = true;
            } else {
                System.out.println("ERREUR : Conducteur non trouvée");
                validInput = false;
            }
        } else {
            System.out.println("ERROR: Invalid input [" + driverInput + "]");
            validInput = false;
        }

        company.addReservation(selectedDriver, selectedRoute);

        System.out.println("La réservation a été sauvegardée avec succès");


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
        company.addRoute("Montreal", "Quebec", 2122, 2358, 1);
        company.addRoute("Laval", "Gatineau", 11895, 12051, 4);
        company.addRoute("Longueuil", "Sherbrooke", 12744, 12871, 9);
        company.addRoute("Saguenay", "Levis", 7714, 7893, 7);
        company.addRoute("Trois-Rivieres", "Terrebonne", 14403, 14514, 2);
        company.addRoute("Saint-Jean-sur-Richelieu", "Saint-Laurent", 13402, 13439, 8);
        company.addRoute("Repentigny", "Brossard", 7701, 7733, 3);
        company.addRoute("Drummondville", "Saint-Jerome", 6964, 7082, 3);
        company.addRoute("Shawinigan", "Saint-Hyacinthe", 1972, 2078, 7);
        company.addRoute("Granby", "Blainville", 13072, 13166, 7);
        company.addRoute("Chateauguay", "Rimouski", 14155, 14677, 7);
        company.addRoute("Saint-Eustache", "Victoriaville", 3121, 3280, 1);
        company.addRoute("Rouyn-Noranda", "Salaberry-de-Valleyfield", 10102, 10601, 6);
        company.addRoute("Boucherville", "Joliette", 17702, 17749, 3);
        company.addRoute("Mirabel", "Sorel-Tracy", 7737, 7823, 5);
        company.addRoute("Mascouche", "Val-d'Or", 11375, 11786, 9);
        company.addRoute("Alma", "Sainte-Julie", 5620, 5973, 4);
        company.addRoute("Boisbriand", "Vaudreuil-Dorion", 15974, 16002, 7);
        company.addRoute("Sept-Iles", "Sainte-Therese", 13910, 14660, 4);
        company.addRoute("Saint-Constant", "Magog", 4555, 4666, 5);
        company.addRoute("Chambly", "La Prairie", 18870, 18887, 6);
        company.addRoute("Varennes", "Beloeil", 11480, 11502, 7);
        company.addRoute("Riviere-du-Loup", "Deux-Montagnes", 17263, 17682, 4);
        company.addRoute("Saint-Lazare", "L'Assomption", 12270, 12342, 6);
        company.addRoute("Sainte-Catherine", "Candiac", 2732, 2737, 6);
        company.addRoute("Mont-Saint-Hilaire", "Saint-Basile-le-Grand", 11141, 11148, 9);
        company.addRoute("Dolbeau-Mistassini", "Rosemere", 4194, 4574, 0);
        company.addRoute("Mont-Laurier", "Les Coteaux", 9588, 9759, 8);
        company.addRoute("Sainte-Anne-des-Plaines", "Amos", 7568, 8018, 4);
        company.addRoute("Cowansville", "Lavaltrie", 4371, 4457, 8);
        company.addRoute("Beauharnois", "Lachute", 15301, 15352, 2);
        company.addRoute("La Tuque", "Montmagny", 12802, 12977, 1);
        company.addRoute("Sainte-Marthe-sur-le-Lac", "Pincourt", 15437, 15454, 2);
        company.addRoute("Becancour", "Roberval", 15613, 15856, 0);
        company.addRoute("Saint-Felicien", "Baie-Comeau", 14953, 15273, 1);
        company.addRoute("Prevost", "Mercier", 5848, 5914, 3);
        company.addRoute("L'Ile-Perrot", "Notre-Dame-de-l'Ile-Perrot", 14713, 14715, 7);
        company.addRoute("Lorraine", "Coaticook", 14228, 14394, 2);
        company.addRoute("Saint-Sauveur", "Mont-Tremblant", 14344, 14385, 7);
        company.addRoute("Otterburn Park", "Bois-des-Filion", 15090, 15134, 6);
        company.addRoute("Notre-Dame-des-Prairies", "Marieville", 3635, 3706, 1);
        company.addRoute("Nicolet", "Farnham", 6517, 6624, 5);
        company.addRoute("Acton Vale", "Chibougamau", 9703, 10196, 6);
        company.addRoute("Louiseville", "Carignan", 7251, 7344, 7);
        company.addRoute("La Sarre", "Delson", 17609, 18182, 6);
        company.addRoute("Asbestos", "Sainte-Anne-des-Monts", 3320, 3873, 7);
        company.addRoute("Port-Cartier", "Saint-Remi", 7661, 8392, 2);
        company.addRoute("Lac-Megantic", "Sainte-Agathe-des-Monts", 8000, 8268, 1);
        company.addRoute("Contrecoeur", "Lac-Brome", 16130, 16219, 2);
        company.addRoute("Charlemagne", "Sainte-Adele", 6382, 6438, 1);

        //Trajets associés aux chauffeurs
        company.linkDriverToRoute("MUNA15", new int[]{3, 4, 7, 19, 25, 34, 44});
        company.linkDriverToRoute("SUMG15", new int[]{31, 39, 42, 49});
        company.linkDriverToRoute("BEAJ12", new int[]{9, 17, 28, 32, 41});
        company.linkDriverToRoute("BEAJ12", new int[]{15, 16, 21, 38, 40, 43});
        company.linkDriverToRoute("MARC12", new int[]{14, 18, 24, 26, 30, 33, 37});
        company.linkDriverToRoute("HALD15", new int[]{0, 11, 23, 48});
        company.linkDriverToRoute("FERC15", new int[]{8, 10, 13, 27});
        company.linkDriverToRoute("HUNS13", new int[]{1, 2, 22, 29});
        company.linkDriverToRoute("HARP12", new int[]{5, 12, 20, 36});
        company.linkDriverToRoute("DANL10", new int[]{6, 35, 45, 46, 47});

    }
}
