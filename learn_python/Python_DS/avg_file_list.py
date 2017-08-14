fname = input("Enter file name: ")
try:
    fh = open(fname, 'r')
except:
    print('File cannot be opened : ', fname)
    quit()
ls = list()
for line in fh:
    if line.startswith("X-DSPAM-Confidence:"):
        colpos = line.find(':')
        strconf = line[colpos+1 : ]
        try:
            conf = float(strconf.rstrip())
            ls.append(conf)
        except:
            conf = 0
            # print(conf,aggr,count)
print('Average spam confidence:',sum(ls)/len(ls))
