#include <OneWire.h>
#include <DallasTemperature.h>

#define ONE_WIRE_BUS 2  // DS18B20 pin
OneWire oneWire(ONE_WIRE_BUS);
DallasTemperature DS18B20(&oneWire);

void setup() {
  // Start serial communication for debugging purposes
  Serial.begin(9600);
  // Start up the library
  DS18B20.begin();

}

void loop() {
  
    float temp;
    
    DS18B20.requestTemperatures(); 
    temp = DS18B20.getTempCByIndex(0);
    
    if (isnan(temp)) {
      Serial.println("Failed to read from DS18B20 sensor!");
      return;  
    }
    else
    {
      Serial.println("DS18B20 sensor temperature - " + String(temp));
    }

    delay(30000); // 1000 -waits for a second

}
