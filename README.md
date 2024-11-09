# COREWAR

### Présentation projet

Le jeu Core War a été créer en 1984 par D. G. Jones et Alexander Keewatin Dewdney dans
le département informatique de l’université de Western Ontario au Canada. Les règles de jeu
du Core War sont simples, au début d’une partie chaque programme combattant est chargé
dans la mémoire à un endroit aléatoire, puis chaque programme exécute une instruction à tour
de rôle. Le but du jeu est de provoquer l’arrêt des processus des programmes adverses (ce qui se
produit s’ils exécutent une instruction non valide), laissant le programme gagnant seul maître
de la machine.

L’objectif du projet est de fournir un outil permettant de générer des programmes efficace
au Core War avec comme langage imposé le Java. Comme dit précédemment, le Core War est
un jeu de programmation dans lequel deux programmes informatiques sont en concurrence pour
le contrôle d’une machine virtuelle appelée MARS (Memory Array Redcode Simulator). Le but
du jeu est de faire se terminer toutes les instances du (ou des) programme(s) adverse(s).

Dans un premier temps, il a fallu développer une plateforme de simulation de la machine
virtuelle (en utilisant une version simple du langage de programmation appelé RedCode). Dans
un second temps, nous avons dû être capable d’exécuter les programmes écrits en RedCode et
de déterminer le vainqueur. Puis en dernière étape, il a fallu proposer une méthode (construction
aléatoire, système à base de règles ou encore algorithme génétique) permettant d’obtenir
un programme performant.

Ce projet a été réalisé à 3.

---

### Lancement
Pour compiler le programe, laçez la ligne suivante:
	javac -d build src/jeuCoreWar/*/*.java src/jeuCoreWar/Main.java
Pour lancer l'algorithme gégétique, lancez la commande suivante:
	java -cp build jeuCoreWar.Main genetique

 Cette commande vous affiche le code d'un programme selectionné avec un algorithme génétique


Pour lancer une version graphique, lancez la commande suivante:
	java -cp build jeuCoreWar.Main visuel

 Cette commende montre programes très simples s'affronter. Cepandant remarquez qu'il ne peut y avoir de gagnant alor le programe s'arrete après un nombre de tour prédefini


Pour lancer une illustration graphique d'un algorithme génétiquement modifié, lancez la commande suivante:
	java -cp build jeuCoreWar.Main visuelGenetique

 Remarquez que les algorithmes séléctionnés génétiquement pn une tendance générale à devenir des programes détruisant tout sur la mémoire, y compris eux memes


Pour lancer une version console, lancez la commande suivante:
	java -cp build jeuCoreWar.Main console
	
en cas de problèmes avec les commendes de compilation, veillez utiliser le ficher.jar présent dans le dossier build   en remplaçant les instructions suivantes:


java -cp build jeuCoreWar.Main PARAMETRE

par

java -jar build/CoreWar.jar PARAMETRE
	


	

