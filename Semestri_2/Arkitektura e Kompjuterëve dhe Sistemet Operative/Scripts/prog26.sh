#!/bin/bash

#
#
clear
opsionet=(
    "Paraqiteni listën e direktoriumeve aktuale"
    "Paraqiteni se kush është kyçur në sistem"
    "Paraqiteni datën dhe kohën aktuale"
    "Dilni nga sistemi"
)
select option in "${opsionet[@]}"; do
    case "$REPLY" in
    1) ls -l ;;
    2) who ;;
    3) date ;;
    4) break ;;
    esac
done
