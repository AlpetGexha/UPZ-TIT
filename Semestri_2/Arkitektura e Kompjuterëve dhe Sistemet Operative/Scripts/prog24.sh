#!/bin/bash

#
#Krijimi dhe përdorimi i vargut
#
clear
vargu=(E_kuqe E_gjelbërt E_kaltërt E_verdhë E_bardhë)
ngjyrat=${#vargu[*]}
echo "Vargu ka $ngjyrat ngjyra. Ato janë: "
i=0
while [ $i -lt $ngjyrat ]; do
    echo "$i: ${vargu[$i]}"
    let i++
done
