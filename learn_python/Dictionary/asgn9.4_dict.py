# 9.4 Write a program to read through the mbox-short.txt and figure out who has the sent the greatest number of mail messages.
# The program looks for 'From ' lines and takes the second word of those lines as the person who sent the mail.
# The program creates a Python dictionary that maps the sender's mail address to a count of the number of times they appear in the file.
# After the dictionary is produced, the program reads through the dictionary using a maximum loop to find the most prolific committer.


fname = 'mbox-short.txt'
try:
    fh = open(fname, 'r')
except:
    print('File cannot be opened : ',fname)
    quit()
count = 0
dc = dict()
for line in fh:
    line = line.rstrip()
    if line.startswith('From '):
        count = count + 1
        ls = line.split()
        dc[ls[1]] = dc.get(ls[1],0) +1
fh.close()

maxmail = None
maxcnt = None
for k,v in dc.items():
    if maxcnt is None or v>maxcnt:
        maxmail = k
        maxcnt = v
print(maxmail,maxcnt)
