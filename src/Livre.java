public class Livre implements Empruntable {
    private String titre;
    private String auteur;
    private boolean emprunte;

    public Livre(String titre, String auteur) {
        this.titre = titre;
        this.auteur = auteur;
    }

    @Override
    public void emprunter() {
        emprunte = true;
        System.out.println("Le livre \"" + titre + "\" a été emprunté.");
    }

    @Override
    public void retourner() {
        emprunte = false;
        System.out.println("Le livre \"" + titre + "\" a été retourné.");
    }
}
