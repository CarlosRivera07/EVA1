print("Introduce el valor del numerador de la fracción 1:")
iFN1 = int(input())
print("Introduce el valor del denominador de la fraccion 1: ")
iFD1 = int(input())
print("Introduce el valor del numerador de la fracción 2: ")
iFN2 = int(input())
print("Introduce el valor del denominador de la fracción 2: ")
iFD2 = int(input())
print("Tus operaciones son: ")
print(str(iFN1) + str("/") + iFD1 + " + " + iFN2 + "/" + iFD2)
print(str(iFN1) + str("/") + iFD1 + " - " + iFN2 + "/" + iFD2)
print(str(iFN1) + str("/") + iFD1 + " * " + iFN2 + "/" + iFD2)
print(str(iFN1) + str("/") + iFD1 + " / " + iFN2 + "/" + iFD2)
iSuma1 = iFN1 * iFD2 + iFD1 * iFD2
iSuma2 = iFD1 * iFD2
print("El resultado de la suma es : ")
print(str(iSuma1) + str("/") + iSuma2)
iResta1 = iFN1 * iFD2 - iFD1 * iFD2
iResta2 = iFD1 * iFD2
print("El resultado de la resta es : ")
print(str(iResta1) + str("/") + iResta2)
iMultiplicacion1 = iFN1 * iFN2
iMultiplicacion2 = iFD1 * iFD2
print("El resultado de la multiplicación es : ")
print(str(iMultiplicacion1) + str("/") + iMultiplicacion2)
iDivision1 = iFN1 * iFD2
iDivision2 = iFD1 * iFN2
print("El resultado de la división es : ")
print(str(iDivision1) + str("/") + iDivision2)
