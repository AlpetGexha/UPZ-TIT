#include <WiFi101.h> // for MKR1000

#include "DHT.h"
#include <Wire.h>

#define DHTPIN 2
#define DHTTYPE DHT11  
DHT dht(DHTPIN, DHTTYPE);

char ssid[] =      "KREN";           // network to join
char pass[] =      "krenkosova";     // password for wifi network

int status = WL_IDLE_STATUS;

char server[] = "upz-fshk.online";       // server URL

String postData;
String postVariable = "depth=";

WiFiClient client;

void setup() {

  // Start serial connection for feedback
  Serial.begin(9600);
  dht.begin();

  // Connect to WiFi
  while (status != WL_CONNECTED) {
    Serial.print("Attempting to connect to: ");
    Serial.println(ssid);
    status = WiFi.begin(ssid, pass);
    delay(10000);                         // wait 10 sec for connection
  }

  printWiFiStatus();
}


void loop() {

  // Readings
  int depth = 500;
  int bottleId = 11;

  postData = postVariable + depth;

  // Connect to php script at port 80
  if (client.connect(server, 80)) {
    Serial.println("Connected to server.");

    int temp = dht.readTemperature();
    int hum = dht.readHumidity();
    
    client.println("POST /index.php?temperature="+String(temp)+"&humidity="+String(hum)+"&deviceid=1 HTTP/1.1");
    client.print("Host: ");
    client.println(server);
    client.println("User-Agent: ArduinoWiFi/1.1");
    client.println("Connection: close");
    client.println("Content-Type: application/x-www-form-urlencoded;");
    client.print("Content-Length: ");
    String postEntity = String("");
    client.println(postEntity.length());
    client.println();
    client.println(postEntity);

    Serial.println("Data are saved.");
    delay(5000); 
   
  } else {
    Serial.println("Failed to connect to server.");
  }

  if (client.connected()) {
    client.stop();
  }
  Serial.println(postData);

  delay(3000);
}

void printWiFiStatus() {

  // print the SSID of the network you're attached to:
  Serial.print("SSID: ");
  Serial.println(WiFi.SSID());

  // print your board's IP address:
  IPAddress ip = WiFi.localIP();
  Serial.print("IP Address: ");
  Serial.println(ip);

  // print your subnet mask:
  IPAddress subnet = WiFi.subnetMask();
  Serial.print("NETMASK: ");
  Serial.println();

  // print your gateway address:
  IPAddress gateway = WiFi.gatewayIP();
  Serial.print("GATEWAY: ");
  Serial.println(gateway);

  // print the received signal strength:
  long rssi = WiFi.RSSI();
  Serial.print("signal strength (RSSI):");
  Serial.print(rssi);
  Serial.println(" dBm");

}