import urllib.request, urllib.parse, urllib.error

fh = urllib.request.urlopen('https://en.wikipedia.org/wiki/Pietrasze,_Go%C5%82dap_County')
for line in fh:
    print(line.decode().rstrip())