import java.util.Scanner;

public class Homework3 {

    //ArrayList<Student> students = new ArrayList<Student>();
    //ArrayList<Course> courses = new ArrayList<Course>();

    static University university = new University();

    public static void main(String[] args) {

        Homework3 homework3 = new Homework3();
        homework3.generateData();

        //For test only
        //university.showCoursesForStudentIndex(0);
        //university.showStudentsForCourseIndex(18);

        char menuInput;
        Scanner scanner = new Scanner(System.in);

        //Affichage du menu principal
        do {
            System.out.println("******************************************************");
            System.out.println("* [L] = Lecture des données à partir d'un fichier    *");
            System.out.println("* [I] = Inscription de l'étudiant                    *");
            System.out.println("* [E] = Liste des étudiants inscrits à un cours      *");
            System.out.println("* [C] = Liste des cours suivis par l'étudiant        *");
            System.out.println("* [S] = Sauvegarde des données dans un fichier       *");
            System.out.println("******************************************************");
            System.out.println("* [Q] = Quitter le programme                         *");
            System.out.println("******************************************************");

            menuInput = scanner.next().toUpperCase().charAt(0);

            switch (menuInput) {
                case 'L': homework3.readDataFromFile();
                    break;
                case 'I': homework3.manageInscriptions(scanner);
                    break;
                case 'E': homework3.showStudentsForCourse(scanner);
                    break;
                case 'C': homework3.showCoursesForStudent(scanner);
                    break;
                case 'S': homework3.saveDataToFile();
                    break;
                case 'Q': //Do nothing, program will close...
                    break;
            }
        }
        while(menuInput != 'Q') ;

        //Closing the scanner
        scanner.close();

    }

    public void readDataFromFile() {

    }

    public void manageInscriptions(Scanner scanner){

    }

    public void showStudentsForCourse(Scanner scanner){

    }

    public void showCoursesForStudent(Scanner scanner){

    }

    public void saveDataToFile(){

    }

    public void generateData(){

        Course INF1001 = new Course("INF1001", "Programmation Web", 40);
        Course INF1002 = new Course("INF1002", "Introduction à la programmation objet", 40);
        Course INF1004 = new Course("INF1004", "Structures de données et algorithmes", 40, INF1002);
        Course INF1006 = new Course("INF1006", "Analyse et modélisation", 40, INF1004);
        Course INF1007 = new Course("INF1007", "Conception de logiciels", 40, INF1006);
        Course PIF1005 = new Course("PIF1005", "Mathématiques pour informaticiens I", 40);
        Course PIF1006 = new Course("PIF1006", "Mathématiques pour informaticiens II", 40, PIF1005);
        Course INF1008 = new Course("INF1008", "Analyse et conception d'algorithmes", 40, PIF1005, INF1004);
        Course SIF1015 = new Course("SIF1015", "Systèmes d'exploitation", 40);
        Course INF1009 = new Course("INF1009", "Réseaux d'ordinateurs I", 40, SIF1015);
        Course INF1010 = new Course("INF1010", "Réseaux d'ordinateurs II", 40, INF1009);
        Course INF1011 = new Course("INF1011", "Génie logiciel", 40, INF1007);
        Course INF1014 = new Course("INF1014", "Aspects juridiques de l'informatique (1 crédit)", 40);
        Course INF1015 = new Course("INF1015", "Stage d'informatique I", 40);
        Course INF1016 = new Course("INF1016", "Stage d'informatique II", 40);
        Course INF1034 = new Course("INF1034", "Introduction aux interfaces utilisateur", 40, INF1002);
        Course INF1035 = new Course("INF1035", "Concepts avancés en objet",40, INF1004);
        Course SIF1053 = new Course("SIF1053", "Architecture des ordinateurs", 40);
        Course SMI1001 = new Course("SMI1001", "Bases de données I", 40);
        Course SMI1002 = new Course("SMI1002", "Bases de données II", 40, SMI1001);
        Course STT1001 = new Course("STT1001", "Probabilités et statistiques", 40);
        Course TIN1003 = new Course("TIN1003", "Science, technologie et société (2 crédits)", 40);

        //Cours optionnels (21 crédits)
        //L'étudiant doit suivre les neuf (9) crédits de cours d'informatique suivants :

        Course INF1020 = new Course("INF1020", "Commerce électronique", 40);
        Course INF1030 = new Course("INF1030", "Introduction au développement d'applications mobiles (version Android)", 40, INF1035);
        Course INF1031 = new Course("INF1031", "Développement d'applications mobiles avancées (version Android)", 40, INF1030);

        //L'étudiant doit suivre six (6) ou neuf (9) crédits parmi les cours d'informatique suivants :

        Course INF1021 = new Course("INF1021", "Les architectures réparties", 40, INF1009);
        Course INF1032 = new Course("INF1032", "Introduction au développement d'applications mobiles (plateforme IOS)", 40);
        Course INF1033 = new Course("INF1033", "Sujets spéciaux en développement de logiciel ou en développement d'applic. mobiles", 40);
        Course SIF1032 = new Course("SIF1032", "Graphisme par ordinateur", 40, PIF1006, INF1004);

        //L'étudiant peut suivre zéro (0) ou trois (3) crédits parmi les cours d'informatique du bloc de cours optionnels du cheminement développement de logiciels.

        Course INF1012 = new Course("INF1012", "Élaboration et gestion de projets scientifiques", 40, INF1011);
        Course INF1013 = new Course("INF1013", "Environnement de développement et composantes logicielles", 40, INF1035, SIF1015);
        Course INF1018 = new Course("INF1018", "Analyse de programmes", 40, INF1035);
        Course PRO1027 = new Course("PRO1027", "Programmation scientifique en C", 40, INF1002);

        //L'étudiant doit suivre trois (3) crédits de cours d'enrichissement parmi la liste suivante :

        Course ANG1015 = new Course("ANG1015", "English in the workspace", 40);
        Course ANG1017 = new Course("ANG1017", "English for Academic and Professional Purposes", 40, ANG1015);
        Course ANG1019 = new Course("ANG1019", "Everyday English I", 40);
        Course ANG1020 = new Course("ANG1020", "Written English for Business", 40);
        Course ANG1036 = new Course("ANG1036", "Grammar", 40);
        Course ESP1012 = new Course("ESP1012", "Espagnol écrit et parlé I", 40);
        Course ESP1013 = new Course("ESP1013", "Espagnol écrit et parlé II", 40, ESP1012);
        Course ESP1017 = new Course("ESP1017", "Espagnol intermédiaire I", 40, ESP1013);

        university.addCourse(INF1001);
        university.addCourse(INF1002);
        university.addCourse(INF1004);
        university.addCourse(INF1006);
        university.addCourse(INF1007);
        university.addCourse(PIF1005);
        university.addCourse(PIF1006);
        university.addCourse(INF1008);
        university.addCourse(SIF1015);
        university.addCourse(INF1009);
        university.addCourse(INF1010);
        university.addCourse(INF1011);
        university.addCourse(INF1014);
        university.addCourse(INF1015);
        university.addCourse(INF1016);
        university.addCourse(INF1034);
        university.addCourse(INF1035);
        university.addCourse(SIF1053);
        university.addCourse(SMI1001);
        university.addCourse(SMI1002);
        university.addCourse(STT1001);
        university.addCourse(TIN1003);

        university.addCourse(INF1020);
        university.addCourse(INF1030);
        university.addCourse(INF1031);

        university.addCourse(INF1021);
        university.addCourse(INF1032);
        university.addCourse(INF1033);
        university.addCourse(SIF1032);

        university.addCourse(INF1012);
        university.addCourse(INF1013);
        university.addCourse(INF1018);
        university.addCourse(PRO1027);

        university.addCourse(ANG1015);
        university.addCourse(ANG1017);
        university.addCourse(ANG1019);
        university.addCourse(ANG1020);
        university.addCourse(ANG1036);
        university.addCourse(ESP1012);
        university.addCourse(ESP1013);
        university.addCourse(ESP1017);

        //String permanentCode, String lastName, String firstName, String programNumber, int credits, float cumulativeAverage, int numberOfInscriptions)
        university.addStudent(new Student("CHOM02057803", "Choinière-Guilmette", "Marco", "7833", 21, 3.9f, 4));
        university.addStudent(new Student("LEMA05068204", "Lemire", "Adam", "7833", 21, 4.1f, 4));
        university.addStudent(new Student("NOUL05049504", "Noundou", "Leonnel", "7833", 21, 3.0f, 4));
        university.addStudent(new Student("LARM17078901", "Larouche", "Mathieu", "7833", 21, 3.9f, 4));
        university.addStudent(new Student("MAUP05067802", "Maurice", "Philippe", "7833", 21, 3.7f, 4));

        university.addInscription(0, 2);
        university.addInscription(0, 5);
        university.addInscription(0, 18);
    }
}
