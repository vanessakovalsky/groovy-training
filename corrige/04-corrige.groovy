
// Reading files

def fichier = new File("./tournament-results.csv")
println "Fichier : ${fichier.text}"

// Créer et écrire dans un fichier

def newFile = new File("./pretty-results.txt")
newFile.createNewFile() 

def contenu = """"""

fichier.eachLine { line ->
            def new_line =  line.replaceAll(",",' |')
            contenu += """| ${new_line}\n"""
}

newFile.write(contenu)

println "Nouveau Fichier : ${newFile.text}"

// Copier / déplacer des fichiers

def source = "./tournament-results.csv"
def target = "./ping-pong-2018/tournament-results.csv"

def directory = new File(target);
    if (! directory.exists()){
        directory.mkdir();
    }


java.nio.file.Files.copy(
    new java.io.File(source).toPath(), 
    new java.io.File(target).toPath(),
    java.nio.file.StandardCopyOption.REPLACE_EXISTING,
    java.nio.file.StandardCopyOption.COPY_ATTRIBUTES 
)