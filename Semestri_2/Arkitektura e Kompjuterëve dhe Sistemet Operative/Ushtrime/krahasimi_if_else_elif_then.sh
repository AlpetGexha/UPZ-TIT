#!/bin/bash

#
#Krahasimi e variablave x dhe y duke perdorur kushtin if...then...else dhe elif
#
# clear
echo "Jepni vlerat për variablat x dhe y"
read x y

echo "Vlerat e variablave janë x=$x dhe y=$y"
if [ "$x" -gt "$y" ]; then
    echo "Numri $x është më i madh se numri $y"
elif [ "$x" -lt "$y" ]; then
    echo "Numri $x është më i vogël se numri $y"
elif [ "$x" -eq "$y" ]; then
    echo "Numri $x është i barabartë me numrin $y"
else
    echo "A janë numrat $x dhe $y? Ju lutem jepni numrat"
fi

#OUTPUT 1:
# Jepni vlerat për variablat x dhe y
# 1 4
# Vlerat e variablave janë x=1 dhe y=4
# Numri 1 është më i vogël se numri 4

#OUTPUT 2:
# Jepni vlerat për variablat x dhe y
# 1 1
# Vlerat e variablave janë x=1 dhe y=1
# Numri 1 është i barabartë me numrin 1

#OUTPUT 3:
# Jepni vlerat për variablat x dhe y
# 4 1
# Vlerat e variablave janë x=4 dhe y=1
# Numri 4 është më i madh se numri 1

#OUTPUT 4:
# Jepni vlerat për variablat x dhe y
# e z
# FULL ERROR dhe
# A janë numrat e dhe z? Ju lutem jepni numrat
