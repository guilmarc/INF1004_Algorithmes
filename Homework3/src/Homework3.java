import java.util.*;

public class Homework3 {

    ArrayList<Student> students = new ArrayList<Student>();
    ArrayList<Course> courses = new ArrayList<Course>();

    public static void main(String[] args) {
	// write your code here
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

        courses.add(INF1001);
        courses.add(INF1002);
        courses.add(INF1004);
        courses.add(INF1006);
        courses.add(INF1007);
        courses.add(PIF1005);
        courses.add(PIF1006);
        courses.add(INF1008);
        courses.add(SIF1015);
        courses.add(INF1009);
        courses.add(INF1010);
        courses.add(INF1011);
        courses.add(INF1014);
        courses.add(INF1015);
        courses.add(INF1016);
        courses.add(INF1034);
        courses.add(INF1035);
        courses.add(SIF1053);
        courses.add(SMI1001);
        courses.add(SMI1002);
        courses.add(STT1001);
        courses.add(TIN1003);

        courses.add(INF1020);
        courses.add(INF1030);
        courses.add(INF1031);

        courses.add(INF1021);
        courses.add(INF1032);
        courses.add(INF1033);
        courses.add(SIF1032);

        courses.add(INF1012);
        courses.add(INF1013);
        courses.add(INF1018);
        courses.add(PRO1027);

        courses.add(ANG1015);
        courses.add(ANG1017);
        courses.add(ANG1019);
        courses.add(ANG1020);
        courses.add(ANG1036);
        courses.add(ESP1012);
        courses.add(ESP1013);
        courses.add(ESP1017);

    }
}
