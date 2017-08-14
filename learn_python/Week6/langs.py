def greet(lang):
    if lang == 'es':
        print('Hola')
    elif lang == 'fr':
        print('Bonjour')
    else:
        print('Hello')


greet('en')
greet('es')
greet('fr')


def greet():
    return 'Hello'


print(greet(), "Dude")


def add(a, b): return a + b

print(add(2,3))
print(add('a','b'))