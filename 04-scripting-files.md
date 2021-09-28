# 04 - Script sur un fichier et regex

## Files (basic)

### Pré-requis

* Créer un fichier tournament-results.csv avec le contenu suivant : 
```csv
opponent,round1,round2,round3
red-sheep,1,13,11
blue-dogs,14,14,N/A
yellow-canaries,11,10,13
green-cows,6,4,N/A
```

### Reading files

* Définir une variable File qui pointe sur le fichier  `tournament-results.csv` .
* Afficher le contenu du fichier

* Lancer le fichier `groovy exercise.groovy`
* Vérifier que la sortie correspond au contenu du fichier

### Créer et écrire dans un fichier

* Définir une variable File qui pointe sur le fichier  `pretty-results.txt`.
* Ecrire un peu de code qui crée le fichier s'il n'existe pas.
* Puis, écrire une version amélioré du contenu de `tournament-results.csv` dans `pretty-results.txt`.
* Essayer d'obtenir un résultat qui ressemble à : 

```
             VS | Ro1 | Ro2 | Ro3 |
      red-sheep |   7 |  13 |  11 |
      blue-dogs |  13 |  11 | N/A |
yellow-canaries |  11 |  10 |  13 |
     green-cows |   6 |   4 | N/A |
```
* Finalement, afficher le contenu de `pretty-results.txt`.

* Lancer le fichier `groovy exercise.groovy`
* Vérifier que votre tableau est plus joli.
* Question : comment parser et afficher correctement si le fichier est très long ? Comment améliorer cela ?

### Copier / déplacer des fichiers

* Ecrire un script qui copie le fichier `tournament-results.csv` dans un sous-dossier `ping-pong-2018`.
* Créer le sous-dossier si nécessaire.
* Vérifier si `ping-pong-2018/tournament-results.csv` existe. Si c'est le cas, le renommer en `turqoise-turtles-results.csv`.

* Lancer le fichier `groovy exercise.groovy`
* Verifier que la sortie et la structure des fichiers sont correct



