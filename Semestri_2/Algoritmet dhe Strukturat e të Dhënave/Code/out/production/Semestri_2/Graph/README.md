# Graph

**Graph** - është një grup nyjesh(node) të lidhura njëna me tjetren mes rrugëve të ndryshme (edge).Çdo nyje mund të kenë
disa lidhje me nyje të tjera në grafin e njëjtë.

Grafit përdoret për të modeluar lidhjet dhe ndërveprimet midis elementëve të një sistemi, siç mund të jenë të dhënat,
Personave, Vendeve, Social Network etj.

### Përfaqësimet

Graphi mund të paraqitet në disa mënyra të ndryshme:

- Matrica
- Lista

### Matrica

Matrica e një grafi është një matricë e madhësisë n x n, ku n është numri i nyjeve të grafit. Nëse grafi është i
orientuar, atëherë matrica e tij është matricë e lidhjeve të orientuara, ndërsa nëse grafi është i papërcaktuar, atëherë
matrica e tij është matricë e lidhjeve të papërcaktuara.

Nese ka lidhje te nyjeve A dhe B, atëherë në matricë do të ketë vlerë 1 në pozitën (A,B) dhe (B,A).

### Lista

### Krahasimi me kompleksitet

|            Operacioni            |      Listë e Bashkëlidhur (Adjacency List)       |             Matricë e Bashkëlidhur (Adjacency Matrix)             |
|:--------------------------------:|:------------------------------------------------:|:-----------------------------------------------------------------:|
|          Qasja në Edge           |    O(1) - Qasje direkte te qeliza e matricës     |        O(degree) - Kërko në listën e lidhur nëpermet edge         |
|       Adding/Removing Edge       |     O(1) - Përditësim i qelizës së matricës      |        O(degree) - Kërko në listën e lidhur nëpermet edge         |
| Verifikimi i ekzistencës së Edge |    O(1) - Qasje direkte te qeliza e matricës     |        O(degree) - Kërko në listën e lidhur nëpermet edge         |
|         Iterimi mbi anët         | O(V) - Kalim nëpër një rresht/kolonë të matricës | O(V + E) - Kalim nëpër listat e bashkëlidhjes së të gjitha nyjeve |
|      Efikasiteti i Memorisë      | Më pak efikas për grafe të rralla me më pak edge |           Më efikas për grafe të rralla me më pak edge            |

## Detyra

![Graph](https://github-production-user-asset-6210df.s3.amazonaws.com/50520333/239068551-a9cf0760-c64c-498a-9af8-c7e73dc24117.jpg?X-Amz-Algorithm=AWS4-HMAC-SHA256&X-Amz-Credential=AKIAIWNJYAX4CSVEH53A%2F20230517%2Fus-east-1%2Fs3%2Faws4_request&X-Amz-Date=20230517T201948Z&X-Amz-Expires=300&X-Amz-Signature=785819bcb5f84ec8ae7fe4ffa261b7c9ba8999388fe7956f12b0f2d70a9bf463&X-Amz-SignedHeaders=host&actor_id=50520333&key_id=0&repo_id=551454009)

![graph-matrica](https://github-production-user-asset-6210df.s3.amazonaws.com/50520333/239086251-0494650c-77aa-4776-92c7-8157361668f9.png?X-Amz-Algorithm=AWS4-HMAC-SHA256&X-Amz-Credential=AKIAIWNJYAX4CSVEH53A%2F20230517%2Fus-east-1%2Fs3%2Faws4_request&X-Amz-Date=20230517T215528Z&X-Amz-Expires=300&X-Amz-Signature=fb555cd883801ef16ee61ac79fac71346b2cdaf2a63bb2790b9c777e0de06045&X-Amz-SignedHeaders=host&actor_id=50520333&key_id=0&repo_id=551454009)
![graph-matrica-me-list](https://github-production-user-asset-6210df.s3.amazonaws.com/50520333/239073185-fc249d2f-aacf-445d-a822-432c345df38e.png?X-Amz-Algorithm=AWS4-HMAC-SHA256&X-Amz-Credential=AKIAIWNJYAX4CSVEH53A%2F20230517%2Fus-east-1%2Fs3%2Faws4_request&X-Amz-Date=20230517T204207Z&X-Amz-Expires=300&X-Amz-Signature=3f3e848b50b2d137f8cb1bc70cceed1ebdb0f6a2bcb01ece8aacefe92d4e33f9&X-Amz-SignedHeaders=host&actor_id=50520333&key_id=0&repo_id=551454009)

[//]: # (![20230517_221635]&#40;https://github.com/AlpetGexha/UPZ-TIT/assets/50520333/a9cf0760-c64c-498a-9af8-c7e73dc24117&#41;)
