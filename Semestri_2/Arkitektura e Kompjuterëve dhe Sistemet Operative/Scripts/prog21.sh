#!/bin/bash

#
# Skripta për realizimin e disa operacioneve aritmetike, duke përdorur komandë-rreshtin
#
echo "Të llogaritet shuma S1: "
S1=$(expr $1 + $2 + $3)

echo "Shuma e fituar sipas formulës S1=\$1+\$2+\$3 është: S1=$S1"
echo "Të llogaritet prodhimi P1: "

P1=$(expr $2 \* $3)
echo "Prodhimi sipas formulës P1=\$1\*\$3 është: P1=$P1"
