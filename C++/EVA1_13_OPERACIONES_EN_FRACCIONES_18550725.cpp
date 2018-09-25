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
    cout << "Introduce el valor del numerador de la fracción 1:" << endl;
    int iFN1;
    
    cin >> iFN1;
    cout << "Introduce el valor del denominador de la fraccion 1: " << endl;
    int iFD1;
    
    cin >> iFD1;
    cout << "Introduce el valor del numerador de la fracción 2: " << endl;
    int iFN2;
    
    cin >> iFN2;
    cout << "Introduce el valor del denominador de la fracción 2: " << endl;
    int iFD2;
    
    cin >> iFD2;
    cout << "Tus operaciones son: " << endl;
    cout << iFN1 << "/" << iFD1 << " + " << iFN2 << "/" << iFD2 << endl;
    cout << iFN1 << "/" << iFD1 << " - " << iFN2 << "/" << iFD2 << endl;
    cout << iFN1 << "/" << iFD1 << " * " << iFN2 << "/" << iFD2 << endl;
    cout << iFN1 << "/" << iFD1 << " / " << iFN2 << "/" << iFD2 << endl;
    int iSuma1;
    
    iSuma1 = iFN1 * iFD2 + iFD1 * iFD2;
    int iSuma2;
    
    iSuma2 = iFD1 * iFD2;
    cout << "El resultado de la suma es : " << endl;
    cout << iSuma1 << "/" << iSuma2 << endl;
    int iResta1;
    
    iResta1 = iFN1 * iFD2 - iFD1 * iFD2;
    int iResta2;
    
    iResta2 = iFD1 * iFD2;
    cout << "El resultado de la resta es : " << endl;
    cout << iResta1 << "/" << iResta2 << endl;
    int iMultiplicacion1;
    
    iMultiplicacion1 = iFN1 * iFN2;
    int iMultiplicacion2;
    
    iMultiplicacion2 = iFD1 * iFD2;
    cout << "El resultado de la multiplicación es : " << endl;
    cout << iMultiplicacion1 << "/" << iMultiplicacion2 << endl;
    int iDivision1;
    
    iDivision1 = iFN1 * iFD2;
    int iDivision2;
    
    iDivision2 = iFD1 * iFN2;
    cout << "El resultado de la división es : " << endl;
    cout << iDivision1 << "/" << iDivision2 << endl;
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
