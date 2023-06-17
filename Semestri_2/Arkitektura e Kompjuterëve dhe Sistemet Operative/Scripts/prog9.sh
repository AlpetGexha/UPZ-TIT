#!/bin/bash

#
# Përdorimi i komandës if…then…else përmes komandës read duke përdorur disa if
#
clear
echo "Jepni vlerat e variablave a, b, c: "
read a b c
echo "Pra, vlerat e variablave janë: a=$a, b=$b, c=$c"
if [ "$a" -lt "$b" ]; then
    echo "Numri a është më i vogël se numri b"
    if [ "$a" -eq "$b" ]; then
        echo "Numri a=$a dhe numri b=$b janë numra të barabartë"
    else
        if [ "$a" -le "$c" ]; then
            echo "Numri a=$a nuk është më i vogël ose i barabartë me numrin c=$c"
        fi
    fi
else
    echo "Numri a është më i madh se numri b dhe c"
fi
