var a = '';
var b = '';
var num = [];

const screen = document.getElementById('screen');



function sendNumber(digit) {
    num.push(digit);

    if (num.length != 1) {
        a = ''
        screen.innerHTML = a;
    }

    for (let i = 0; i < num.length; i++) {
        a += num[i];
    }

    screen.innerHTML = a;
}

function equalTo() {
    screen.innerHTML = '';

    for (let i = 0; i < num.length; i++) {
        b += num[i];
    }

    rez = eval(b);
    screen.innerHTML = rez;
}

function ac() {
    screen.innerHTML = '0';
    a = '';
    b = '';
    num = [];
}

function c() {
    num.pop();
    a = '';

    screen.innerHTML = '';
    for (let i = 0; i < num.length; i++) {
        a += num[i];
    }

    screen.innerHTML = a;
}