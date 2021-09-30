// Hello world

def hello = 'Hello, World!'
println hello


// Définir des variables

def un      = 1
def deux    = 2
def trois   = 3

def total = un * trois 
total = total + deux

println total

// Chemin logique

def nombre = 25

if (nombre < 10) {
    println nombre + ' fait moins que 10.'
} else {
    println 'Whoa, '+ nombre + ' est trop grand!'
}