public class GestionBibliothequeApp {
    public static void main(String[] args) {
        // Création d'objets Livre et DVD
        Livre livre = new Livre("Le Petit Prince", "Antoine de Saint-Exupéry");
        DVD dvd = new DVD("Inception", "Christopher Nolan");

        // Création de l'utilisateur
        Utilisateur utilisateur = new Utilisateur("John Doe");

        // Emprunt d'objets
        utilisateur.emprunterObjet(livre);
        utilisateur.emprunterObjet(dvd);

        // Retour d'objets
        livre.retourner();
        dvd.retourner();
    }
}
