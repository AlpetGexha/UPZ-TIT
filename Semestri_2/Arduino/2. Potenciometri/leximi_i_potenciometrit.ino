const int DEFAULT_WAIT_TIME = 1000;

const int leds[] = {
  7, 5, 3, 1
};

int waitTimes[] = {
  0, 0, 0, 0
};

void setup() {
  
  for (int i = 0; i < 4; i++) {
    pinMode(leds[i], OUTPUT);
  }

}

void loop() {
  
  for (int i = 0; i < 4; i++) {
    waitTimes[i] = map(analogRead(A3 - i), 0, 1023, 0, 1000);
    digitalWrite(leds[i], HIGH);
    delay(waitTimes[i] + DEFAULT_WAIT_TIME);
    digitalWrite(leds[i], LOW);
  }
  
  delay(1000);
}
