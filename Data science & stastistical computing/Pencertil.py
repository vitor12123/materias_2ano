lista = [3,14,43,95,34,321,54,67,89,100]

lista.sort()
print(lista)

def percentil(list,p):
    percentil = (p/100) * (len(list) -1)
    if percentil % 1 != 0:
        p1 = int(percentil)
        percentilCpaCerto = (list[p1] + list[p1+1])/2
        
        return percentilCpaCerto
    else:
        return list[int(percentil)]

print(percentil(lista,25))
print(percentil(lista,75))