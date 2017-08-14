import re

name = "regex_sum_19602.txt"
handle = open(name)

try:
    fh = open(name, 'r')
except:
    print('File cannot be opened : ', name)
    quit()

# countsum = 0
# numlist = list()
# for line in fh:
#     line = line.rstrip()
#     nums = re.findall('[0-9]+', line)
#     if len(nums) != 0: numlist += nums
#
# for num in numlist: countsum += int(num)
# print(countsum)

print(sum([int(x) for x in re.findall('[0-9]+', fh.read())]))
