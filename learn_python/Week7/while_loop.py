# n=5
# while n>0:
#     print(n)
#     n=n-1
# print('End')
# print(n)

while True:
    line=input('> ')
    if line[0] =='#':
        continue
    if line =='done':
        break
    print(line)
print('Done!')