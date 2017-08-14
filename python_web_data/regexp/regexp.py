import re

name = "mbox-short.txt"
handle = open(name)

try:
    fh = open(name, 'r')
except:
    print('File cannot be opened : ', name)
    quit()

numlist = list()
for line in fh:
    line = line.rstrip()
    # if re.search('^From:',line):
    # if re.search('^X.*:',line):
    # if re.search('^X\S+:', line):
    #     print(line)

    nums = re.findall('^X-DSPAM-Confidence: ([0-9.]+)', line)
    if len(nums) != 1: continue
    numlist.append(float(nums[0]))
print(numlist)
print('Maximum: ',max(numlist))
