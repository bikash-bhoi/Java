# 10.2 Write a program to read through the mbox-short.txt and figure out the distribution by hour of the day for each of the messages.
# You can pull the hour out from the 'From ' line by finding the time and then splitting the string a second time using a colon.
# From stephen.marquard@uct.ac.za Sat Jan  5 09:14:16 2008
# Once you have accumulated the counts for each hour, print out the counts, sorted by hour as shown below.

name = ''
if len(name) < 1: name = "mbox-short.txt"
handle = open(name)

try:
    fh = open(name, 'r')
except:
    print('File cannot be opened : ', name)
    quit()
count = 0
dc = dict()
for line in fh:
    line = line.rstrip()
    if line.startswith('From '):
        count = count + 1
        hr = line.split()[5].split(':')[0]
        dc[hr] = dc.get(hr, 0) + 1
fh.close()

for k, v in sorted(dc.items()):
    print(k, v)
