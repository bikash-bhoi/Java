# tp = (1,4,6)
#
# print(dir(tp))
#
# (a,b) = (2,'aaa')
# (a,b,c) = (2,'aaa','heyy')
# print(a,b,c)

fname = 'mbox-short.txt'
try:
    fh = open(fname, 'r')
except:
    print('File cannot be opened : ', fname)
    quit()
count = 0
dc = dict()
tmp = list()
for line in fh:
    line = line.rstrip()
    if line.startswith('From '):
        count = count + 1
        ls = line.split()
        dc[ls[1]] = dc.get(ls[1], 0) + 1
fh.close()

# for k, v in dc.items():
#     tmp.append((v, k))
# tmp = sorted(tmp, reverse=True)

tmp = sorted([(v, k) for (k, v) in dc.items()], reverse=True)

for k, v in tmp[:5]:
    print(v, k)
