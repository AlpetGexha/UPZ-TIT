#!/bin/bash
#
# Përdorimi i urdhërit if...then...else
#
clear
a=3
b=4
if test $a -gt $b; then
    echo "Variabla të pavarura janë a dhe b"
    #formula për llogaritjen e mbledhjes shënohet si në vazhdim
    # Nëse a është më e madhe se b realizohet mbledhja, nëse jo realizohet zbritja
    c=$(expr $a + $b)
    echo "Rezultati i shumës për variablat e pavarura a=$a dhe b=$b është: "
    echo "Shuma c=a+b është: c=$c"
else
    #formula për llogaritjen e zbritjes shënohet si në vazhdim
    d=$(expr $b - $a)
    echo "Për vlerat e argumenteve të dhëna: a=$a dhe b=$b"
    echo "Pra, argumenti a është më i vogël se b"
    echo "Rezultati i zbritjes është: d=b-a, prandaj d=$d"
fi
