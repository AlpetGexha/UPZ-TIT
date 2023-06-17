#!/bin/bash
#
#Krahasimi i dy variablave dhe shumezimi i tyre duke perdorur kushtin if…then…else dhe read
#
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
