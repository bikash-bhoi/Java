# astr='Hello man'
# try:
#     print('before Traceback')
#     istr=int(astr)
#     print('after Traceback')
# except:
#     istr=-1
# print('First',istr)
#
# astr='123'
# try:
#     print('before Traceback')
#     istr=int(astr)
#     print('after Traceback')
# except:
#     istr=-1
# print('First',istr)


rawstr = input('Enter a Number:')
try:
    ival=int(rawstr)
except:
    ival=-1

if ival>0:
    print('Positive')
else:
    print('Not a Number')