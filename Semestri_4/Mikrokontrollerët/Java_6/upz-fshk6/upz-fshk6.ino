#include <SPI.h>
#include <WiFi101.h>
#include <LiquidCrystal.h>

LiquidCrystal lcd(0, 1, 2, 3, 4, 5);

char ssid[] = "KREN";             //  your network SSID (name) between the " "
char pass[] = "krenkosova";      // your network password between the " "
int keyIndex = 0;                 // your network key Index number (needed only for WEP)
int status = WL_IDLE_STATUS;      //connection status
WiFiServer server(80);            //server socket

WiFiClient client = server.available();

int ledPin = 6;
String teksti = "";

void setup() {
  Serial.begin(9600);
  pinMode(ledPin, OUTPUT);
  while (!Serial);

  lcd.begin(16, 2); // If you have 20×4 LCD user (20,4)

  enable_WiFi();
  connect_WiFi();

  server.begin();
  printWifiStatus();
}

void loop() {
  client = server.available();
  
  if (client) {
    printWEB();
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

  Serial.print("To see this page in action, open a browser to http://");
  Serial.println(ip);
}

void enable_WiFi() {

  String fv = WiFi.firmwareVersion();
  if (fv < "1.0.0") {
    Serial.println("Please upgrade the firmware");
  }
}

void connect_WiFi() {
  // attempt to connect to Wifi network:
  while (status != WL_CONNECTED) {
    Serial.print("Attempting to connect to SSID: ");
    Serial.println(ssid);
    // Connect to WPA/WPA2 network. Change this line if using open or WEP network:
    status = WiFi.begin(ssid, pass);

    // wait 10 seconds for connection:
    delay(10000);
  }
}

void printWEB() {

  if (client) {                             // if you get a client,
    Serial.println("new client");           // print a message out the serial port
    String currentLine = "";                // make a String to hold incoming data from the client
    while (client.connected()) {            // loop while the client's connected
      if (client.available()) {             // if there's bytes to read from the client,
        char c = client.read();             // read a byte, then
        String txt =  String(c);
        teksti += txt;
        Serial.write(c);                    // print it out the serial monitor
        if (c == '\n') {                    // if the byte is a newline character

          // if the current line is blank, you got two newline characters in a row.
          // that's the end of the client HTTP request, so send a response:
          if (currentLine.length() == 0) {

            // HTTP headers always start with a response code (e.g. HTTP/1.1 200 OK)
            // and a content-type so the client knows what's coming, then a blank line:
            client.println("HTTP/1.1 200 OK");
            client.println("Content-type:text/html");
            client.println();

            //create the buttons
            client.print("Click <a href=\"/H\">here</a> turn the LED on<br>");
            client.print("Click <a href=\"/L\">here</a> turn the LED off<br><br>");
            // Add input field
            client.print("<form action=\"/text\" method=\"get\">");
            client.print("Text: <input type=\"text\" name=\"inputText\"><br>");
            client.print("<input type=\"submit\" value=\"Submit\">");
            client.print("</form>");


            // The HTTP response ends with another blank line:
            client.println();
            // break out of the while loop:
            break;
          }
          else {      // if you got a newline, then clear currentLine:
            currentLine = "";
          }
        }
        else if (c != '\r') {    // if you got anything else but a carriage return character,
          currentLine += c;      // add it to the end of the currentLine
        }
        Serial.println(currentLine);
        if (currentLine.endsWith("GET /H")) {
        digitalWrite(ledPin, HIGH);
        }
        if (currentLine.endsWith("GET /L")) {
        digitalWrite(ledPin, LOW);
        }

        // Check if the request includes text input
        if (currentLine.indexOf("GET /text?inputText=") != -1) {
          int startPos = currentLine.indexOf("GET /text?inputText=") + 20;
          int endPos = currentLine.indexOf("HTTP");
          String inputText = currentLine.substring(startPos, endPos);
          Serial.println("Input Text: " + inputText);

          // Display the input text on the LCD
          lcd.clear();
          lcd.setCursor(0, 0);
          lcd.print("Input Text: ");
          lcd.setCursor(0, 1);
          lcd.print(inputText);
        }

      }
    }
    Serial.println("lamir -" + teksti);
    // close the connection:
    client.stop();
    Serial.println("client disconnected");
  }
}