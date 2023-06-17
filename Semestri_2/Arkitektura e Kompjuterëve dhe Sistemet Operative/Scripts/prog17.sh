#!/bin/bash

#
#Vendosja e unazës (ciklit) së jashtme dhe të brendshme
#
clear
for ((i = 1; i <= 9; i++)); do     ### cikli i jashtëm ###
    for ((j = 1; j <= 9; j++)); do ### cikli i brendshëm ###
        echo -n "$i"
    done
    echo " " #### vendos rresht të ri ###
done
