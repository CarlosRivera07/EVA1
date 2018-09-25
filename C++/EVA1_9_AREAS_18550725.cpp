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
    cout << "Ingresa el valor de la base mayor (B)" << endl;
    double rBmayor;
    
    cin >> rBmayor;
    cout << "Ingresa el valor de la base menor (b)" << endl;
    double rBmenor;
    
    cin >> rBmenor;
    cout << "Ingresa el valor de la altura (h)" << endl;
    double rAltura;
    
    cin >> rAltura;
    double rArea;
    
    rArea = (rBmayor + rBmenor) * rAltura / 2;
    cout << "El área de tu trapecio es: ";
    cout << rArea;
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
