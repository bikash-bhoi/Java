data = 'From bhoi.bikash@gmail.com Sat Aug 12 03:53:10 2017'
atpos = data.find('@')
print('atpos:', atpos)
sppos = data.find(' ',atpos)
print('sppos:', sppos)
host = data[atpos + 1: sppos]
print('host:', host)
