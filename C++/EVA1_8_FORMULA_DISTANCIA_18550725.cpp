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
    cout << "Introduce la Velocidad Inicial: ";
    double rVelin;
    
    cin >> rVelin;
    cout << "Introduce la Velocidad Final: ";
    double rVelfin;
    
    cin >> rVelfin;
    cout << "Introduce el Tiempo: ";
    double rTiempo;
    
    cin >> rTiempo;
    double rDistancia;
    
    rDistancia = (rVelin + rVelfin) / 2 * rTiempo;
    cout << "La distancia que recorrio es: " << endl;
    cout << rDistancia;
    cout << "m/s";
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
