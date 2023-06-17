#!/bin/bash

#
# Në shembullin në vazhdim është paraqitur një program që mundëson përzgjedhjen e opsioneve
# të radhitura.
#
clear
echo -n "Ju lutem shënoni cilin opsion dëshironi të paraqiteni!"
read Emri
echo "Mëny për $Emri
    1. Paraqiteni listën e direktoriumeve aktuale
    2. Paraqiteni se kush është kyçur në sistem
    3. Paraqiteni datën dhe kohën aktuale
    4. Dilni nga sistemi
"
read hyrja
hyrja1="1"
hyrja2="2"
hyrja3=$(date)
hyrja4=$(exit)
while [ "$hyrja" = "3" ]; do
    echo "Data dhe koha aktuale: $hyrja3"
done
while [ "$hyrja" = "4" ]; do
    echo "Mirupafshim $hyrja4"
done
