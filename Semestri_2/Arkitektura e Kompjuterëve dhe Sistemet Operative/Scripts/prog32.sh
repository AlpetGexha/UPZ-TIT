#!/bin/bash

#
#
clear
Shtimi_përdoruesit() {
    PËRDORUESI=$1
    FJALËKALIMI=$2
    shift
    shift
    # Bëjm zhvendosje dy herë, pjesa tjetër është komenti
    KOMENTI=$@
    echo "Përdoruesi i shtuar është $PËRDORUESI $KOMENTI"
    echo "Fjalëkalimi i përdoruesit $PËRDORUESI është $FJALËKALIMI"
    echo "Përdoruesi i shtuar $PËRDORUESI ($KOMENTI) ka fjalëkalimin $FJALËKALIMI"
}
###
# Trupi i skriptës fillon këtu
###
echo "Fillo me skriptën..."
Shtimi_përdoruesit x1 PËRDORUESI1
Shtimi_përdoruesit x2 PËRDORUESI2
Shtimi_përdoruesit x3 PËRDORUESI3
echo "Fundi i skriptës"
