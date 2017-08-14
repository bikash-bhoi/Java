# str = "there are five words here"
# lstr=str.split()
# print(lstr)
#
# dlstr = "1,2,3,4,5,abcd"
# lstr=dlstr.split(',')
# print(lstr)

fname = 'mboxs.txt'
try:
    fh = open(fname, 'r')
except:
    print('File cannot be opened : ',fname)
    quit()
# print(fh)

# for line in fh: print(line)

count = 0
# for line in fh: count = count + 1
# print('Line Count : ', count)

# inp = fh.read()
# print(inp)

# print(inp[:100])

for line in fh:
    line = line.rstrip()
    if line.startswith('From '):
        # print(line)
        ls = line.split()
        print(ls[1])
        print(ls[1].split('@')[1])
fh.close()