#!/bin/bash

#
# Përdorimi i funksionit dhe kalimi i argumenteve në funksion
# Emri i funksionit është fnArgumentiFunksionit
fnArgumentiFunksionit() {
    echo "Argumenti 1: " . $1
    echo "Argumenti 2: " . $2
}
fnArgumentiFunksionit "Tungjatjeta" "Të gjithëve"
