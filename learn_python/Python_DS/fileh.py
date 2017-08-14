fname = input('Enter File Name : ')
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
    if line.startswith('From:'): count = count+1

print('Total mails : ',count)

fh.close()