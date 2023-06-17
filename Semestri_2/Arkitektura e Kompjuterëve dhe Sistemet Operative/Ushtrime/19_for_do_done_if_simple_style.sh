#!/bin/bash

#
#Llogaritja e shumes permes urdherit for...do...done duke perdorur kushtin if
#

echo "Jepni vlerën e n"
read n

count=0
for ((i = 0; i <= n; i++)); do
    if [ $(expr $count + $i) -gt 100 ]; then
        echo "Shuma ka arritur rezultatin maksimal"
        break
    fi

    count=$(expr $count + $i)
    echo "Për i=$i, shuma është S=$count"
done

#OUTPUT1:
#Në fillim S=0, ndërsa shuma llogaritet sipas formules S=S+i dhe i=4
# Për i=0, shuma është S=0
# Për i=1, shuma është S=1
# Për i=2, shuma është S=3
# Për i=3, shuma është S=6
# Për i=4, shuma është S=10

#OUTPUT2:

# Jepni vlerën e n, por jo më shumë se n=30 (nëse i=0; i<=n;i++)
# 50
# Për n=50 > 30: Rezultati është jashtë rangut. Ju lutem jepni një vlerë për n <= 30!
