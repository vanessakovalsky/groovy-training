// Correspondance exacte

def score = /[1-9]{1,2}/

def fichier = new File("./tournament-results.csv")

fichier.eachLine { line ->
            def split = line.split(',')
            if (split[1] ==~ score && split[2] ==~score) {
                println 'Match'
            }
            else {
                println 'Don\'t match'
            }
}

// Contient

//Dans le fichier `tournament-results.csv` vérifier si le contenu de colonne Ro1 est présent dans la colonne Ro2

fichier.eachLine { line ->
            def split = line.split(',')
            if (split[1] =~ score && split[2] =~score) {
                println 'Match'
            }
            else {
                println 'Don\'t match'
            }
}