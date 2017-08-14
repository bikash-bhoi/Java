# for i in [5, 4, 2, 1]:
#     print(i)
# print('End')
#
# friends = ['dude','bro','man']
# for friend in friends:
#     print('Hello',friend)
# print('Done!')

largest = None
cnt = 0
total = 0
print('List :', '9, 3, 41, 12, 75, 11')
for num in [9, 3, 41, 12, 75, 11]:
    cnt = cnt + 1
    total = total + num
    if largest is None:
        largest = num
    if num > largest:
        largest = num
print('Largest :', largest)
print('count :', cnt)
print('Total :', total)
print('Average :', total/cnt)