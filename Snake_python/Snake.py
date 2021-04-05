
#Los comentarios se realizan con el "#" - solo son de una linea 

"""
Los comentarios de mas de una linea se haran con tres comillas dobles igual que la sintaxis se debe cerrar
"""

print("Hello world")

x = 4
y = 3
z = 5

total = x + y 

#enteros var = int(numero)
enteros = int(2)
#String var = "texto"
String = "Esto es un String"
#String concatenable var = str(num)
concatenable = str(3)
#float var = float(numero)
Float = float(3)

#esta es una funcion 
def UnaFuncion():
    x = "esta es una variable global vuelta string "  
UnaFuncion()

def MiFuncion():
    #Esta es una variable global dentro de un metodo
    global var 
    var = 0

MiFuncion()

def metodoImpresion():
    print(var)
    print(x, y + z)    
metodoImpresion()

if x > y:
    print(total)
    print(enteros, String, concatenable, Float)
