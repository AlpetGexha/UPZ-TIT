#!/bin/bash

#
#Skripta për testim të urdhërit while
#
# $# - është komandë për numrin e argumenteve
# Numri i argumenteve mund të ndryshoj
# $0 - kjo komandë jep emrin e programit aktual
clear
if [ $# -eq 0 ]; then
    echo "Gabim, sepse në ekzekutim të programit mungon numri që duhet të shkruhet si argument
në komandë-rreshtin. Shiko sintaksën!"
    echo "Sintaksa është: $0 numri"
    echo "Tek fjala "numri" shënojmë numrin me të cilin dëshirojmë të shumëzojmë ciklin prej i=1
deri i=10"
    echo "Ky program shfrytëzohet për të shtypur tabelën e shumëzimit për numrin e dhënë"
    exit 1
fi
n=$1
i=1
while [ $i -le 10 ]; do
    echo "$n * $i = $(expr $i \* $n)"
    i=$(expr $i + 1)
done
