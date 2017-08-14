# x = 5
# if x < 10:
#     print('Small')
#     print('still')
#     print('www')
# if x > 20: print('Big')
#
# print('Finish')

for i in range(5):
    print(i)
    if i > 2:
        print('Bigger than 2')
    elif i == 2:
        print('Equal to 2')
    else:
        print('Not Bigger than 2')
    print('Done with i', i)
print('Done')
