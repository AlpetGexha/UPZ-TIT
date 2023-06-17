#!/bin/bash
#
# Krahasimi i vlerave të dy variablave të ndryshme
#
clear
echo "Në vijim kemi variablat a dhe b"

echo "Jepni vlerën e variables a: "
read a

echo "Jepni vlerën e variables b: "
read b

echo "Pra, vlera e a=$a dhe b=$b"
if [ $a -gt $b ]; then
    echo "Numri $a është më i madh se numri $b"
else
    echo "Numri $a është më i vogël se numri $b"
fi
