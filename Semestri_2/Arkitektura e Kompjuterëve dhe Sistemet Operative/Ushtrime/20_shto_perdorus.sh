#!/bin/bash

# Funksioni për të shtuar përdoruesin dhe fjalëkalimin
addUser() {
    username=$1
    password=$2
    shift 2 # 2 parametrat e par 
    comment="$@" # te gjitha argumetent pas (pas 2 te paravae ne rastin tone)

    echo "Përdoruesi $username ($comment) ka fjalëkalimin $password"

    # Shtimi i perdoruesit ne Linux (Kali)
    # sudo useradd -m $username -p $password
    # # check if user its added
    # if [ $? -eq 0 ]; then # $? is the exit status of the last executed command.
    #     echo "Përdoruesi u shtua me sukses"
    # else
    #     echo "Përdoruesi nuk u shtua"
    # fi
}

echo "Starting......."
addUser user1 "user1123" "Shum user i mir osht qyku besoma"
addUser user2 "user2123"
echo "Finish........"
