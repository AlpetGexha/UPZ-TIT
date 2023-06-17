#!/bin/bash

#
#Përdorimi i urdhërit for-in për gjetjen e fajllave ekzekutues në kuadër të direktorimit aktual
#
clear
for i in *; do
    if [ -f "$i" -a -x "$i" ]; then
        echo "Fajlli ekzekutues $i "
    fi
done
