#!/bin/bash

#
# Përdorimi i urdhërave for...do...done si rast iteracioni
#
clear
echo "Jepni vlerën e n, duke treguar sa herë dëshirojmë të përsëritet cikli (loop)"
read n
for ((i = 0; i <= n; i++)); do
    echo "Mirë se vini $i herë"
done
