#!/bin/bash

#
# Llogaritja e prodhimit përmes urdhërit unazor: for...do...done
#
# Në Shell Script kemi rang të kufizuar të llogaritjeve dhe rezultateve…
clear
echo "Jepni vlerën për "n", por jo më shumë se n=20 (nëse i=1;i<=n; i++): "
read n
if test $n -le 20; then
    echo "Në fillim P=1, ndërsa prodhimi llogaritet sipas formulës P=P*i dhe "i" është i=$n"
    P=1
    for ((i = 1; i <= n; i++)); do
        P=$(expr $P \* $i)
        echo "Për i=$i prodhimi është: P=$P"
    done
else
    echo "Për n=$n>20: Rezultati ështe jashta rangut. Ju lutemi jepni një vlerë për "n"=<20!"
fi
