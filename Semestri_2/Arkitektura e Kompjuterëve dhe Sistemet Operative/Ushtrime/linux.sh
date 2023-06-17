#!/bin/bash
# Fshije rreshtin e par nese nuk e ki
#
#Krahasimi i dy variablave dhe shumezimi i tyre duke perdorur kushtin if…then…else dhe read
#
clear
echo "Jepni vleren e variables y:"
read y

echo "Jepni vleren e variables z:"
read z

if [ $y -gt $z ]; then
    echo "Numri $y eshte me i madh se numri $z"
else
    echo "Numri $y eshte me i vogel ose e barabart me numri $z"
fi
echo "Shumezimi eshte S=$(expr $y \* $z)"


# Ne vijim kemi variablat y dhe z
# Jepni vleren e variables y:
# 5
# Jepni vleren e variables z:
# 3
# Numri 5 eshte me i madh se numri 3
# Shumezimi eshte 15

#
#Krahasimi i variablave dhe zbritja e tyre duke perdorur kushtin if…then…else dhe read
#
clear
echo "Jepni x"
read x

echo "Jepni y"
read y

if [ $x -gt $y ]; then
    echo "Numri $x me i madh se $y"
    d=$(expr $x - $y)
    echo "Zbritja eshte d=$d"
else
    echo "Numri $x me i vogel se $y"
    c=$(expr $y - $x)
    echo "Zbritja eshte c=$c"
fi

#OUTPUT 1:
# Jepni x
# 4
# Jepni y
# 5
# Numri 4 me i vogel se 5
# Zbritja eshte c=1

#OUTPUT 2:
# Jepni x
# 5
# Jepni y
# 4
# Numri 5 me i madh se 4
# Zbritja eshte d=1

#
#Llogaritja e shumes permes urdherit for...do...done duke perdorur kushtin if
#
clear
echo "Jepni vlerën e n, por jo më shumë se n=30 (nëse i=0; i<=n;i++)"
read n

if [ "$n" -le 30 ]; then
    echo "Në fillim S=0, ndërsa shuma llogaritet sipas formules S=S+i dhe i=$n"
    S=0
    for ((i = 0; i <= n; i++)); do
        S=$((S + i))
        echo "Për i=$i, shuma është S=$S"
    done
else
    echo "Për n=$n > 30: Rezultati është jashtë rangut. Ju lutem jepni një vlerë për n <= 30!"
fi

#OUTPUT:
# Jepni vlerën e n, por jo më shumë se n=30 (nëse i=0; i<=n;i++)
# 4
# Në fillim S=0, ndërsa shuma llogaritet sipas formules S=S+i dhe i=4
# Për i=0, shuma është S=0
# Për i=1, shuma është S=1
# Për i=2, shuma është S=3
# Për i=3, shuma është S=6
# Për i=4, shuma është S=10

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


#
# QYKY OSHT KODI I SAKT QE DUHET MU KOM PER QIT PROGRAM (INJORO SE SE LYP ME JA SHKRU SHTU PO VEQ SA ME PAS)
#

# clear
echo "Jepni vlerat për variablat x dhe y"
read x y

echo "Vlerat e variablave janë x=$x dhe y=$y"

if [[ "$x" =~ ^[0-9]+$ ]] && [[ "$y" =~ ^[0-9]+$ ]]; then
    if [ "$x" -gt "$y" ]; then
        echo "Numri $x është më i madh se numri $y"
    elif [ "$x" -lt "$y" ]; then
        echo "Numri $x është më i vogël se numri $y"
    else
        echo "Numri $x është i barabartë me numrin $y"
    fi
else
    echo "A janë numrat $x dhe $y? Ju lutem jepni numrat"
fi
