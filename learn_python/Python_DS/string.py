fruit = 'Orange'
letter = fruit[1]
print(letter)
try:
    print(fruit[7])
except:
    print('Fatt gaya!')

print(len(fruit))

for letter in fruit: print(letter, end=' ')
print()
#Slicing

s='Sir Ravindra Jadeja'
print(s[4:10])
print(s[0:10])
print(s[0:10000])
print(s[:3])
print(s[4:])

print('hello' + ' ' + 'dude')

print('n' in fruit)
print('x' in fruit)
print('ange' in fruit)
# True
# False
# True
print(fruit.lower())
print(fruit.upper())
print(fruit.capitalize())
print(fruit.replace('n','m',2))
print(fruit.find('O'))
print(fruit.find('x'))
print(fruit.startswith('x'))
print(fruit.startswith('Or'))

