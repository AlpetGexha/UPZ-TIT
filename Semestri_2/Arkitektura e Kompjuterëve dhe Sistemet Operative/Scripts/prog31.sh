#!/bin/bash

#
# Llogaritja e shumës përmes funksionit
# Funksioni si bllok kod mundëson realizimin e llogaritjes
#
clear
LlogaritjaShumës() {
    shuma=$(($1 + $2))
}
echo "Jepni numrin e parë: "
read num1
echo "Jepni numrin e dytë: "
read num2
LlogaritjaShumës $num1 $num2
echo "Shuma është: $shuma"
