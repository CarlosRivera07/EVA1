#include <iostream>
#include <sstream>
#include <string>
#include <cstdlib>
#include <cmath>

using namespace std;

// Headers
string toString (double);
int toInt (string);
double toDouble (string);

int main() {
    cout << "Ingresa el valor de x1: " << endl;
    double rX1;
    
    cin >> rX1;
    cout << "Ingresa el valor de y1: " << endl;
    double rY1;
    
    cin >> rY1;
    cout << "Ingresa el valor de x2: " << endl;
    double rX2;
    
    cin >> rX2;
    cout << "Ingresa el valor de y2: " << endl;
    double rY2;
    
    cin >> rY2;
    double rPendiente;
    
    rPendiente = (rY2 - rY1) / (rX2 - rX1);
    cout << "El valor de la pendiente es: ";
    cout << rPendiente << endl;
    return 0;
}

// The following implements type conversion functions.
string toString (double value) { //int also
    stringstream temp;
    temp << value;
    return temp.str();
}

int toInt (string text) {
    return atoi(text.c_str());
}

double toDouble (string text) {
    return atof(text.c_str());
}
