const int LED_1 = 13;
const int LED_2 = 6;

void setup()
{
  pinMode(LED_1, OUTPUT);
  pinMode(LED_2, OUTPUT);
  pinMode(A0, INPUT);
  pinMode(A1, INPUT);

  Serial.begin(9600);
}

void loop()
{
  int sensorValue;
  sensorValue = analogRead(A0);
  analogWrite(LED_1, map(sensorValue, 0, 1023, 0, 255)); // map the sensor value to a range of 0-255


  int sensorValue2;
  sensorValue2 = -analogRead(A1);
  analogWrite(LED_2, map(sensorValue2, 0, 1023, 0, 255)); // map the sensor value to a range of 0-255

  String output = "Sen 1: " + String(sensorValue) + " Sen 2: " + String(sensorValue2);
  Serial.println(output);

}
