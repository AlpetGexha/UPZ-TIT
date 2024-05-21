#include <Servo.h>

Servo myservo; // create servo object to control a servo
// twelve servo objects can be created on most boards

int pos; // variable to store the servo position
int pos1 = 1;

void setup () {
  myservo.attach (4); // attaches the servo on pin 9 to the servo object
  Serial.begin (9600);
}


void loop () {
  Serial.print (pos);
  if (pos1 == 1) {
    for (pos = 0; pos <= 180; pos += 1) {// goes from 0 degrees to 180 degrees
        // in steps of 1 degree
        myservo.write (pos); // tell servo to go to position in variable 'pos'
        delay (15); // waits 15ms for the servo to reach the position
    }
    // for(pos = 180; pos>=1; pos-=1)     // goes from 180 degrees to 0 degrees 
    // {                                
    //   myservo.write(pos);              // tell servo to go to position in variable 'pos' 
    //   delay(15);                       // waits 15ms for the servo to reach the position 
    // } 
  }  
  if (pos == 181) {
    pos1 = 0;
  }
}