# RIP (Routing Information Protocol)

**RIP** (_Routing Information Protocol_) - është protokoll rrutimi dinamik i përdorur në rrjetat kompjuterike.

**RIP** përdor algoritmin Bellman-Ford për të gjetur rrugën më të mirë për t'u përdorur në rrjetin e komunikimit.

Megjithëse RIP është një protokoll rrutimi i thjeshtë dhe i lehtë për të konfiguruar, ka disa kufizime. Një kufizim kryesor është se RIP mbështet vetëm një maksimum prej 15 hop-esh.

Ky kufizim e bën të padezirueshëm për rrjetat e mëdha ose komplekse. RIP gjithashtu nuk jep prioritet për metrika të ndryshme të trafikut, duke e bërë të vështirë për të zgjedhur rrugën më të mirë për t'i dërguar paketat.

| Version 1                                                | Version 2                                         |
| -------------------------------------------------------- | ------------------------------------------------- |
| Classfull Routing                                        | Classless Routing                                 |
| VLSM Not Supported                                       | VLSM Supported                                    |
| Update Message is sent to Local Subnet Boradcast Address | Update Message is sent to Multicast Address       |
| No Authentication support is available                   | Support availbe Plain Text and MD5 Authentication |

**VLSM** - stands for variable length subnet mask and is a concept that is used to divide a network into multiple subnetworks of different lengths


### Skema

![image](https://github.com/AlpetGexha/UPZ-TIT/assets/50520333/8c73b8ef-ad1e-45c1-a199-cd802dac0236)



Configurimi per `R0`

> **Note** Nuk duhet te kemi configurime te ruterave statik

```c
R0> en
R0# conf t

R0(config)# router rip
R0(config-router)# version 2
R0(config-router)# network <ip> <mask>
R0(config-router)# no auto-summary
```

Dhe ne fund e ruajm configruimin: 
```c
R0# copy running-config startup-config
```

- `network` - Networkat qe i kemi afer

- `no auto-summary` - Mos i grubullo subnetat



