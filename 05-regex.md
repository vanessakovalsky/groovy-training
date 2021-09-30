# 05 - Regex

## Pré-requis

* Reprendre le fichier `tournament-results.csv` de l'exercice 4

## Correspondance exacte

* Définir un pattern pour le score (qui contient un ou deux chiffre)
* Dans le fichier `tournament-results.csv` vérifier si la colonne Ro1 et Ro2 correspondent bien au pattern score
* Afficher pour chaque ligne du tableau si cela correspond ou non

* Lancer le fichier `groovy exercise.groovy`
* Vérifier que la sortie correspond à ce qui est attendu.
* Question : Ajouter un espace dans la ligne qui matche. Est ce que cela matche toujours ?


## Contient

* Dans le fichier `tournament-results.csv` vérifier pour les colonnes Ro1 et Ro2 que le contenu contient le pattern score

* Lancer le fichier `groovy exercise.groovy`
* Vérifier que la sortie correspond à ce qui est attendu.
* Question : Ajouter un espace dans la ligne qui matche. Est ce que cela matche toujours ?


### Groupes de Capture

* Rechercher la regex `/ee/` sur le contenu de la colone VS
* Afficher les éléments suivants :
    * un boolen qui dit où est la correspondance
    * le nombre total de correspondance
    * la seconde correspondance et le contenu de ses autres colonnes

* Lancer le fichier `groovy exercise.groovy`
* Vérifier que la sortie correspond à ce qui est attendu.

## Remplacer

* Utiliser regex pourg remplacer tout les nombre `13` par `42` 
* Afficher le resultat (l'ensemble du tableau)

* Lancer le fichier `groovy exercise.groovy`
* Vérifier que le nombre 13 n'est plus présent et a bien été remplacé
