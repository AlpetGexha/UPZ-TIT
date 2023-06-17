#!/bin/bash

PS3="Zgjidh (1-5):"
echo "Zgjidh ngjyrën nga lista e ngjyrave: "
select Emri in E_kuqe E_gjelbërt E_kaltërt E_verdhë E_bardhë; do
    break
done
echo "Ju keni zgjedhur ngjyrën $Emri"
