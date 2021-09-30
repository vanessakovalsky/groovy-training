def macollection = [
    'nom': 'David',
    'prenom': 'Vanessa',
    'couleur_preferee': 'bleu'
]

println macollection

macollection.each { toto ->
    println "cle : ${toto.key} et valeur : ${toto.value}"
}

for (ligne in macollection) {
    println "cle : ${ligne.key} et valeur : ${ligne.value}"
}