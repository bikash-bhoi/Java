l1 = ['a','b','c','d']
print(l1[1])
# Lists are mutable
l1[1] = 'z'
print(l1)
print(len(l1))
print(range(5))

l2 = ['q','r','s']
l3 = l1 + l2
print(l3)
#Slicing
print(l3[2:5])
print(l3[:4])
print(l3[4:])
#building list
l4=list()
print(l4)
l4.append('first')
l4.append('2nd')
l4.append(3)
print(l4)
l4.remove('2nd')
print(l4)
l1.sort()
print(l1)