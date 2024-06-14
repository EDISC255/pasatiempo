import random as r

print("introduce el numero de votos")
votos=int(input())
print("introduce la catidad de posibles elecciones")
elecciones=int(input())

votos_elejidos=[]
i=0


while (elecciones>0):
    
    i=i+1
    
    print(i)

    partido=int(r.random()*votos)

    votos_reciduales=votos-partido

    print(partido)

    print(votos_reciduales)

    votos=votos_reciduales

    elecciones=elecciones-1

