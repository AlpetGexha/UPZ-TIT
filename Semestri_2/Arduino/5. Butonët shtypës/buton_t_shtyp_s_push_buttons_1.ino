int buttonStatus_1 = 0;
int buttonStatus_2 = 0;

int const LED_1 = 8;
int const LED_2 = 4;

int const BUTTON_1 = 12;
int const BUTTON_2 = 5;

void setup() {
    pinMode(BUTTON_1, INPUT);
    pinMode(BUTTON_2, INPUT);

    pinMode(LED_1, OUTPUT);
    pinMode(LED_2, OUTPUT);
}

void loop() {
    buttonStatus_1 = digitalRead(BUTTON_1);

    if (buttonStatus_1 == HIGH)
        digitalWrite(LED_1, HIGH);

    else
        digitalWrite(LED_1, LOW);

    delay(10);

    buttonStatus_2 = digitalRead(BUTTON_2);

    if (buttonStatus_2 == HIGH)
        digitalWrite(LED_2, HIGH);

    else
        digitalWrite(LED_2, LOW);

    delay(10);
}