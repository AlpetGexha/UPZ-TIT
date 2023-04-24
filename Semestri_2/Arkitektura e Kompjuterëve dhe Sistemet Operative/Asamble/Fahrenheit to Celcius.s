.data
str1: .asciiz "Shkruaj temperaturen në Celsius: "
str2: .asciiz "Temperatura në Fahrenheit: "
.globl main

.text
main:
# Hapi 1: Printo mesazhin e per Celsius
li $v0, 4 # syscall code per pritimin e stringut
la $a0, str1 # load adresen e strikut per te printuar $a0
syscall # printo stringun

# Hapi 2: Lexo temperaturen ne Celsius nga inputi
li $v0, 5 # syscall code per leximin e numrit
syscall # read integer në $v0
move $s0, $v0 # store temperature në $s0

#F = (C * 9/5) + 32
# Hapi 3: Konvertu Celsius to Fahrenheit
li $t0, 9 # load 9 në $t0
mul $t1, $s0, $t0 # shumëzo Celsius me 9
div $t2, $t1, 5 # pjesot me 5
addi $s1, $t2, 32 # shto 32 ne rezulata

# Hapi 4: Printo mesazhin per 
li $v0, 4 # syscall code per te printuar stringun
la $a0, str2 # load adresen e strikut per te printuar $a0
syscall # printo stringun

# Hapi 5: Printo temperaturen në Fahrenheit
li $v0, 1 # syscall code per printimin e integerit
move $a0, $s1 # move temperaturen e Fahrenheit në $a0
syscall # printo integerin

# Hapi 6: Mbylle programin
li $v0, 10 
syscall 
