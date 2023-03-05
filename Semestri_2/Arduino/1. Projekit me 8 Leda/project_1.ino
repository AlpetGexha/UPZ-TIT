const int led_pin[] = {
    1,2,3,4,6,8,11,13
};

void setup() {

    for (int pins: led_pin) {
        pinMode(pins, OUTPUT);
    }

}

void loop() {

  /* test
    for (int i = 0; i < sizeof(led_pin); i++) {
        digitalWrite(led_pin[i], HIGH);
        delay(500);

        digitalWrite(led_pin[i - 1], LOW);
        delay(500);
    }
   */

    for (int pins: led_pin) {
        digitalWrite(pins, HIGH);
        delay(500);
    }

    for (int pins: led_pin) {
        digitalWrite(pins, LOW);
        delay(500);
    }

}