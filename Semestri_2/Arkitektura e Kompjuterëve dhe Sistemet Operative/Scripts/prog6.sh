#!/bin/bash
#
# Përdorimi i komandës if...then...else përmes komandës read
#
clear
echo "Jepni vlerat e variablave a dhe b: "
read a b
echo "Vlerat e variablave janë: a=$a dhe b=$b."
if [ $a -lt $b ]; then
    echo "Numri a është më i vogël se numri b"
else
    echo "Numri a është më i madh se numri b"
fi
