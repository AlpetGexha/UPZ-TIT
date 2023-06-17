#!/bin/bash

#
# Skripta për realizimin e urdhërit case
#
if [ -z $1 ]; then
    rental="*** Makina e panjohur ***"
elif [ -n $1 ]; then
    # Përndryshe realizoje argumentin e parë si rental
    rental=$1
fi
case $rental in
"Makinax") echo "Për $rental 0.5 euro për km" ;;
"Makinay") echo "Për $rental 0.9 euro për km" ;;
"Makinaz") echo "Për $rental 1 euro për km" ;;
"Bicikleta") echo "Për $rental 20 cent për km" ;;
*) echo "Kërkojmë falje, por ne nuk kemi makinë me emër të tillë: $rental-" ;;
esac
