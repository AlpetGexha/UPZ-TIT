# VLAN

**VLAN** (_Virtual Local Area Network_) - eshte ndarja e nje switch te vetem fizik ne shume switch-a virtual.
VLAN janë të përdorura për të ndarë një rrjetin per grupe të ndryshme të pajisjeve, të cilat mund të komunikojnë mes tyre, por që janë të ndara nga pajisjet e tjera në rrjet.

VLAN: portet e switch-it grupohen ashtu që një switch i vetëm fizik operon si shumë switch-a virtualë

**Trunk Port**: bart kornizat mes VLAN-ve të definuar mbi disa switch-a fizikë (mes dy switch-ave nje port perdoret per bartjen e kornizave mes VLAN)

- 1 Router
- 3 Switcha
- 6 Pasisje te shtreses se 3t
- 2 Ndarje te VLAN

VLAN 1 ka IP-jat 192.168.0.x
VLAN 2 ka IP-jat 192.168.1.x

Secili switch e ka 1 pasije me nga 1 VLAN të ndryshem
Switch jane te lidhur nder veti me **Trunk Port** (qe ti mos i lidhim me nga 2 kabllo)
Dhe nje Paisje e shtreses se 3t (_Router_ apo _Switch Three Layer_)

`Paisjet`

I kemi 2 VLAN pra na nevoiten 2 Default Gateway
VLAN 1 - 192.168.0.1
VLAN 2 - 192.168.1.1

- E prekim 2 her Paisjen
- Shkojm te **Desktop** -> **IP Config**

IP Configuration

- `IP` - **192.168.VLAN.2+** (_192.168.0.2 per pasijen en VLAN 1_)
- `Subnet Mask` - **255.255.255.0**
- `Default Gateway` - **192.168.VLAN.1** (_192.168.0.1 per VLAN 1_)

<br /><br />

`Switch`

```c
Switch>enable

Switch#configure terminal

// Create VLAN 1
Switch(config)#vlan 1
Switch(config-vlan)#name VLAN1
Switch(config-vlan)#exit

// Create VLAN 2
Switch(config)#vlan 2
Switch(config-vlan)#name VLAN2
Switch(config-vlan)#exit

// configurate vlan first to interface
Switch(config)#interface fastEthernet 0/1
Switch(config-if)#switchport access vlan VLAN1
Switch(config-if)#exit

// configurate second vlan to interface
Switch(config)#interface fastEthernet 0/2
Switch(config-if)#switchport access vlan VLAN2
Switch(config-if)#exit

// trunk mode for switch
Switch(config)#interface fastEthernet 0/3
Switch(config-if)#switchport mode trunk
Switch(config-if)#exit

// Save configuration
Switch#copy running-config startup-config
```

- `enable` (en) - Moda Globale

- `copy running-config startup-config` - I përdor konfigurimet edhe pas ndales se paisjes (kjo shkruhet ne fund te configurimeve)

Configurimi Local

- `confing terminal` (conf t) - Configurimi local (per switch)

- `vlan NAME` - Krijim i VLAN

- `exit` - me dal nga configurimi momental

Konfigurimi i Kompjutereve

- `interface fastEthernet 0/1` (int fe 0/1) - Configurimi i portit (PC, Server ...)

- `switchport access vlan NAME` - I jep paisjes aksesin per perdorimin e VLAN-it që dëshirojm

- `switchport mode trunk` - Ndërlidhja e kornizave të switchave

<br /><br />

`Router`

```c
Router>enable

Router#configure terminal

Router(config)#interface fastEthernet 0/0
Router(config-if)#no shutdown
Router(config-if)#exit

Router(config)#interface fastEthernet 0/0.1
Router(config-subif)#encapsulation dot1Q 10
Router(config-subif)#ip address 192.168.0.254/24
Router(config-subif)#no shutdown
Router(config-subif)#exit


Router(config)#interface fastEthernet 0/0.2
Router(config-subif)#encapsulation dot1Q 20
Router(config-subif)#ip address 192.168.1.254/24
Router(config-subif)#no shutdown
Router(config-subif)#exit
```

- `no shutdown` - Aktivizon portin

- `encapsulation dot1Q 10` - Krijon VLAN 10

- `ip address IP/MASK` - Ipja per dot1Q


![image](https://user-images.githubusercontent.com/50520333/233220425-df5b3ffe-8cab-43e4-bce7-e73ce089a1ad.png)
