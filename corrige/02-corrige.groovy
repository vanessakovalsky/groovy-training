// Interagir avec les listes

def liste = ['La ligne verte', 'Treize', 'Elles s\'aiment' ]
// Solution 1 on print chaque élément séparément
println liste[0]
println liste[1]
println liste[2]

// Ou plus propre avec une boucle 

for (titre in liste) {
    println titre
}

// Interagir avec les maps


def collection = [
    'titre': 'Champollion',
    'auteur': 'Christian Jacq',
    'genre': 'roman'
]

for (info in collection) {
    println info
}

// Manipuler des listes

def A = [0,1,2,3,4,5,6,7]
def B = [3,4,5,6,7,8,9,10]

def C = A.plus(B)

println C

def D = C.unique()

println D

def E = A.minus(B)

println E

def F = B.intersect(A)

println F

// Trier des listes

def technologies = ['Docker', 'SoapUi', 'Drupal', 'AWS', 'Python', 'Kubernetes']

def alphab = technologies.sort()

println alphab

def longueur = technologies.sort{it.size()}

println longueur

// Filtrer des listes

def filtres = 1..25

println filtres.findAll { it < 15 }

println filtres.findAll { it > 15 }.sum()

println filtres.contains(20)

