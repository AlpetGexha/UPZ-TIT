#!/bin/bash

#
#Zëvëndësimi i një stringu me një tjetër - krijimi i vargut
#
clear
listë="artikulli1 artikulli2 artikulli3 artikulli4"
artikujt="Ky artikull është x\n\
Ndërsa x është një nga artikujt në listë \n"
for kriteri in $list; do
    echo -e ${artikujt//x/$kriteri}
done
