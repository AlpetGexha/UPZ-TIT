#!/bin/bash
#
# Skripta e cila demonstron argumentet e komandë-rreshtave
#

echo "Numri i përgjithshëm i argumenteve të komandë-rreshtave është $#"
echo "$0 është emri i skriptës"
echo "$1 është argumenti i parë"
echo "$2 është argumenti i dytë"
echo "Të gjitha këto janë: -$* ose $@"
