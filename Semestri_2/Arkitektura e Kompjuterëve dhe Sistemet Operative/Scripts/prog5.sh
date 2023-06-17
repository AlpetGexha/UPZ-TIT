#!/bin/bash
#
# Përdorimi i komandës if (me kllapa të mesme) në vend të test
#
clear
a=10
b=20
if [ $a -lt $b ]; then
    echo "Numri a është më i vogël se numri b"
else
    echo "Numri a është me i madh se numri b"
fi
