#!/bin/bash

#
# Llogaritja e shumës përmes urdhërit ciklik for...do...done
#
clear
echo "Jepni vlerën integjer për "n" si vlerë maksimale (nëse i=0; i<=n; i++): "
read n
echo "Ndërsa "i" ndryshon në hapin 1 dhe i<=$n"
echo "Në fillim S=0, ndërsa shuma llogaritet sipas formulës S=S+i: "
S=0
for ((i = 0; i <= n; i++)); do
    S=$(expr $S+$i)
done
echo "Shuma është: S=$S"
