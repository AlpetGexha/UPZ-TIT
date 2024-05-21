#include <WiFi101.h> // for MKR1000

char ssid[] = "KREN";        // your network SSID (name)
char pass[] = "krenkosova";    // your network password (use for WPA, or use as key for WEP)

int ledPin = 2;

int status = WL_IDLE_STATUS;

//IPAddress server(74,125,232,128);  // numeric IP for Google (no DNS)
char server[] = "upz-fshk.online";    // name address for Google (using DNS)
String teksti = "";

WiFiClient client;

void setup() {

  //Initialize serial and wait for port to open:

  Serial.begin(9600);
  pinMode(ledPin, OUTPUT);
  while (!Serial) {

    ; // wait for serial port to connect. Needed for native USB port only

  }

  // attempt to connect to Wifi network:

  while (status != WL_CONNECTED) {

    Serial.print("Attempting to connect to SSID: ");

    Serial.println(ssid);

    status = WiFi.begin(ssid, pass);

    // wait 10 seconds for connection:
    delay(10000);

  }

  Serial.println("Connected to wifi");

  printWifiStatus();
  lidhuPerseri();
  
}


void loop() {

  while (client.available()) {

    char c = client.read();
    String txt =  String(c);
    teksti += txt;
    // Serial.print(c);
    Serial.write(c);

  }

  if (!client.connected()) {

    Serial.println();
    
    // client.stop();
    Serial.println(teksti);

    // Gjej fillimin dhe fundin e pjesës JSON
    int json_start = teksti.indexOf("[");
    int json_end = teksti.indexOf("]", json_start) + 1;

    // Nxirrni pjesën JSON nga përgjigja HTTP
    String json_data = teksti.substring(json_start, json_end);

    // Printoni pjesën JSON në Serial Monitor
    Serial.print("JSON data: ");
    Serial.println(json_data);

    // Përdorni një librari për analizë JSON ose mund të përdorni indekset dhe karakteret për të marrë vlerën e "data"
    // Për shembull, mund të përdorni indexOf() dhe substring() përsëri për të nxjerrë vlerën e "data".
    int data_start = json_data.indexOf("\"data\":\"") + 8;
    int data_end = json_data.indexOf("\"", data_start);
    String data_value = json_data.substring(data_start, data_end);

    // Printoni vlerën e "data" në Serial Monitor
    Serial.print("Data value: ");
    Serial.println(data_value);
    if (data_value == "1") {
        digitalWrite(ledPin, HIGH);
    }
    if (data_value == "0") {
    digitalWrite(ledPin, LOW);
    }

    // do nothing forevermore:
    teksti = "";
    
    // while (true);
    delay(3000);

    lidhuPerseri();

  }
}

void lidhuPerseri(){
  Serial.println("\nStarting connection to server...");
  
  // if you get a connection, report back via serial:

  if (client.connect(server, 80)) {

    Serial.println("connected to server");

    // Make a HTTP request:

    client.println("GET /index.php?led HTTP/1.1");

    client.print("Host: ");
    client.println(server);

    client.println("Connection: close");

    client.println();

    

  }
}

void printWifiStatus() {

  // print the SSID of the network you're attached to:

  Serial.print("SSID: ");

  Serial.println(WiFi.SSID());

  // print your board's IP address:

  IPAddress ip = WiFi.localIP();

  Serial.print("IP Address: ");

  Serial.println(ip);

  // print the received signal strength:

  long rssi = WiFi.RSSI();

  Serial.print("signal strength (RSSI):");

  Serial.print(rssi);

  Serial.println(" dBm");
}