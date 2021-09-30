// Définir et appelers les closures

def closure = { println 'Hello, world!'}

closure()

// Définir des paramètres sur les closures

def parameters = { nombre1, nombre2 -> 
    println "nombre 1 : ${nombre1}"
    println "nombre 2 : ${nombre2}"
    def resultat = nombre1 * nombre2
    println "Resultat : ${resultat}"
}

parameters(3,7)

// Portée des Closure

def prefixe = "un-prefixe"

def caract = { chaine ->

    print prefixe 
    println chaine
}

caract('Hello')

