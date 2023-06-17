#!/bin/bash

#
#
clear
Funksioni1() {
    echo "\$1 është $1"
    echo "\$2 është $2"
    # 1="Puna"
    # Është sintaksë valide. Prandaj këtë mund të ndryshojmë
    # Ndrysho $a:
    a="Puna"
}
### Skripta kryesore fillon nga këtu
a=Puna
b=Veprimi
Funksioni1 $a $b
echo "a është $a"
echo "b është $b"
