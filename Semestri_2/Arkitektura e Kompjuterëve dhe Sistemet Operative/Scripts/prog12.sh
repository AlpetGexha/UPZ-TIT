#
# Përdorimi i urdhërave for...do...done
#
clear
echo "Jepni një numër të çfardoshëm të tipit integjer: "
read n
for i in 1 2 3 4 5 7 8 9 10; do
    echo "$n * $i =$(expr $i \* $n)"
done
