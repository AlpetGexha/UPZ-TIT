#!/bin/bash

#
# Llogaritja e prodhimit përmes urdhërit unazor for...do...done
#
clear
echo "Jepni vlerën për "n" si vlerë maksimale, por jo më shumë se n=20 (nëse i=1; i<=n; i++): "
read n
echo "Në fillim P=1, ndërsa prodhimi llogaritet sipas formulës P=P*i dhe "i" përmes iteracionit
ndryshon deri në i=$n"
P=1
for ((i = 1; i <= n; i++)); do
    P=$(expr $P \* $i)
    echo "Për i=$i, prodhimi është: P=$P"
done
