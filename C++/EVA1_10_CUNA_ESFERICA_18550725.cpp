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
    cout << "Introduce el valor del radio: " << endl;
    double rRadio;
    
    cin >> rRadio;
    cout << "Introduce el angulo: " << endl;
    double rAngulo;
    
    cin >> rAngulo;
    double rVolumen;
    
    rVolumen = (double) 3 / 4 * (3.1416 * pow(rRadio, 3) / 360 * rAngulo);
    cout << "El volumen de la cuña es: ";
    cout << rVolumen;
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
