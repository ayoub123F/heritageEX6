public class DVD implements Empruntable {
    private String titre;
    private String realisateur;
    private boolean emprunte;

    public DVD(String titre, String realisateur) {
        this.titre = titre;
        this.realisateur = realisateur;
    }

    @Override
    public void emprunter() {
        emprunte = true;
        System.out.println("Le DVD \"" + titre + "\" a été emprunté.");
    }

    @Override
    public void retourner() {
        emprunte = false;
        System.out.println("Le DVD \"" + titre + "\" a été retourné.");
    }
}
