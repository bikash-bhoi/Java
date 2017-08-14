# bag = dict()
# bag['money'] = 132
# bag['candy'] = 2
# bag['tissue'] = 12
#
# print(bag)
# print(bag['money'])
#
# d1 = {'axe': 1, 'bat': 2, 'super': 3}
# print(d1)
#
# print()
# print()
# d1 = {'axe': 1, 'bat': 2, 'super': 3}
# print(d1)
# print(list(d1))
# print(d1.keys())
# print(d1.values())
# print(d1.items())

fname = 'words.txt'
try:
    fh = open(fname, 'r')
except:
    print('File cannot be opened : ', fname)
    quit()
dc = dict()
for line in fh:
    line = line.rstrip()
    words = line.split()
    for word in words:
        # if word not in dc:
        #     dc[word] = 1
        # else:
        #     dc[word] += 1
        dc[word] = dc.get(word, 0) + 1

# for key in dc:
#     print(key, dc[key])
maxcnt = None
maxword = None

for k, v in dc.items():
    if maxcnt is None or v > maxcnt:
        maxword = k
        maxcnt = v
print(maxword,maxcnt)
