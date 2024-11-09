package jeuCoreWar.genetique;
import java.util.*;

public class Population {
    
    //faire une liste d'individu donc de warrior
    private List<Individu> individus;

    //créer la population
    public Population(int taille,Individu individu_de_base) {
        this.individus = new ArrayList<>();
        for (int i = 0; i < taille; i++) {
            Individu individu = individu_de_base.copy();
            this.individus.add(individu);
        }
    }


    //récuperer la liste d'individu
    public List<Individu> getIndividus() {
        return this.individus;
    }
    // applique une mutation aléatoire à chaque individu de la population
    public void mutationGenerale(){
            for (Individu individu : this.individus) {
                individu.mutationAleatoire();
            }
        }
    //trie par selection
    public void trierParEfficacite() {
        for (int i = 0; i < this.individus.size() - 1; i++) {
            int maxI = i;
            for (int j = i + 1; j < this.individus.size(); j++) {
                if (this.individus.get(j).getEfficacite() > this.individus.get(maxI).getEfficacite()) {
                    maxI = j;
                }
            }
            Individu indi = this.individus.get(i);
            this.individus.set(i, this.individus.get(maxI));
            this.individus.set(maxI, indi);
        }
    }
}
