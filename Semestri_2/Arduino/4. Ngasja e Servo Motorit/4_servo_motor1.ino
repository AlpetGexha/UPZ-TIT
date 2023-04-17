#include <Servo.h>

Servo Servo_1;
Servo Servo_2;

const int SENSOR_PIN_1 = A0;
const int SENSOR_PIN_2 = A1;
const int DEFAULT_WAIT = 600;

void setup() {
    Servo_1.attach(10, 500, 2500);
    Servo_2.attach(4, 500, 2500);

    pinMode(SENSOR_PIN_1, INPUT);
    pinMode(SENSOR_PIN_2, INPUT);
}

void loop() {
    // Servo e par
    for (int i = 0; i <= 90; i++) { // me shku
        int sensorValue1 = map(analogRead(SENSOR_PIN_1), 0, 1023, 1, 180);
        Servo_1.write(i);
        delay(sensorValue1);
    }
    delay(DEFAULT_WAIT);

    for (int j = 90; j >= 0; j--) { // mu kthy
        int sensorValue1 = map(analogRead(SENSOR_PIN_1), 0, 1023, 1, 180);
        Servo_1.write(j);
        delay(sensorValue1);
    }
    delay(DEFAULT_WAIT);

    // Second servo
    for (int i = 0; i <= 180; i++) { // me shku
        int sensorValue2 = map(analogRead(SENSOR_PIN_2), 0, 1023, 1, 90);
        Servo_2.write(i);
        delay(sensorValue2);
    }
    delay(DEFAULT_WAIT);

    for (int j = 180; j >= 0; j--) { // mu kthy
        int sensorValue2 = map(analogRead(SENSOR_PIN_2), 0, 1023, 1, 90);
        Servo_2.write(j);
        delay(sensorValue2);
    }

    delay(DEFAULT_WAIT);
}